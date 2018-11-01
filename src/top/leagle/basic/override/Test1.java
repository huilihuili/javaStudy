package top.leagle.basic.override;

class Father {
	protected Father fun() {
		return new Father();
	}
}

class Son extends Father {
	@Override
	public Son fun() {
		return new Son();
	}
}

public class Test1 {

}
