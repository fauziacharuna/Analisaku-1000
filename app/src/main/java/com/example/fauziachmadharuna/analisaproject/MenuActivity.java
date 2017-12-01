package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by fauziachmadharuna on 11/8/17.
 */

public class MenuActivity extends AppCompatActivity {
    ImageView financial;
    ImageView operational;
    ImageView human;
    ImageView marketing;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        financial=(ImageView)findViewById(R.id.iv_financial);
//        operational=(ImageView)findViewById(R.id.iv_operasional);
//        human=(ImageView)findViewById(R.id.iv_human);
//        marketing=(ImageView)findViewById(R.id.iv_marketing);
        financialMenu();


    }

    private void financialMenu() {
        financial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mn_financial_activity= new Intent(MenuActivity.this,MenuFinancialActivity.class);
                startActivity(mn_financial_activity);
                Toast.makeText(MenuActivity.this,"Financial Smart",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
