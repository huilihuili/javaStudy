package top.leagle.pattern.compound.compound6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	List<Quackable> quackers = new ArrayList<>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();

		while (iterator.hasNext()) {
			Quackable quackable = iterator.next();
			quackable.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
	}

}
