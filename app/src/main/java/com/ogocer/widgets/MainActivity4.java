package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity4 extends AppCompatActivity {
    private ImageView imgView;
    private VideoView videoView;
    private Button btnResim1,btnResim2,btnIntentto5,btnVideoBaslat,btnVideoDurdur,btnVideoDevam,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imgView = findViewById(R.id.imageView);
        videoView = findViewById(R.id.videoView);
        btnIntentto5 = findViewById(R.id.btnIntentto5);
        btnVideoBaslat = findViewById(R.id.btnVideoBaslat);
        btnVideoDurdur = findViewById(R.id.btnDurdur);
        btnVideoDevam = findViewById(R.id.btnVideoDevam);
        btnStop = findViewById(R.id.btnStop);
        btnResim1 = findViewById(R.id.btnResim1);
        btnResim2 = findViewById(R.id.btnResim2);


        btnResim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(R.drawable.turkiye);
            }
        });
        btnResim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(R.drawable.bosnahersek);
            }
        });


    }
}