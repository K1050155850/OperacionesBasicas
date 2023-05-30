package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class sumaActivity extends AppCompatActivity {

    public static final int RECOGNIZE_SPEECH_ACTIVITY = 1 ;

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
//Resta
    public void Restar(View view){
        //Accedemos al ID que colocamos en los botones y text fields
        EditText numero1 = findViewById(R.id.txt_num1);
        EditText numero2 = findViewById(R.id.txt_num2);
        TextView total = findViewById(R.id.txt_resultado);

        //Operamos con las variales
        double resultado = Double.parseDouble( numero1.getText().toString() )- Double.parseDouble( numero2.getText().toString());

        //Imprimimos los resultados

        total.setText(resultado+""); //Dentro del set tex lo colocamos como cadena poniendo resultado + ""
    }
    //Multiplicacion
    public void Multiplicar(View view){
        //Accedemos al ID que colocamos en los botones y text fields
        EditText numero1 = findViewById(R.id.txt_num1);
        EditText numero2 = findViewById(R.id.txt_num2);
        TextView total = findViewById(R.id.txt_resultado);

        //Operamos con las variales
        double resultado = Double.parseDouble( numero1.getText().toString() )* Double.parseDouble( numero2.getText().toString());

        //Imprimimos los resultados

        total.setText(resultado+""); //Dentro del set tex lo colocamos como cadena poniendo resultado + ""
    }
    //Division
    public void Dividir(View view){
        //Accedemos al ID que colocamos en los botones y text fields
        EditText numero1 = findViewById(R.id.txt_num1);
        EditText numero2 = findViewById(R.id.txt_num2);
        TextView total = findViewById(R.id.txt_resultado);

        //Operamos con las variales
        double resultado = Double.parseDouble( numero1.getText().toString() )/ Double.parseDouble( numero2.getText().toString());

        //Imprimimos los resultados

        total.setText(resultado+""); //Dentro del set tex lo colocamos como cadena poniendo resultado + ""
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String strSpeech2Text = speech.get(0);
                    //grabar.setText(strSpeech2Text);
                }
                break;
            default:
                break;
        }
    }
    public void onClickImgBtnHablar(View v) {
        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-ES");
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "No se pudo realizar el reconocimiento de voz",
                    Toast.LENGTH_SHORT).show();
        }
    }



}