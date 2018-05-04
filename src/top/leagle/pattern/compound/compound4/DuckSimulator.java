package top.leagle.pattern.compound.compound4;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory abstractDuckFactory) {
		Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
		Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
		Quackable duckCall = abstractDuckFactory.createDuckCall();
		Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		System.out.println("\nDuck Simulator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable quackable) {
		quackable.quack();
	}
}
