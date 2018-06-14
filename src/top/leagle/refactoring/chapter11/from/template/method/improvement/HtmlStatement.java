package top.leagle.refactoring.chapter11.from.template.method.improvement;

public class HtmlStatement extends Statement {

	@Override
	public String headerString(Customer customer) {
		return "<H1>Rental Record for <Em>\" + customer.getName() + \"</EM> </H1><p>\\n";
	}

	@Override
	public String eachRentalString(Rental rental) {
		return "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "<BR>\n";
	}

	@Override
	public String footerString(Customer customer) {
		return "<p>Amount owed is <em>" + customer.getTotalCharge() + "</em><p>\n" + "You earned <em>"
				+ customer.getTotalFrequentRenterPoints() + "</em> frequent renter points<p>";
	}
}
