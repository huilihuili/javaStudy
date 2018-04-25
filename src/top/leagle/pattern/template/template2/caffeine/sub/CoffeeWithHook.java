package top.leagle.pattern.template.template2.caffeine.sub;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import top.leagle.pattern.template.template2.caffeine.CaffeineBeverage;

public class CoffeeWithHook extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and milk");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (answer == null) {
			return "no";
		}
		return answer;
	}

}
