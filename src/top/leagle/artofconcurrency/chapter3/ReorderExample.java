package top.leagle.artofconcurrency.chapter3;

public class ReorderExample {
	int a = 0;
	boolean flag = false;

	public void writer() {
		a = 1;
		flag = true;
	}

	public void reader() {
		if (flag) {
			int i = a * a;

		}
	}
}

class VolatileExample {
	int a = 0;
	volatile boolean flag = false;

	public void writer() {
		a = 1;
		flag = true;
	}

	public void reader() {
		if (flag) {
			int i = a * a;

		}
	}
}

class FinalExample {
	int i; // 普通变量
	final int j; // final 变量

	static FinalExample obj;

	public FinalExample() {
		i = 1;
		j = 2;
	}

	public void writer() {
		obj = new FinalExample();
	}

	public void reader() {
		FinalExample object = obj;
		int a = object.i;
		int b = object.j;
	}
}

class FinalReferenceEscapeExample {
	final int i;

	static FinalReferenceEscapeExample obj;

	public FinalReferenceEscapeExample() {
		i = 1;
		obj = this;
	}

	public void writer() {
		new FinalReferenceEscapeExample();
	}

	public void reader() {
		if (obj != null) {
			int temp = obj.i;
		}
	}
}
