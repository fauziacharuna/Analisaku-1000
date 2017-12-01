package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by fauziachmadharuna on 11/3/17.
 */

public class DashboardActivity extends AppCompatActivity {
    Button data_btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        data_btn=(Button)findViewById(R.id.data_btn);
        data_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuActivity=new Intent(DashboardActivity.this,MenuActivity.class);
                startActivity(menuActivity);
            }
        });
    }
}
