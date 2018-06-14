package top.leagle.refactoring.chapter11.from.template.method.improvement;

public abstract class Statement {
	public String value(Customer customer) {
		StringBuilder result = new StringBuilder(headerString(customer));
		for (Rental rental : customer.getRentals()) {
			result.append(eachRentalString(rental));
		}
		result.append(footerString(customer));
		return result.toString();
	}

	abstract String headerString(Customer customer);

	abstract String eachRentalString(Rental rental);

	abstract String footerString(Customer customer);
}
