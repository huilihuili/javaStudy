package top.leagle.pattern.builder;

public class BuilderTest {
	public static void main(String[] args) {
		AbstractBuilder vacationBuilder = new VacationBuilder();
		vacationBuilder.buildDay(3);
		vacationBuilder.addHotel("hotel");
		vacationBuilder.addSpecialEvent("specialEvent");
		vacationBuilder.addTicket("ticket");
		Vacation vocationPlanner = vacationBuilder.getVocationPlanner();
		System.out.println(vocationPlanner);
	}
}
