package top.leagle.pattern.command.command4.command.sub;

import top.leagle.pattern.command.command4.command.Command;
import top.leagle.pattern.command.command4.appliance.Stereo;

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
