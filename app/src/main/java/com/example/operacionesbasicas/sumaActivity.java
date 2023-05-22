package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }
    public void regresaMenu(View view){
        this.finish();
    }

    public void Sumar(View view){
        //Accedemos al ID que colocamos en los botones y text fields
        EditText numero1 = findViewById(R.id.txt_num1);
        EditText numero2 = findViewById(R.id.txt_num2);
        TextView total = findViewById(R.id.txt_resultado);

        //Operamos con las variales
        double resultado = Double.parseDouble( numero1.getText().toString() )+ Double.parseDouble( numero2.getText().toString());

        //Imprimimos los resultados

        total.setText(resultado+""); //Dentro del set tex lo colocamos como cadena poniendo resultado + ""
    }

}