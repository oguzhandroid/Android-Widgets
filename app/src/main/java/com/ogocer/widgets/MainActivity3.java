package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private Button btnCalistir,btnDurdur,btnIntentTo4,btnOyVer;
    private ProgressBar progressBar;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private TextView tvPuan,tvSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnCalistir = findViewById(R.id.btnCalistir);
        btnDurdur = findViewById(R.id.btnDurdur);
        btnOyVer = findViewById(R.id.btnOyVer);
        btnIntentTo4 = findViewById(R.id.btnIntentto4);
        progressBar = findViewById(R.id.progressBar);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        tvPuan = findViewById(R.id.tvPuan);
        tvSeekbar = findViewById(R.id.tvSeekbar);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });
        btnDurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        btnOyVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float verilenOy = ratingBar.getRating();
                tvPuan.setText("Puan : "+verilenOy);
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekbar.setText("Seekbar : "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnIntentTo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity4.class));
            }
        });
    }
}