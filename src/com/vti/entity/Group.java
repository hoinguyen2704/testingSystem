package com.vti.entity;

import java.util.Date;

public class Group {
	private Short groupID;
	private String groupName;
	private Account createAccount;
	private Date createDate;
	private Account[] accounts;

	public Short getGroupID() {
		return groupID;
	}

	public void setGroupID(Short groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getcreateAccount() {
		return createAccount;
	}

	public void setCreateID(Account createAccount) {
		this.createAccount = createAccount;
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
		String createDateStr = (createDate != null) ? vnFormat.format(createDate) : "null";
		return "Group {\n"
				+ "  groupID=" + groupID + ",\n"
				+ "  groupName='" + groupName + "',\n"
				+ "  createID=" + createAccount + ",\n"
				+ "  createDate=" + createDateStr + "\n"
				// + " accounts=" + (accounts != null ? java.util.Arrays.toString(accounts) :
				// "null") + "\n"
				+ "}";
	}

	// a) Constructor không có parameters
	public Group() {
	}

	// b) Constructor với GroupName, Creator, array Account[] accounts, CreateDate
	public Group(String groupName, Account creator, Account[] accounts, Date createDate) {
		this.groupName = groupName;
		this.createAccount = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	// c) Constructor với GroupName, Creator, array String[] usernames, CreateDate
	// Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các
	// thông tin còn lại = null)
	public Group(String groupName, Account creator, String[] usernames, Date createDate) {
		this.groupName = groupName;
		this.createAccount = creator;
		this.createDate = createDate;
		if (usernames != null) {
			this.accounts = new Account[usernames.length];
			for (int i = 0; i < usernames.length; i++) {
				Account acc = new Account();
				acc.setUserName(usernames[i]);
				this.accounts[i] = acc;
			}
		} else {
			this.accounts = null;
		}
	}

	// d) Constructor đầy đủ tham số
	public Group(short groupID, String groupName, Account createAccount, Date createDate) {
		this.groupID = groupID;
		this.groupName = groupName;
		this.createAccount = createAccount;
		this.createDate = createDate;
	}
}
