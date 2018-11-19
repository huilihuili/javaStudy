package top.leagle.jvm.chapter6;

public class Test1 {
	private String a = "aa";
	public int b = 123;
	public int f = 12;

	public void methodB() {
		final String c = "cc";
		String d = "bb";
		int e = 456;
		int g = 45;
	}

	public static void main(String[] args) {
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		System.out.println(a == b);

		Integer c = 33;
		Integer d = 33;
		System.out.println(c == d);
		
		Integer e = 128;
		Integer f = 128;
		System.out.println(e == f);
	}
}
