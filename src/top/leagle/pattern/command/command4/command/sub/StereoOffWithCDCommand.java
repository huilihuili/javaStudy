package top.leagle.pattern.command.command4.command.sub;

import top.leagle.pattern.command.command4.appliance.Stereo;
import top.leagle.pattern.command.command4.command.Command;

public class StereoOffWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
