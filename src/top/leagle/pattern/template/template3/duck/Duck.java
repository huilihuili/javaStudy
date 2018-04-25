package top.leagle.pattern.template.template3.duck;

public class Duck implements Comparable<Duck> {

	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Duck o) {
		if (this.weight < o.getWeight()) {
			return -1;
		} else if (this.weight == o.getWeight()) {
			return 0;
		} else {
			return 1;
		}
	}

}
