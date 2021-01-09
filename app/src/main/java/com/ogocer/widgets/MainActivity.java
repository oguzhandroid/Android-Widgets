package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private EditText etIsim;
    private TextView tvIsimYaz,tvSonucYaz;
    private Button btnIsimAl,btnIntent;
    private ToggleButton toggleButton;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIsim = findViewById(R.id.etIsim);
        tvIsimYaz = findViewById(R.id.textViewIsimYaz);
        tvSonucYaz = findViewById(R.id.textViewToggleSwitch);
        btnIsimAl = findViewById(R.id.buttonIsimAl);
        btnIntent = findViewById(R.id.buttonIntent);
        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);
    }
}