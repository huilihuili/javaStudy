package top.leagle.pattern.interpreter;

public class InterpreterTest {
	public static void main(String[] args) {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		System.out.println(new OrExpression(robert, john).interpret("John"));
		System.out.println(new AndExpression(robert, john).interpret("John is Robert"));
	}
}
