package top.leagle.pattern.command.command1;

import top.leagle.pattern.command.command1.appliance.Light;
import top.leagle.pattern.command.command1.command.sub.LightOnCommand;
import top.leagle.pattern.command.command1.control.SimpleRemoteControl;

public class CommandTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);

		simpleRemoteControl.setSlot(lightOnCommand);
		simpleRemoteControl.buttonWasPressed();
	}
}
