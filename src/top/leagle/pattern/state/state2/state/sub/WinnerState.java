package top.leagle.pattern.state.state2.state.sub;

import top.leagle.pattern.state.state2.machine.GumballMachine;
import top.leagle.pattern.state.state2.state.State;

public class WinnerState implements State {
	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank.");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		System.out.println("You're a winner! You get two gumballs for your quarter.");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
