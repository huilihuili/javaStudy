package top.leagle.jvm.chapter7;

interface A {
	int a();
}

interface C {
	int c();
}

class B implements A {

	@Override
	public int a() {
		return 0;
	}
}

abstract class E implements A {

}

interface D extends A, C {

}

public class AbstractAndInterface {

}
