package com.xsarahg.CurrencyApp.model;

// this class will only keep credentials for authentication

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCredentials {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
