package com.example.loc.demo_mvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loc.demo_mvp.Presenter.LoginPresenter;
import com.example.loc.demo_mvp.R;

public class MainActivity extends AppCompatActivity implements ILoginView {

 //   PresenterLogicLogin presenterLogicLogin;
    Button button_login;
    EditText editText_user;
    EditText editText_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_login=(Button) findViewById(R.id.Button_DangNhap);
        editText_user=(EditText) findViewById(R.id.EditText_User);
        editText_pass=(EditText) findViewById(R.id.EditText_Passworf);
     //   button_login.setOnClickListener(this);
        final LoginPresenter loginPresenter= new LoginPresenter(this);

button_login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        loginPresenter.onLogin(editText_user.getText().toString(),editText_pass.getText().toString());
    }
});

    }


    @Override
    public void OnLOginResult(String mess) {
        Toast.makeText(this,mess,Toast.LENGTH_LONG).show();

    }
}
