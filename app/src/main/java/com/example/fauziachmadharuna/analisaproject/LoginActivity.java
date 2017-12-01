package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by fauziachmadharuna on 11/3/17.
 */

public class LoginActivity extends AppCompatActivity {
    private static EditText et_email;
    private String username="analisaku";
    private String password="oke";
    private static EditText et_Password;
    Button masuk_btn;

    @Override
    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        Login();


    }

    private void Login() {
        et_email=(EditText)findViewById(R.id.et_email);
        et_Password=(EditText)findViewById(R.id.et_password);
        masuk_btn =(Button)findViewById(R.id.btn_masuk);
        masuk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (et_email.getText().toString().equals(username) && et_Password.getText().toString().equals(password)) {
                        Toast.makeText(LoginActivity.this,"Username and Password correct",Toast.LENGTH_SHORT).show();
                        Intent dashboard=new Intent(LoginActivity.this,DashboardActivity.class);
                        startActivity(dashboard);
                    }else {
                        Toast.makeText(LoginActivity.this,"Username and Password incorrect",Toast.LENGTH_SHORT).show();

                    }

            }
        });
    }

}
