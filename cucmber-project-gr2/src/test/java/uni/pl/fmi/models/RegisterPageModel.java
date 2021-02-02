package uni.pl.fmi.models;

import uni.pl.fmi.services.RegisteService;

public class RegisterPageModel {

	private String username;
	private String password;
	private String password2;
	private String email;
	private Object registerMessage;

	public void navigateToMe() {
		System.out.println("Навигирано е до страницата за регистрация в системата.");
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword1(String password) {
		this.password = password;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void clickRegisterButton() {
		registerMessage = RegisteService.register(username, password, password2, email);
	}

	public Object getRegisterMessage() {
		return registerMessage;
	}

}
