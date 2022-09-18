package com.example.ProyectoCalidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listadeBebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_bebidas);
    }
    public void btnCerveza(View view){
        Intent i = new Intent(this,Menucerveza.class);
        startActivity(i);
    }

    public void btnPisco(View view){
        Intent i = new Intent(this,Menupisco.class);
        startActivity(i);
    }
    public void btnRon(View view){
        Intent i = new Intent(this,Menuron.class);
        startActivity(i);
    }
    public void btnVino(View view){
        Intent i = new Intent(this,Menuvino.class);
        startActivity(i);
    }
    public void btnVodka(View view){
        Intent i = new Intent(this,Menuvodka.class);
        startActivity(i);
    }
    public void btnWhisky(View view){
        Intent i = new Intent(this,Menuwhisky.class);
        startActivity(i);
    }

}