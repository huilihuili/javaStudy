package top.leagle.pattern.compound.compound3;

public class QuackCounter implements Quackable {

	Quackable duck;

	static int numberOfQuacks;

	public QuackCounter(Quackable quackable) {
		this.duck = quackable;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

}
