package top.leagle.pattern.proxy.proxy1;

import org.junit.Test;

import top.leagle.pattern.proxy.proxy1.machine.GumballMachine;
import top.leagle.pattern.proxy.proxy1.monitor.GumballMonitor;

public class ProxyTest {

	@Test
	public void test1() {
		GumballMachine gumballMachine = new GumballMachine("Seattle", 112);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
		gumballMonitor.report();
	}

}
