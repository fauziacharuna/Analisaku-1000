package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by fauziachmadharuna on 11/8/17.
 */

public class MenuFinancialActivity extends AppCompatActivity {
    Button likuiditasBtn;
    Button aktifitasBtn;
    Button leverageBtn;
    Button profitabilitasBtn;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_financial_activity);

        likuiditasBtn = (Button) findViewById(R.id.btn_likuiditas);
        aktifitasBtn = (Button) findViewById(R.id.btn_aktifitas);
        leverageBtn = (Button) findViewById(R.id.btn_leverage);
        profitabilitasBtn = (Button) findViewById(R.id.btn_profitabilitas);

        likuiditasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent likuiditas = new Intent(MenuFinancialActivity.this, HitungLikuiditasActivity.class);
                startActivity(likuiditas);
                Toast.makeText(MenuFinancialActivity.this,"Hitung Likuiditas Perusahaanmu", Toast.LENGTH_SHORT).show();
            }
        });
        aktifitasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aktifitas = new Intent(MenuFinancialActivity.this, HitungAktifitasActivity.class);
                startActivity(aktifitas);
                Toast.makeText(MenuFinancialActivity.this,"Hitung Aktiva Perusahaanmu", Toast.LENGTH_SHORT).show();

            }
        });

        leverageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leverage = new Intent(MenuFinancialActivity.this, HitungLeverageActivity.class);
                startActivity(leverage);
                Toast.makeText(MenuFinancialActivity.this,"Hitung Leverage Perusahaanmu", Toast.LENGTH_SHORT).show();

            }
        });

        profitabilitasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profitabilitas = new Intent(MenuFinancialActivity.this, HitungProfitabilitasActivity.class);
                startActivity(profitabilitas);
                Toast.makeText(MenuFinancialActivity.this,"Hitung Profitabilitas Perusahaanmu", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
