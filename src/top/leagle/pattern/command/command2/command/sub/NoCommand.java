package top.leagle.pattern.command.command2.command.sub;

import top.leagle.pattern.command.command2.command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command.");
	}

}
