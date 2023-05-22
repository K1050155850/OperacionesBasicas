package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSuma(View view){
        Intent intent= new Intent(this, sumaActivity.class);
        view.getContext().startActivity(intent);
    }
    //VIEW es la super clase de vista grafica
    //INTENT es un objeto que indica la actividad que va a iniciar
    //START ACTIVITY inicia el ciclo de vida de nuestra actividad
}