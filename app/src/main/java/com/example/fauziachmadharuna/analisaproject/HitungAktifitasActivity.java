package com.example.fauziachmadharuna.analisaproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by fauziachmadharuna on 11/9/17.
 */

public class HitungAktifitasActivity extends AppCompatActivity {
    Button hitungAktifitas;
    EditText penjualanNeto;
    EditText totalHarta;
    Button hasilAnalisa;
    TextView hasilAktifitas;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_aktifitas_activity);
        penjualanNeto=findViewById(R.id.et_penjualan_neto);
        totalHarta=findViewById(R.id.et_totalHarta);
        hasilAktifitas=findViewById(R.id.tv_hasil_aktifitas);

        hitungAktifitas=findViewById(R.id.btn_hitung_aktifitas);
        hitungAktifitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiPenjualan=penjualanNeto.getText().toString();
//                String nilaiHarta=totalHarta.getText()
            }
        });



    }
    Double hitungAktifitas(double penjualanNeto, double totalHarta){
        double aktifitas=penjualanNeto/totalHarta*100;
        return aktifitas;
    }


}
