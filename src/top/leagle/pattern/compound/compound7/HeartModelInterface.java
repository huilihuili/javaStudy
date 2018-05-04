package top.leagle.pattern.compound.compound7;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
