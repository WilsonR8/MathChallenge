package com.will.mathchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView pregunta;
    private EditText respuesta;
    private TextView responder;
    private TextView puntajetxt;
    private TextView puntaje;
    private Pregunta preguntita;
    private String convert;
    private int p=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Referenciar
        puntajetxt= findViewById(R.id.puntajetxt);
        puntaje= findViewById(R.id.puntaje);
        responder= findViewById(R.id.responder);
        respuesta= findViewById(R.id.respuesta);
        pregunta= findViewById(R.id.pregunta);
        preguntita= new Pregunta();


        //LLamo al metodo que contiene mi pregunta random y lo casteo a String
        preguntita.numeros();
        pregunta.setText(""+preguntita.getA() + " " + "+"+" "+preguntita.getB());
        convert = Integer.toString(preguntita.getC());




        //OnClick
        responder.setOnClickListener(
        (v) -> {

            String test = respuesta.getText().toString();

            //Log.e("intento",""+convert);
            //Log.e("averlan","hola"+ test);

            //Validacion de respuesta
            if(convert.equals(test)){

         p++;
            puntaje.setText(""+p);
         Toast.makeText(this,"CORRECTOOO",Toast.LENGTH_LONG).show();

         preguntita.numeros();
         pregunta.setText(""+preguntita.getA() + " " + "+"+" "+preguntita.getB());
         convert = Integer.toString(preguntita.getC());

        }else{
         Toast.makeText(this,"INCORRECTOOO",Toast.LENGTH_LONG).show();
     }

        });


















    }
}