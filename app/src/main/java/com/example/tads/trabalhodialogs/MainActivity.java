package com.example.tads.trabalhodialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarHora(View view){

        Hora hora = new Hora();
        hora.show(getSupportFragmentManager(), "dialog");

    }

    public void mostrarData(View view){

        Data data = new Data();
        data.show(getSupportFragmentManager(), "dialog");
    }
}
