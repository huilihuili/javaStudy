package top.leagle.pattern.memento;

public class UserInfoOriginator {
	private String username;
	private String password;

	public UserInfoOriginator(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public UserInfoMemento getUserInfoMemento() {
		return new UserInfoMemento(username, password);
	}

	public void restoreUserIndoMemento(UserInfoMemento userInfoMemento) {
		this.username = userInfoMemento.getUsername();
		this.password = userInfoMemento.getPassword();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void show() {
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}
}
