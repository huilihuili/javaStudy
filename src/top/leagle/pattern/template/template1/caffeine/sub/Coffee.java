package top.leagle.pattern.template.template1.caffeine.sub;

import top.leagle.pattern.template.template1.caffeine.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and milk");
	}

}
