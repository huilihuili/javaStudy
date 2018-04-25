package top.leagle.pattern.command.command3.command.sub;

import top.leagle.pattern.command.command3.command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command.");
	}

	@Override
	public void undo() {
		System.out.println("no command.");
	}

}
