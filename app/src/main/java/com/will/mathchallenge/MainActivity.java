package com.will.mathchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pregunta;
    private EditText respuesta;
    private TextView responder;
    private TextView puntaje;
    private Pregunta preguntita;
    private String convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Referenciar
        puntaje= findViewById(R.id.puntajetxt);
        responder= findViewById(R.id.responder);
        respuesta= findViewById(R.id.respuesta);
        pregunta= findViewById(R.id.pregunta);

        preguntita= new Pregunta();


        preguntita.numeros();
        pregunta.setText(""+preguntita.getA() + " " + "+"+" "+preguntita.getB());
        convert = Integer.toString(preguntita.getC());



        responder.setOnClickListener(
        (v) -> {

            String test = respuesta.getText().toString();
            //Toast.makeText(this,test+"",Toast.LENGTH_LONG).show();
Log.e("intento",""+convert);
            Log.e("averlan","hola"+ test);


     if(convert.equals(test)){
            //preguntita.numeros();
            pregunta.setText("Wenas");
        }

        });


















    }
}