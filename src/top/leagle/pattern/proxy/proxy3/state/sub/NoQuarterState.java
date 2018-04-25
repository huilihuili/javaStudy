package top.leagle.pattern.proxy.proxy3.state.sub;

import top.leagle.pattern.proxy.proxy3.service.impl.GumballMachine;
import top.leagle.pattern.proxy.proxy3.state.State;

public class NoQuarterState implements State {
	private static final long serialVersionUID = 1L;

	private transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter.");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first.");
	}

}
