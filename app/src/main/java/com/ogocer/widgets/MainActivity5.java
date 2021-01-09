package com.ogocer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

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


        etSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int saat = calendar.get(Calendar.HOUR_OF_DAY);
                int dakika = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(MainActivity5.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etSaat.setText(hourOfDay+" : "+minute);
                    }
                },saat,dakika,true);


                timePicker.setTitle("Saat Seçiniz");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",timePicker);
                timePicker.show();
            }
        });

        etTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yil = calendar.get(Calendar.YEAR);
                int ay = calendar.get(Calendar.MONTH);
                int gun = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker;
                datePicker = new DatePickerDialog(MainActivity5.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        etTarih.setText(gun+"/"+(ay+1)+"/"+yil);
                    }
                },yil,ay,gun);
                datePicker.setTitle("Tarihi Seçiniz");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",datePicker);
                datePicker.show();

            }
        });


    }
}