package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_splash);
        click=(ImageView)findViewById(R.id.iv_logo);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(homeIntent);
            }
        });

    }
}
