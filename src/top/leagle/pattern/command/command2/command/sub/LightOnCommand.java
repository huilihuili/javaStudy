package top.leagle.pattern.command.command2.command.sub;

import top.leagle.pattern.command.command2.applicace.Light;
import top.leagle.pattern.command.command2.command.Command;

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
