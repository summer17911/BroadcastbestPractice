package com.example.broadcastbestpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
private EditText account,password;
    private  Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         account= (EditText) findViewById(R.id.account);
          password= (EditText) findViewById(R.id.password);
         login=(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account1 = account.getText().toString();
                String password1=password.getText().toString();
                if(account1.equals("chenzhao")&&password1.equals("123456")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "密码或者账号错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
