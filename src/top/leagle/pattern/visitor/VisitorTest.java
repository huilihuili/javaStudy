package top.leagle.pattern.visitor;

public class VisitorTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.show(new ComputerPartDisplayVisitor());
	}
}
