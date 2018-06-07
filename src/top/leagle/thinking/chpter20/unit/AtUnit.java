package top.leagle.thinking.chpter20.unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class AtUnit {
	static List<String> failedTests = new ArrayList<>();
	static long testRun = 0;
	static long failures = 0;

	public static void unit(Class<?> testClass) {
		TestMethods testMethods = new TestMethods();
		Method creator = null;
		Method cleanup = null;

		for (Method m : testClass.getDeclaredMethods()) {
			testMethods.addIfTestMethod(m);
			if (creator == null) {
				creator = checkForCreatorMethod(m, testClass);
			}

			if (cleanup == null) {
				cleanup = checkForCleanupMethod(m, testClass);
			}
		}

		if (testMethods.size() > 0) {
			if (creator == null) {
				try {
					if (!Modifier.isPublic(testClass.getDeclaredConstructor().getModifiers())) {
						System.out
								.println("Error: " + testClass.getSimpleName() + " default constructor must be public");
						return;
					}
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
			}
			System.out.println(testClass.getSimpleName());
		}

		for (Method m : testMethods) {
			System.out.println("\n  . " + m.getName() + " ");
			try {
				Object testObject = createTestObject(creator, testClass);
				boolean success = false;
				try {
					if (m.getReturnType().equals(boolean.class)) {
						success = (boolean) m.invoke(testObject);
					} else {
						m.invoke(testObject);
						success = true;
					}
				} catch (InvocationTargetException e) {
					System.out.println(e.getCause());
				}

				System.out.print(success ? "" : "(failed)\n");
				testRun++;
				if (!success) {
					failures++;
					failedTests.add(testClass.getSimpleName() + ":" + m.getName());
				}

				if (cleanup != null) {
					cleanup.invoke(testObject, testObject);
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	static class TestMethods extends ArrayList<Method> {
		private static final long serialVersionUID = 1L;

		void addIfTestMethod(Method m) {
			if (m.getAnnotation(Test.class) == null) {
				return;
			}
			if (!(m.getReturnType().equals(boolean.class) || m.getReturnType().equals(void.class))) {
				throw new RuntimeException("@Test method must return boolean or void");
			}
			m.setAccessible(true);
			add(m);
		}
	}

	private static Method checkForCreatorMethod(Method m, Class<?> testClass) {
		if (m.getAnnotation(TestObjectCreate.class) == null) {
			return null;
		}

		if (!m.getReturnType().equals(testClass)) {
			throw new RuntimeException("@TestObjectCreate must return instance of Class to be tested");
		}

		if ((m.getModifiers() & Modifier.STATIC) < 1) {
			throw new RuntimeException("@TestObjectCreate must be static");
		}

		m.setAccessible(true);
		return m;
	}

	private static Method checkForCleanupMethod(Method m, Class<?> testClass) {
		if (m.getAnnotation(TestObjectCleanup.class) == null) {
			return null;
		}

		if (!m.getReturnType().equals(void.class)) {
			throw new RuntimeException("@TestObjectCleanup method must return void");
		}

		if ((m.getModifiers() & Modifier.STATIC) < 1) {
			throw new RuntimeException("@TestObjectCleanup must be static");
		}

		if (m.getParameterTypes().length == 0 || m.getParameterTypes()[0] != testClass) {
			throw new RuntimeException("@TestObjectCleanup must take an argument of the tested type.");
		}
		m.setAccessible(true);
		return m;
	}

	private static Object createTestObject(Method creator, Class<?> testClass) {
		if (creator != null) {
			try {
				return creator.invoke(testClass);
			} catch (Exception e) {
				throw new RuntimeException("Couldn't run @TestObject(creator) method");
			}
		} else {
			try {
				return testClass.newInstance();
			} catch (Exception e) {
				throw new RuntimeException("Couldn't create a test object. try using a @TestObject method.");
			}
		}
	}

	public static void main(String[] args) {
		AtUnit.unit(AtUnitExample5.class);
	}
}
