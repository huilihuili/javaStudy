package top.leagle.pattern.builder;

public abstract class AbstractBuilder {
	protected Vacation vacation;

	public Vacation getVocationPlanner() {
		return vacation;
	}

	public AbstractBuilder() {
		vacation = new Vacation();
	}

	public abstract void buildDay(int day);

	public abstract void addHotel(String hotel);

	public abstract void addTicket(String ticket);

	public abstract void addSpecialEvent(String specialEvent);

}

class VacationBuilder extends AbstractBuilder {

	@Override
	public void buildDay(int day) {
		vacation.setDay(day);
	}

	@Override
	public void addHotel(String hotel) {
		vacation.setHotel(hotel);
	}

	@Override
	public void addTicket(String ticket) {
		vacation.setTickets(ticket);
	}

	@Override
	public void addSpecialEvent(String specialEvent) {
		vacation.setSpecialEvent(specialEvent);
	}

}
