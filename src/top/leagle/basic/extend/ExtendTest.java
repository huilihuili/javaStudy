package top.leagle.basic.extend;

class Father {
	public int i;
   	public final void hehe() {

	}

	public void fun() {
		System.out.println("father");
	}

	public static void main(String[] args) {
		Father father = new Son();
		father.fun();
	}
}

class Son extends Father {
	public void fun(int i) {
		System.out.println("i = " + i);
	}

	@Override
	public void fun() {
		System.out.println("son");
	}
}

public class ExtendTest {
	public static void main(String[] args) {

	}

}
