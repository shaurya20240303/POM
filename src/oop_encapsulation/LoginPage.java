package oop_encapsulation;

public class LoginPage {
	private String username;
	private String password;
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
		//pwd logic
		if(password.length() >=10) {
			this.password = password;
		}else {
			System.out.println("pls supply the pawd more than 10 chars");
		}
		
	}

}
