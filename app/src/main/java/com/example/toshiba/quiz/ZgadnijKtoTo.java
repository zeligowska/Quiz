package com.example.toshiba.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ZgadnijKtoTo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zgadnij_kto_to);


    }
    Toast.makeText(getApplicationContext(),"Tekst do wyświetlenia: ", Toast.LENGTH_LONG).
    show();
}
