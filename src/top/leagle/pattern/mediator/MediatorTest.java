package top.leagle.pattern.mediator;

public class MediatorTest {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Male male = new Male("张三", mediator);
		Female female = new Female("翠花", mediator);
		
		mediator.setMale(male);
		mediator.setFemale(female);
		
		male.contact("我喜欢你！");
		female.contact("我不喜欢你，滚！");
	}
}
