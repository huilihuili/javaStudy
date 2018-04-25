package top.leagle.pattern.observer.observer2.subjects;

import top.leagle.pattern.observer.observer2.observers.Observer;

public interface Subject {
	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
