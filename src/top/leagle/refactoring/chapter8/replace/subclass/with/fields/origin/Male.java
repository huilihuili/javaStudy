package top.leagle.refactoring.chapter8.replace.subclass.with.fields.origin;

public class Male extends Person {

	@Override
	boolean isMale() {
		return true;
	}

	@Override
	char getCode() {
		return 'M';
	}

}
