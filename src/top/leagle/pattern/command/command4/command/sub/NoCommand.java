package top.leagle.pattern.command.command4.command.sub;

import top.leagle.pattern.command.command4.command.Command;

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
