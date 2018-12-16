package top.leagle.pattern.state.state3.state.sub;

import top.leagle.pattern.state.state3.machine.GumballMachine;
import top.leagle.pattern.state.state3.state.State;

public class HasQuarterState implements State {
	private GumballMachine gumballMachine;

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
		gumballMachine.setState(gumballMachine.getSoldState());
		gumballMachine.dispense();
	}

	@Override
	public void dispense() {
		System.out.println("No gumballs dispensed.");
	}

}
