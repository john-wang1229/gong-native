package com.example.gong_native.ui.activity.module.user;

/**
 * 这里只存放用户信息，是数据和操作分离
 */
public interface UserInfo {
    /**
     * 获取用户id
     * @return 用户id，一般是学号
     */
    long getUserID();

    /**
     * 获取用户令牌，用于登录的用户和服务端交互
     * @return 用户令牌
     */
    String getToken() ;

    /**
     * 获取用户名
     * @return 用户名，一般是正式姓名
     */
    String getUsername() ;

    /**
     * 设置用户名，这就允许用户自定义自己的名字
     * @param username 用户名
     */
    void setUsername(String username) ;


    /**
     * 设置用户id，一般在登录的时候使用
     * @param userID 用户id
     */
    void setUserID(long userID) ;

    /**
     * 设置用户令牌，一般在登录的时候使用
     * @param token 用户令牌
     */
    void setToken(String token) ;
}
