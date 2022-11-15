package com.urdiera12.evaluacion2_login_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Botones extends AppCompatActivity {


    Button siguiente;
    Button siiu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        siguiente=(Button)findViewById(R.id.btn_integrantes);
        siguiente.setOnClickListener(new View.OnClickListener(){

            @Override
            public void  onClick(View v){

                Intent i = new Intent(Botones.this, Integrantes.class);
                startActivity(i);
            }

        });

        siiu=(Button)findViewById(R.id.btn_youtube);
        siiu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void  onClick(View v){

                Intent i = new Intent(Botones.this, Youtube_api.class);
                startActivity(i);
            }

        });

    }
}