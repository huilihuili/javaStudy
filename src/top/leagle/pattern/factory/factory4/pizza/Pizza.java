package top.leagle.pattern.factory.factory4.pizza;

import top.leagle.pattern.factory.factory4.indregent.Clams;
import top.leagle.pattern.factory.factory4.indregent.Dough;

public abstract class Pizza {

	private Dough dough;
	private Clams clams;

	public abstract void prepare();

	public void bake() {

	}

	public void cut() {

	}

	public void box() {

	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}

}
