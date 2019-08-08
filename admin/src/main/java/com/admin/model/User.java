package com.admin.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private long id;
	
	private String userName;
	
	private String password;
	
	private String userType;
	
	private String firstName;
	
	private String lastName;
	
	private double phoneNo;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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

	public double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
}
