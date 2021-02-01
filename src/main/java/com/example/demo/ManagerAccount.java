package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class ManagerAccount {

	@NotEmpty(message = "ログインIDを入力してください")
	private String loginID;

	@NotEmpty(message = "パスワードを入力してください")
	private String password;

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
