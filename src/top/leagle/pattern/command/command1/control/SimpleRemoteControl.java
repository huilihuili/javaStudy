package top.leagle.pattern.command.command1.control;

import top.leagle.pattern.command.command1.command.Command;

public class SimpleRemoteControl {
	private Command slot;

	public SimpleRemoteControl() {
	}

	public Command getSlot() {
		return slot;
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
