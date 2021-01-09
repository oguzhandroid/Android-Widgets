package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
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

        btnIsimAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isim = etIsim.getText().toString();
                if (!isim.equals("")){
                    tvIsimYaz.setText("İsminiz : "+isim);
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                boolean toggleKontrol = toggleButton.isChecked();
                if (isChecked && toggleKontrol){
                    tvSonucYaz.setText("Switch : Aktif\nToggle : Aktif");
                }else if (isChecked && !toggleKontrol){
                    tvSonucYaz.setText("Switch : Aktif\nToggle : Pasif");
                }else if (!isChecked && toggleKontrol){
                    tvSonucYaz.setText("Switch : Pasif\nToggle : Aktif");
                }else if (!isChecked && !toggleKontrol){
                    tvSonucYaz.setText("Switch : Pasif\nToggle : Pasif");
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                boolean switchKontrol = aSwitch.isChecked();
                if (isChecked && switchKontrol){
                    tvSonucYaz.setText("Switch : Aktif\nToggle : Aktif");
                }else if (isChecked && !switchKontrol){
                    tvSonucYaz.setText("Switch : Pasif\nToggle : Aktif");
                }else if (!isChecked && switchKontrol){
                    tvSonucYaz.setText("Switch : Aktif\nToggle : Pasif");
                }else if (!isChecked && !switchKontrol){
                    tvSonucYaz.setText("Switch : Pasif\nToggle : Pasif");
                }
            }
        });




    }
}