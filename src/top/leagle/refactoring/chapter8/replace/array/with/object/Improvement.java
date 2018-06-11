package top.leagle.refactoring.chapter8.replace.array.with.object;

public class Improvement {
	public static void main(String[] args) {
		Performance performance = new Performance();
		performance.setName("Liverpool");
		performance.setWins(15);

		String name = performance.getName();
		int wins = performance.getWins();
		System.out.println(name + " : " + wins);
	}
}

class Performance {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	private String name;
	private int wins;
}
