package top.leagle.pattern.singleton.singleton1;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static synchronized ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}

	/**
	 * 
	 * @Title: fill
	 * @Description: 添加原料（空的）
	 */
	public void fill() {
		if (isEmpty()) {
			System.out.println("添加原料...");
			empty = false;
			boiled = false;
		}
	}

	/**
	 * 
	 * @Title: boil
	 * @Description: 煮（满的、没有煮过）
	 */
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("煮...");
			boiled = true;
		}
	}

	/**
	 * 
	 * @Title: drain
	 * @Description: 排出（满的、煮过的）
	 */
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("排出...");
			empty = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

}
