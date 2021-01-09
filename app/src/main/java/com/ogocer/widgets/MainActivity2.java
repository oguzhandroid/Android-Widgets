package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox cbJava,cbKotlin;
    private RadioButton rbFb,rbGs;
    private Button btnCbSonuc,btnRbSonuc,btnIntentTo3;
    private TextView tvRbSonuc,tvCbSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cbJava = findViewById(R.id.cbJava);
        cbKotlin = findViewById(R.id.cbKotlin);
        rbFb = findViewById(R.id.rbFenerbahce);
        rbGs = findViewById(R.id.rbGalatasaray);
        btnCbSonuc = findViewById(R.id.btnCheckBoxSonuc);
        btnRbSonuc = findViewById(R.id.btnRadioSonuc);
        btnIntentTo3 = findViewById(R.id.btnIntentTo3);
        tvRbSonuc = findViewById(R.id.tvRadioSonuc);
        tvCbSonuc = findViewById(R.id.tvCheckBoxSonuc);

        rbFb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    tvRbSonuc.setText("FENERBAHÇE");
                }
            }
        });
        rbGs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    tvRbSonuc.setText("GALATASARAY");
                }
            }
        });

        btnCbSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean javaSecim = cbJava.isChecked();
                boolean kotlinSecim = cbKotlin.isChecked();

                if (javaSecim && kotlinSecim){
                    tvCbSonuc.setText("Bildiğiniz Diller : Java ve Kotlin");
                }else if (javaSecim && !kotlinSecim){
                    tvCbSonuc.setText("Bildiğiniz Diller : Java");
                }else if (!javaSecim && kotlinSecim){
                    tvCbSonuc.setText("Bildiğiniz Diller : Kotlin");
                }else if (!javaSecim && !kotlinSecim){
                    tvCbSonuc.setText("Bildiğiniz Diller : Boş");
                }
            }
        });
    }
}