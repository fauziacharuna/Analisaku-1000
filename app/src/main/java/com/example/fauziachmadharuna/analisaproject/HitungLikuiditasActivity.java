package com.example.fauziachmadharuna.analisaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by fauziachmadharuna on 11/9/17.
 */

public class HitungLikuiditasActivity extends AppCompatActivity {
    Button likuiditasBtn;
    EditText et_hutangLancar;
    EditText et_hartaLancar;
    TextView hasilLikuiditas;
    Button analisaBtn;
    Double calcLikuiditas;


    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_likuiditas_activity);
//        Bundle bundle=getIntent().getExtras();
//        final String hasil=bundle.getString("likuiditas_calculator");



        analisaBtn=(Button)findViewById(R.id.btn_hasil_analisa);
        et_hartaLancar=(EditText)findViewById(R.id.et_hartaLancar);
        et_hutangLancar=(EditText)findViewById(R.id.et_hutang_lancar);
        likuiditasBtn= (Button)findViewById(R.id.btn_hitung_likuiditas);

        hasilLikuiditas=(TextView)findViewById(R.id.tv_hasil_likuiditas);


        likuiditasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiHartaLancar=et_hartaLancar.getText().toString();
                String nilaiHutangLancar=et_hutangLancar.getText().toString();
                if (TextUtils.isEmpty(et_hartaLancar.getText())&& TextUtils.isEmpty(et_hutangLancar.getText())){
                    Toast.makeText(HitungLikuiditasActivity.this,"Field tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(nilaiHartaLancar!=null){
                    double nilaiHarta = Float.parseFloat(nilaiHartaLancar);
                    double nilaiHutang =Float.parseFloat(nilaiHutangLancar);
                    hasilLikuiditas.setText(String.valueOf(hitungLikuiditas(nilaiHarta,nilaiHutang))+" %");

                }
            }
        });

        analisaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hasilIntent= new Intent(HitungLikuiditasActivity.this,HasilLikuiditasActivity.class);
//                String message = hasilLikuiditas.getText().toString();
                hasilIntent.putExtra("likuiditas",calcLikuiditas);
                startActivity(hasilIntent);
            }
        });
    }

    double hitungLikuiditas(double hartaLancar,double hutangLancar) {
        double likuiditas=hartaLancar/hutangLancar*100;
        calcLikuiditas=likuiditas;
        return likuiditas;
    }
}
