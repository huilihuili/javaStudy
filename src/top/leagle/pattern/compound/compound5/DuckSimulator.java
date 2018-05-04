package top.leagle.pattern.compound.compound5;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory abstractDuckFactory) {
		Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
		Quackable duckCall = abstractDuckFactory.createDuckCall();
		Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		System.out.println("\nDuck Simulator With Composite - Flocks");

		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();
		Quackable mallardOne = abstractDuckFactory.createMallardDuck();
		Quackable mallardTwo = abstractDuckFactory.createMallardDuck();
		Quackable mallardThree = abstractDuckFactory.createMallardDuck();
		Quackable mallardFour = abstractDuckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator : Whole  Flock Simulation");
		
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator : Mallard Flock Simulation");
		
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable quackable) {
		quackable.quack();
	}
}
