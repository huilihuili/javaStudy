package top.leagle.pattern.memento;

public class UserInfoCaretaker {
	private UserInfoMemento userInfoMemento;

	public UserInfoMemento getUserInfoMemento() {
		return userInfoMemento;
	}

	public void setUserInfoMemento(UserInfoMemento userInfoMemento) {
		this.userInfoMemento = userInfoMemento;
	}

}