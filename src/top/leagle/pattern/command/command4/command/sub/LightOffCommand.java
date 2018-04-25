package top.leagle.pattern.command.command4.command.sub;

import top.leagle.pattern.command.command4.command.Command;
import top.leagle.pattern.command.command4.appliance.Light;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
