package top.leagle.pattern.template.template1.caffeine.sub;

import top.leagle.pattern.template.template1.caffeine.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
