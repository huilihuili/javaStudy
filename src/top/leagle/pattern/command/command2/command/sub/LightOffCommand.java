package top.leagle.pattern.command.command2.command.sub;

import top.leagle.pattern.command.command2.applicace.Light;
import top.leagle.pattern.command.command2.command.Command;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
