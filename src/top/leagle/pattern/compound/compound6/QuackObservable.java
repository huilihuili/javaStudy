package top.leagle.pattern.compound.compound6;

public interface QuackObservable {
	void registerObserver(Observer observer);

	void notifyObservers();
}
