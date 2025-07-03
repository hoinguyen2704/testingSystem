package assigment1;

import java.util.Date;

//import java.util.Date;

public class Group {
	private Short groupID;
	private String groupName;
	private Account createAccount;
	private Date createDate;

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
		return "Group [groupID=" + groupID + "\ngroupName=" + groupName + "\ncreateID=" + createAccount
				+ "\ncreateDate="
				+ createDate + "]";
	}

	public Group(int groupID, String groupName, Account createAccount, Date createDate) {
		this.groupID = (short) groupID;
		this.groupName = groupName;
		this.createAccount = createAccount;
		this.createDate = createDate;
	}
}
