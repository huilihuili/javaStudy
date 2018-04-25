package top.leagle.pattern.proxy.proxy3.monitor;

import top.leagle.pattern.proxy.proxy3.service.GumballMachineRemote;

public class GumballMonitor {
	private GumballMachineRemote gumballMachineRemote;

	public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
		this.gumballMachineRemote = gumballMachineRemote;
	}

	public void report() {
		try {
			System.out.println("Gumball Machine : " + gumballMachineRemote.getLocation());
			System.out.println("Gumball inventory : " + gumballMachineRemote.getCount() + " gumballs");
			System.out.println("Gumball state : " + gumballMachineRemote.getState().getClass().getSimpleName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
