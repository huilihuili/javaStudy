package top.leagle.pattern.proxy.proxy3.state;

import java.io.Serializable;

public interface State extends Serializable {
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}
