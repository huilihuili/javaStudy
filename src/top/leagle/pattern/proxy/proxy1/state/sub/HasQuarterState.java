package top.leagle.pattern.proxy.proxy1.state.sub;

import java.util.Random;

import top.leagle.pattern.proxy.proxy1.machine.GumballMachine;
import top.leagle.pattern.proxy.proxy1.state.State;

public class HasQuarterState implements State {
	private GumballMachine gumballMachine;
	private Random randomWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		gumballMachine.dispense();
	}

	@Override
	public void dispense() {
		System.out.println("No gumballs dispensed.");
	}

}
