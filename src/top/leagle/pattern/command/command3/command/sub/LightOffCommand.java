package top.leagle.pattern.command.command3.command.sub;

import top.leagle.pattern.command.command3.appliance.Light;
import top.leagle.pattern.command.command3.command.Command;

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
