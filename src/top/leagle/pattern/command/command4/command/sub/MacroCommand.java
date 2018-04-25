package top.leagle.pattern.command.command4.command.sub;

import top.leagle.pattern.command.command4.command.Command;

public class MacroCommand implements Command {
	private Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
