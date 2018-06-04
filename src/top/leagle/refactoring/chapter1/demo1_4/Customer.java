package top.leagle.refactoring.chapter1.demo1_4;

import java.util.ArrayList;
import java.util.List;

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
		result.append("Rental Record for " + getName() + "\n");
		for (Rental rental : rentals) {
			result.append("\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n");
		}
		result.append("Amount owed is " + getTotalCharge() + "\n");
		result.append("You earned " + getTotalFrequentRenterPoints() + " frequent renter points");
		return result.toString();
	}

	private double getTotalCharge() {
		double result = 0;
		for (Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		for (Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
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
