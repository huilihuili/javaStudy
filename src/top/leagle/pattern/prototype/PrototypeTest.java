package top.leagle.pattern.prototype;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype concretePrototype = new ConcretePrototype("EagleLi", 23);
		System.out.println(concretePrototype);

		ConcretePrototype concretePrototypeClone = concretePrototype.clone();
		concretePrototypeClone.setAge(concretePrototypeClone.getAge() + 1);
		System.out.println(concretePrototypeClone);
	}
}
