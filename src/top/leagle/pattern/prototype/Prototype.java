package top.leagle.pattern.prototype;

public interface Prototype extends Cloneable {
}

class ConcretePrototype implements Prototype {
	private String userName;
	private Integer age;

	public ConcretePrototype(String userName, Integer age) {
		System.out.println("constructor...");
		this.userName = userName;
		this.age = age;
	}

	@Override
	protected ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConcretePrototype [userName=" + userName + ", age=" + age + "]";
	}
}
