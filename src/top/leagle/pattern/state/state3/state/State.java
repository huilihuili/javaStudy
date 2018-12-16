package top.leagle.pattern.state.state3.state;

public interface State {

	// 投硬币
	void insertQuarter();

	// 退硬币
	void ejectQuarter();

	// 摇杆
	void turnCrank();

	// 取东西
	void dispense();
}
