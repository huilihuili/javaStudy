package top.leagle.pattern.builder;

public class Vacation {
	private int day;
	private String hotel;
	private String ticket;
	private String specialEvent;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTickets(String ticket) {
		this.ticket = ticket;
	}

	public String getSpecialEvent() {
		return specialEvent;
	}

	public void setSpecialEvent(String specialEvent) {
		this.specialEvent = specialEvent;
	}

	@Override
	public String toString() {
		return "Vacation [day=" + day + ", hotel=" + hotel + ", ticket=" + ticket + ", specialEvent=" + specialEvent
				+ "]";
	}

}
