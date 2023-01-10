package com.example.gong_native.ui.activity.module.user;

/**
 * 这里只存放用户信息，是数据和操作分离
 */
public class UserInfo {
    private String username;//用户名，但是这个不是唯一的id
    private long userID;//用户id，用来后天查找的，这里可以直接使用学号
    private String token;//用户令牌，用来和后端通信的.暂时还不知道怎么用，根据后端数据来使用

    public long getUserID() {
        return userID;
    }

    public String getToken() {
        return token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
