package top.leagle.basic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReflectTest {

	@Test
	public void test1() {
		Person person = new Person("小明", 10001);
		person.Speak();
		person.run("10");
		Method m1 = null;
		Method m2 = null;
		Method m3 = null;
		try {
			m1 = person.getClass().getMethod("Speak", null);
			m2 = person.getClass().getMethod("run", String.class);
			m3 = person.getClass().getMethod("info", String.class, int.class);

			System.out.println(m1);
			m1.invoke(person, null);
			System.out.println(m2);
			m2.invoke(person, "---");
			System.out.println(m3);
			List<Object> list = new ArrayList<Object>();
			list.add("hello");
			list.add(4);
			m3.invoke(person, list.toArray());

			System.out.println(list);
			System.out.println(list.toArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		Object clazz = ReflectTest.class;
		System.out.println(clazz.getClass().getName());
	}

}

class Person {
	private String name;
	private int ID;
	public String speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Person(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public void Speak() {
		System.out.println("Hello! " + "My name is " + name);
	}

	public void run(String speed) {
		System.out.println("I can run " + speed + " KM!!!");
	}

	public void info(String name, int ID) {
		System.out.println("name:" + name + " id:" + ID);
	}
}