package top.leagle.jvm.chapter10;

public class Test2 {

	static public class Father {
		static {
			System.out.println("static Father");
		}

		public Father() {
			System.out.println("init Father");
		}

		public Father(int i) {
			System.out.println("init Father " + i);
		}

		{
			System.out.println("Father");
		}
	}

	static public class Son extends Father {
		static {
			System.out.println("static Son");
		}

		public Son() {
			System.out.println("init Son");
		}

		public Son(int i) {
			System.out.println("init Son " + i);
		}

		{
			System.out.println("Son");
		}
	}

	/**
	 * 第一次加载会执行：父类的静态块 ---> 子类的静态块
	 * 
	 * 父类的构造块 ---> 父类的构造函数 ---> 子类的构造快 ---> 子类的构造函数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Son son = new Son(5);
		System.out.println("-----");
		son = new Son();
		System.out.println("-----");
		Father father = new Father();
	}
}
