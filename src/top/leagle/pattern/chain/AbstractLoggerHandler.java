package top.leagle.pattern.chain;

public abstract class AbstractLoggerHandler {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	protected int level;
	protected AbstractLoggerHandler nextLoggerHandler;

	public void setNextLoggerHandler(AbstractLoggerHandler nextLoggerHandler) {
		this.nextLoggerHandler = nextLoggerHandler;
	}

	public void handleRequest(int level, String message) {
		if (this.level <= level) {
			write(message);
			if (this.level < level) {
				if (nextLoggerHandler != null) {
					nextLoggerHandler.handleRequest(level, message);
				}
			}
		} else {
			elseWrite();
		}
	}

	abstract protected void write(String message);

	abstract protected void elseWrite();

}

class ConsoleLoggerHandler extends AbstractLoggerHandler {
	public ConsoleLoggerHandler(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

	@Override
	protected void elseWrite() {
		System.out.println("Standard Console::Logger: 捕捉不到");
	}
}

class ErrorLoggerHandler extends AbstractLoggerHandler {
	public ErrorLoggerHandler(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

	@Override
	protected void elseWrite() {
		System.out.println("Error Console::Logger: 捕捉不到");
	}

}

class FileLoggerHandler extends AbstractLoggerHandler {

	public FileLoggerHandler(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}

	@Override
	protected void elseWrite() {
		System.out.println("File Console::Logger: 捕捉不到");
	}
}