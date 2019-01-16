package com.example.loc.demo_mvp.Model;

import android.text.TextUtils;

public class User implements IUser{

    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String get_email() {
        return email;
    }

    @Override
    public String get_password() {
        return password;
    }

    @Override
    public boolean Check() {
        return TextUtils.isEmpty(get_email()) && get_password().length()> 6;
    }
}
