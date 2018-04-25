package top.leagle.pattern.command.command3.command.sub;

import top.leagle.pattern.command.command3.appliance.Stereo;
import top.leagle.pattern.command.command3.command.Command;

public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
