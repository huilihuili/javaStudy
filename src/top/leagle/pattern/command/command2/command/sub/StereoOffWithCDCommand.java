package top.leagle.pattern.command.command2.command.sub;

import top.leagle.pattern.command.command2.applicace.Stereo;
import top.leagle.pattern.command.command2.command.Command;

public class StereoOffWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

}
