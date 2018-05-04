package top.leagle.pattern.compound.compound6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

	List<Observer> observers = new ArrayList<>();

	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
