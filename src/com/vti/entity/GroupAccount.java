package com.vti.entity;

import java.util.Date;

public class GroupAccount {
    private int groupID;
    private int accountID;
    private Date joinDate;

    public GroupAccount(int groupID, int accountID, Date joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = joinDate;
    }

    public GroupAccount(int groupID, int accountID) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = new Date();
    }

    // Constructor không tham số
    public GroupAccount() {
    }

    // Getters and Setters
    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "GroupAccount [groupID=" + groupID + ", accountID=" + accountID + ", joinDate=" + joinDate + "]";
    }
}
