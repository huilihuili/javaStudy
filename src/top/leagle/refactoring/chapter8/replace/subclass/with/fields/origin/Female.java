package top.leagle.refactoring.chapter8.replace.subclass.with.fields.origin;

public class Female extends Person {

	@Override
	boolean isMale() {
		return false;
	}

	@Override
	char getCode() {
		return 'F';
	}

}
