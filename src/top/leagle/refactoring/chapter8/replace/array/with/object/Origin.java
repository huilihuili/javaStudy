package top.leagle.refactoring.chapter8.replace.array.with.object;

public class Origin {
	public static void main(String[] args) {
		String[] row = new String[3];
		row[0] = "Liverpool";
		row[1] = "15";

		String name = row[0];
		int wins = Integer.valueOf(row[1]);
		System.out.println(name + " : " + wins);
	}
}
