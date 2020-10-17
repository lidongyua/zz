package com.zz.web.bean;

import java.io.Serializable;

/**
 * @author lidongy
 * @version 10.0
 * Created by lidongy on 2020/10/17
 */
public class UserInfoBean implements Serializable {
    private String userName;

    private String password;

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
}
