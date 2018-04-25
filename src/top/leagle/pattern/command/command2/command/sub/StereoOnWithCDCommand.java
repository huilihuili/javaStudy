package top.leagle.pattern.command.command2.command.sub;

import top.leagle.pattern.command.command2.applicace.Stereo;
import top.leagle.pattern.command.command2.command.Command;

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

}
