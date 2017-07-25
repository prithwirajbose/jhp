package com.jujuapps.jhp.jhpweb.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="USER")
@NamedQueries({
	@NamedQuery(name="GetAllUsers", query="from User u")
})
public class User implements Serializable {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;

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
		if(obj!=null) {
			return obj.hashCode()==this.hashCode();
		}
		else
			return false;
	}
	
}
