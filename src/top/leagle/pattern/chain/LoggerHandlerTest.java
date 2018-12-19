package top.leagle.pattern.chain;

public class LoggerHandlerTest {
	public static void main(String[] args) {
		AbstractLoggerHandler consoleLoggerHandler = new ConsoleLoggerHandler(AbstractLoggerHandler.INFO);
		AbstractLoggerHandler fileLoggerHandler = new FileLoggerHandler(AbstractLoggerHandler.DEBUG);
		AbstractLoggerHandler errorLoggerHandler = new ErrorLoggerHandler(AbstractLoggerHandler.ERROR);
		
		consoleLoggerHandler.setNextLoggerHandler(fileLoggerHandler);
		fileLoggerHandler.setNextLoggerHandler(errorLoggerHandler);

		AbstractLoggerHandler loggerChainHandler = consoleLoggerHandler;
		System.out.println("=== INFO ===");
		loggerChainHandler.handleRequest(AbstractLoggerHandler.INFO, "This is an information.");
		System.out.println();
		System.out.println("=== DEBUG ===");
		loggerChainHandler.handleRequest(AbstractLoggerHandler.DEBUG, "This is an debug level information.");
		System.out.println();
		System.out.println("=== ERROR ===");
		loggerChainHandler.handleRequest(AbstractLoggerHandler.ERROR, "This is an error information.");
	}
}
