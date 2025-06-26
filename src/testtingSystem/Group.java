package testtingSystem;

import java.util.Date;

//import java.util.Date;

public class Group {
	private Short groupID;
	private String groupName;
	private int createID;
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

	public int getCreateID() {
		return createID;
	}

	public void setCreateID(int createID) {
		this.createID = createID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + "\ngroupName=" + groupName + "\ncreateID=" + createID + "\ncreateDate="
				+ createDate + "]";
	}

	public Group(int groupID, String groupName, int createID, Date createDate) {
		this.groupID = (short) groupID;
		this.groupName = groupName;
		this.createID = createID;
		this.createDate = createDate;
	}
}
