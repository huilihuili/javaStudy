package top.leagle.thinking.chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class ClassStudy {

	@Test
	public void test1() {
		try {
			Class<?> classStudy = Class.forName("top.leagle.thinking.chapter14.ClassStudy");
			System.out.println("Class.forName() : " + classStudy.getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class<ClassStudy> classStudy = ClassStudy.class;
		System.out.println(".class : " + classStudy.getSimpleName());

		Class<?> classStudy1 = new ClassStudy().getClass();
		System.out.println(".classStudy1 : " + classStudy1.getSimpleName());
	}

	static void test(Object x) {
		System.out.println("Testing x of type " + x.getClass());
		System.out.println("x instanceof Base " + (x instanceof Base));
		System.out.println("x instanceof Derived " + (x instanceof Derived));
		System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
		System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
		System.out.println("x.getClass() == Base.class " + (x.getClass() == Base.class));
		System.out.println("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
		System.out.println("x.getClass().equals(Base.class)) " + (x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals(Derived.class)) " + (x.getClass().equals(Derived.class)));
		System.out.println();
	}

	@Test
	public void test2() {
		test(new Base());
		test(new Derived());
	}



}

class Base {
}

class Derived extends Base {
}

