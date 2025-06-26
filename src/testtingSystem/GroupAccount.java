package testtingSystem;

public class GroupAccount {
    private int groupID;
    private int accountID;
    private String joinDate;

    public GroupAccount(int groupID, int accountID, String joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = joinDate;
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

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
