package top.leagle.pattern.proxy.proxy3;

import java.rmi.Naming;

import org.junit.Test;

import top.leagle.pattern.proxy.proxy3.monitor.GumballMonitor;
import top.leagle.pattern.proxy.proxy3.service.GumballMachineRemote;

public class ProxyTest {

	@Test
	public void test1() {
		String[] location = { "rmi://seattle.mightygumball.com/gumballmachine",
				"rmi://boulder.mightygumball.com/gumballmachine", "rmi://santafe.mightygumball.com/gumballmachine" };

		GumballMonitor[] gumballMonitors = new GumballMonitor[location.length];
		for (int i = 0; i < location.length; i++) {
			try {
				GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
				gumballMonitors[i] = new GumballMonitor(gumballMachineRemote);
				System.out.println(gumballMonitors[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < gumballMonitors.length; i++) {
			gumballMonitors[i].report();
		}

	}
}
