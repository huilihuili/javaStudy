package top.leagle.refactoring.chapter11.from.template.method.improvement;

public class TextStatement extends Statement {

	@Override
	public String headerString(Customer customer) {
		return "Rental Record for " + customer.getName() + "\n";
	}

	@Override
	public String eachRentalString(Rental rental) {
		return "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
	}

	@Override
	public String footerString(Customer customer) {
		return "Amount owed is " + customer.getTotalCharge() + "\n" + "You earned "
				+ customer.getTotalFrequentRenterPoints() + " frequent renter points";
	}
}
