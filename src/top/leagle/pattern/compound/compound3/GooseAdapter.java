package top.leagle.pattern.compound.compound3;

public class GooseAdapter implements Quackable {

	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

}
