package top.leagle.pattern.proxy.proxy1.machine;

import top.leagle.pattern.proxy.proxy1.state.State;
import top.leagle.pattern.proxy.proxy1.state.sub.HasQuarterState;
import top.leagle.pattern.proxy.proxy1.state.sub.NoQuarterState;
import top.leagle.pattern.proxy.proxy1.state.sub.SoldOutState;
import top.leagle.pattern.proxy.proxy1.state.sub.SoldState;
import top.leagle.pattern.proxy.proxy1.state.sub.WinnerState;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	private String location;
	private State state = soldOutState;
	private int count = 0;

	public GumballMachine(String location, int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.location = location;
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
	}

	public void dispense() {
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state.getClass().getSimpleName() + ", count=" + count + "]";
	}

}
