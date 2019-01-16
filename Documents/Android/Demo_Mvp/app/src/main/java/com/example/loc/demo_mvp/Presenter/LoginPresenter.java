package com.example.loc.demo_mvp.Presenter;

import com.example.loc.demo_mvp.Model.User;
import com.example.loc.demo_mvp.View.ILoginView;

public class LoginPresenter implements IloginPresenter {

    ILoginView iLoginView;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user= new User(email,password);
        boolean isLoginsuccess= user.Check();
        if(isLoginsuccess)
        {
            iLoginView.OnLOginResult("Login Success");
        }
        else
            iLoginView.OnLOginResult("Login failed");
    }
}
