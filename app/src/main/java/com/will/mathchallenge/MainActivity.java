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
    private TextView puntajetxt;
    private TextView puntaje;
    private Pregunta preguntita;
    private String convert;
    private int p=0;
    private String pnew;


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



        preguntita.numeros();
        pregunta.setText(""+preguntita.getA() + " " + "+"+" "+preguntita.getB());
        convert = Integer.toString(preguntita.getC());
        pnew= Integer.toString(p);




        responder.setOnClickListener(
        (v) -> {

            String test = respuesta.getText().toString();
            //Toast.makeText(this,test+"",Toast.LENGTH_LONG).show();
Log.e("intento",""+convert);
            Log.e("averlan","hola"+ test);
            Log.e("ss","inss"+ pnew);


     if(convert.equals(test)){
            //preguntita.numeros();
         p++;
            puntaje.setText(""+p);

         preguntita.numeros();
         pregunta.setText(""+preguntita.getA() + " " + "+"+" "+preguntita.getB());
        }

        });


















    }
}