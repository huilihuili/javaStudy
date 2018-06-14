package top.leagle.refactoring.chapter11.from.template.method.origin;

public abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}

class ChildrensPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
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

class NewReasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_REALEASE;
	}

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}

class RegularPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
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
