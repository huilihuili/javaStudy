package top.leagle.pattern.singleton.singleton3;

public class SingletonTest {

	public static void main(String[] args) {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}
}
