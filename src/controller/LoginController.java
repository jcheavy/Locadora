package controller;

import view.TelaLogin;

public class LoginController {
	
	private TelaLogin telaLogin;

	public LoginController(TelaLogin telaLogin) {
	
		this.telaLogin = telaLogin;
	}

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}

	public void setTelaLogin(TelaLogin telaLogin) {
		this.telaLogin = telaLogin;
	}
	
	public void logando() {
		
	}

}
