package top.leagle.pattern.proxy.proxy1.monitor;

import top.leagle.pattern.proxy.proxy1.machine.GumballMachine;

public class GumballMonitor {

	private GumballMachine gumballMachine;

	public GumballMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void report() {
		System.out.println("Gumball Machine : " + gumballMachine.getLocation());
		System.out.println("Gumball inventory : " + gumballMachine.getCount() + " gumballs");
		System.out.println("Gumball state : " + gumballMachine.getState().getClass().getSimpleName());
	}

}
