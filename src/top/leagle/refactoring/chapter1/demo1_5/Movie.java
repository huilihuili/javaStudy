package top.leagle.refactoring.chapter1.demo1_5;

public abstract class Movie {
	private String title;

	abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

class ChildrensMovie extends Movie {
	public ChildrensMovie(String title) {
		super(title);
	}

	@Override
	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}
}

class NewReaseMovie extends Movie {
	public NewReaseMovie(String title) {
		super(title);
	}

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}

class RegularMovie extends Movie {
	public RegularMovie(String title) {
		super(title);
	}

	@Override
	double getCharge(int daysRented) {
		int result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}
