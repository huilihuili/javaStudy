package top.leagle.pattern.compound.compound6;

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

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}

}
