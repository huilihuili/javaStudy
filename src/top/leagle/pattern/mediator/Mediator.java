package top.leagle.pattern.mediator;

public abstract class Mediator {
	abstract void contact(String content, Person person);
}

class ConcreteMediator extends Mediator {
	Male male;
	Female female;

	@Override
	public void contact(String content, Person person) {
		if (person == male) {
			female.getMessage(person, content.replace("我", "他"));
		} else {
			male.getMessage(person, content.replace("我", "她"));
		}
	}

	public Male getMale() {
		return male;
	}

	public void setMale(Male male) {
		this.male = male;
	}

	public Female getFemale() {
		return female;
	}

	public void setFemale(Female female) {
		this.female = female;
	}
}
