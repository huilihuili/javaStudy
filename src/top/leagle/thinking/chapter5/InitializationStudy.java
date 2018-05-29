package top.leagle.thinking.chapter5;

import org.junit.Test;

public class InitializationStudy {

	@Test
	public void test1() {
		Table.f1(1);
		Table.f1(2);
	}

	@Test
	public void test2() {
		new InitialValues().printInitialValues();
	}
}

class Bowl {
	public Bowl(int marker) {
		System.out.println(String.format("Bowl(%d)", marker));
	}
}

class Table {
	static Bowl bowl = new Bowl(1);

	static void f1(int marker) {
		System.out.println(String.format("f1(%d)", marker));
	}
}

class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;

	void printInitialValues() {
		System.out.println("Data Type Initial Value");
		System.out.println("boolean " + t);
		System.out.println("char [" + c + "]");
		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("long " + l);
		System.out.println("float " + f);
		System.out.println("d " + d);
		System.out.println("reference " + reference);
	}
}
