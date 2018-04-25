package top.leagle.pattern.state.state2.state.sub;

import top.leagle.pattern.state.state2.machine.GumballMachine;
import top.leagle.pattern.state.state2.state.State;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no gumballs.");
	}

	@Override
	public void dispense() {
		System.out.println("No gumballs dispensed.");
	}

}
