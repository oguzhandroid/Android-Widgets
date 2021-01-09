package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

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
    }
}