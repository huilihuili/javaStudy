package top.leagle.pattern.state.state1;

import org.junit.Test;

import top.leagle.pattern.state.state1.machine.GumballMachine;

public class StateTest {

	@Test
	public void test1() {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine);
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		System.out.println();
	}
	
	
}
