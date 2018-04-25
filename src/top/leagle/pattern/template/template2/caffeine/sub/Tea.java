package top.leagle.pattern.template.template2.caffeine.sub;

import top.leagle.pattern.template.template2.caffeine.CaffeineBeverage;

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
