package top.leagle.basic.equal;

import org.junit.Test;

public class EqualTest {

	@Test
	public void test1() {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2);
	}

	@Test
	public void test2() {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str2;

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	}

	@Test
	public void test3() {
		String s1 = "Hello";
		String s2 = new String("Hello");
		s2 = s2.intern();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	@Test
	public void test4() {
		Student student1 = new Student("生命壹号", 22, "成都");
		Student student2 = new Student("生命壹号", 22, "成都");
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
	}
}

class Student {
	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		// 如果内存地址相等，那么一定是同一个对象，就无需比较两个对象的属性值
		if (this == obj) {
			return true;
		} // 判断obj是否为Baboon类型的实例
		if (obj instanceof Student) {
			Student b = (Student) obj;// 强制转换
			// 判断两个对象的属性值是否相等
			if (!this.name.equals(b.name)) {
				return false;
			} else if (this.age != b.age) {
				return false;
			} else if (this.address != b.address) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
