package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity5 extends AppCompatActivity {
    private TextView tvSaat,tvTarih;
    private EditText etSaat,etTarih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tvSaat = findViewById(R.id.tvSaat);
        tvTarih = findViewById(R.id.tvTarih);
        etSaat = findViewById(R.id.etSaat);
        etTarih = findViewById(R.id.etTarih);

        Calendar calendar = Calendar.getInstance();
        int saat = calendar.get(Calendar.HOUR_OF_DAY);
        int dakika = calendar.get(Calendar.MINUTE);
        int yil = calendar.get(Calendar.YEAR);
        int ay = calendar.get(Calendar.MONTH);
        int gun = calendar.get(Calendar.DAY_OF_MONTH);

        tvSaat.setText(saat + " : "+dakika);
        tvTarih.setText(gun+"/"+(ay+1)+"/"+yil);



    }
}