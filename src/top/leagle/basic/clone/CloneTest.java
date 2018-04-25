package top.leagle.basic.clone;

import org.junit.Test;

class Student {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

class StudentWithClone implements Cloneable {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public Object clone() {
		StudentWithClone stu = null;
		try {
			stu = (StudentWithClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return stu;
	}

}

class StudentWithClone2 implements Cloneable {
	private int number;
	private String string;
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public Object clone() {
		StudentWithClone2 stu = null;
		try {
			stu = (StudentWithClone2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return stu;
	}

}

public class CloneTest {

	@Test
	public void test1() {
		Student stu1 = new Student();
		stu1.setNumber(12345);
		Student stu2 = stu1;

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());

		stu2.setNumber(54321);
		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
	}

	@Test
	public void test2() {
		StudentWithClone stu1 = new StudentWithClone();
		stu1.setNumber(12345);
		StudentWithClone stu2 = (StudentWithClone) stu1.clone();

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());

		stu2.setNumber(54321);

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
	}

	@Test
	public void test3() {
		StudentWithClone2 stu1 = new StudentWithClone2();
		String string = new String("123");
		stu1.setNumber(12345);
		stu1.setString(string);
		StudentWithClone2 stu2 = (StudentWithClone2) stu1.clone();

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
		System.out.println("ѧ��1:" + stu1.getString());
		System.out.println("ѧ��2:" + stu2.getString());

		stu2.setNumber(54321);
		string = "321";

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
		System.out.println("ѧ��1:" + stu1.getString());
		System.out.println("ѧ��2:" + stu2.getString());
	}

	@Test
	public void test4() {
		StudentWithClone2 stu1 = new StudentWithClone2();
		Student student = new Student();
		student.setNumber(666);
		stu1.setNumber(12345);
		stu1.setStudent(student);
		StudentWithClone2 stu2 = (StudentWithClone2) stu1.clone();

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
		System.out.println("ѧ��1:" + stu1.getStudent().getNumber());
		System.out.println("ѧ��2:" + stu2.getStudent().getNumber());

		stu2.setNumber(54321);
		student.setNumber(888);

		System.out.println("ѧ��1:" + stu1.getNumber());
		System.out.println("ѧ��2:" + stu2.getNumber());
		System.out.println("ѧ��1:" + stu1.getStudent().getNumber());
		System.out.println("ѧ��2:" + stu2.getStudent().getNumber());

	}
}
