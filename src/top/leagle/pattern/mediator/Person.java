package top.leagle.pattern.mediator;

public class Person {
	protected String name;
	protected Mediator mediator;

	public Person(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}
}

class Male extends Person {
	public Male(String name, Mediator mediator) {
		super(name, mediator);
	}

	public void getMessage(Person person, String message) {
		System.out.println(name + "：" + person.getName() + "她说" + message);
	}

	public void contact(String message) {
		mediator.contact(message, this);
	}
}

class Female extends Person {
	public Female(String name, Mediator mediator) {
		super(name, mediator);
	}

	public void getMessage(Person person, String message) {
		System.out.println(name + "：" + person.getName() + "他说" + message);
	}

	public void contact(String message) {
		mediator.contact(message, this);
	}
}
