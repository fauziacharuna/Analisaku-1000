package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by fauziachmadharuna on 11/9/17.
 */

public class HasilLikuiditasActivity extends AppCompatActivity {
    TextView hasil_likuiditas;
    Button category;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_likuiditas);
        category=(Button)findViewById(R.id.btn);
        Intent intent =getIntent();
        Double hasilLikuiditas=intent.getExtras().getDouble("likuiditas");
        String likuiditasCalc = String.valueOf(hasilLikuiditas).toString();

        hasil_likuiditas=(TextView)findViewById(R.id.tv_hasil_likuiditas);
        hasil_likuiditas.setText(likuiditasCalc+" %");

        if (hasilLikuiditas<150){
          category.setText("BURUK");
          category.setBackgroundColor(getResources().getColor(R.color.buruk_category));

        } else  {
            category.setText("BAIK");
            category.setBackgroundColor(getResources().getColor(R.color.baik_category));
        }


//
//        if (hasilLikuiditas.equals(1)){
//            category.setBackground(R.drawable.good_category);
//
//        }else{


    }
}
