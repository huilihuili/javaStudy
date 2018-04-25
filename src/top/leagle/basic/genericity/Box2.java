package top.leagle.basic.genericity;

public class Box2<A> {
	private A object;

	public void set(A object) {
		this.object = object;
	}

	public A get() {
		return object;
	}
}
