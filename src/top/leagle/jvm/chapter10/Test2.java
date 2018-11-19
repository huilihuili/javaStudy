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
	 * ��һ�μ��ػ�ִ�У�����ľ�̬�� ---> ����ľ�̬��
	 * 
	 * ����Ĺ���� ---> ����Ĺ��캯�� ---> ����Ĺ���� ---> ����Ĺ��캯��
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
