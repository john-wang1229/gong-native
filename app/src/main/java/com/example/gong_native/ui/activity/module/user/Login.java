package com.example.gong_native.ui.activity.module.user;

public interface Login {
    /**
     * 登录接口
     * @param username 用户名
     * @param password 密码
     * @return 返回等信息，类型目前不确定，可能会变
     */
    UserInfo login(String username,String password);
}
