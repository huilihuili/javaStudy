package top.leagle.pattern.proxy.proxy3.registry;

import java.rmi.Naming;

import top.leagle.pattern.proxy.proxy3.service.GumballMachineRemote;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		String location = "seattle.mightygumball.com";
		int count = 100;
		try {
			GumballMachineRemote gumballMachineRemote = new top.leagle.pattern.proxy.proxy3.service.impl.GumballMachine(
					location, count);
			Naming.rebind("//" + location + "/gumballmachine", gumballMachineRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
