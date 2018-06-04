package top.leagle.refactoring.chapter1.demo1_1;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.RelationType;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String statement() {
		StringBuilder result = new StringBuilder();
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		result.append("Rental Record for " + getName() + "\n");
		for (Rental rental : rentals) {
			double thisAmount = 0;

			switch (rental.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (rental.getDaysRented() > 2) {
					thisAmount += (rental.getDaysRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_REALEASE:
				thisAmount += rental.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (rental.getDaysRented() > 3) {
					thisAmount += (rental.getDaysRented() - 3) * 1.5;
				}
				break;
			}

			frequentRenterPoints++;
			if ((rental.getMovie().getPriceCode() == Movie.NEW_REALEASE) && rental.getDaysRented() > 1) {
				frequentRenterPoints++;
			}

			result.append("\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n");
			totalAmount += thisAmount;
		}
		result.append("Amount owed is " + totalAmount + "\n");
		result.append("You earned " + frequentRenterPoints + " frequent renter points");
		return result.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

}
