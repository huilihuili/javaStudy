package top.leagle.pattern.memento;

public class MementoTest {
	public static void main(String[] args) {
		UserInfoOriginator userInfoOriginator = new UserInfoOriginator("张三", "123456");
		UserInfoCaretaker userInfoCaretaker = new UserInfoCaretaker();

		System.out.println("初始状态：");
		userInfoOriginator.show();

		userInfoCaretaker.setUserInfoMemento(userInfoOriginator.getUserInfoMemento());

		userInfoOriginator.setUsername("张四");
		userInfoOriginator.setPassword("888888");

		System.out.println("\n修改状态：");
		userInfoOriginator.show();

		System.out.println("\n回复到初始状态：");
		userInfoOriginator.restoreUserIndoMemento(userInfoCaretaker.getUserInfoMemento());
		userInfoOriginator.show();
	}
}
