package com.vti.entity;

import java.util.Date;

public class Account {
	private int accountID;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;

	// a) Constructor không có parameters
	public Account() {
	}

	// b) Constructor với các parameter là id, Email, Username, FirstName, LastName
	// (với FullName = FirstName + LastName)
	public Account(int accountID, String email, String userName, String firstName, String lastName) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
	}

	// c) Constructor với các parameter là id, Email, Username, FirstName, LastName
	// (với FullName = FirstName + LastName) và Position của User, default
	// createDate = now
	public Account(int accountID, String email, String userName, String firstName, String lastName, Position position) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = new Date();
	}

	// d) Constructor với các parameter là id, Email, Username, FirstName, LastName
	// (với FullName = FirstName + LastName) và Position của User, createDate.
	public Account(int accountID, String email, String userName, String firstName, String lastName, Position position,
			Date createDate) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	// e) Constructor đầy đủ parameter
	public Account(int accountID, String email, String userName, String fullName, Department department,
			Position position, Date createDate) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
	}

	public static void main(String[] args) {

	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		java.text.SimpleDateFormat vnFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String createDateVN = this.getCreateDate() != null ? vnFormat.format(this.getCreateDate()) : "null";
		return "Account{" +
				"\n  accountID=" + accountID +
				",\n  email='" + email + '\'' +
				",\n  userName='" + userName + '\'' +
				",\n  fullName='" + fullName + '\'' +
				",\n  department=" + (department != null ? department.getDepartmentName() : "null") +
				",\n  position=" + (position != null ? position.getPositionName() : "null") +
				",\n  createDate=" + createDateVN +
				"\n}";
	}
}
