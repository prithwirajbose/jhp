package com.jujuapps.jhp.jhpweb.app.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
	private long userId;
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String addUserSuccess="N";

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int hashCode() {
		return Long.valueOf(this.userId).hashCode();
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			return obj.hashCode() == this.hashCode();
		} else
			return false;
	}

	public String getAddUserSuccess() {
		return addUserSuccess;
	}

	public void setAddUserSuccess(String addUserSuccess) {
		this.addUserSuccess = addUserSuccess;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
