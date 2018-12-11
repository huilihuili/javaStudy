package top.leagle.pattern.command.command1.command.sub;

import top.leagle.pattern.command.command1.appliance.Light;
import top.leagle.pattern.command.command1.command.Command;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
