package com.example.ProyectoCalidad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ConsultaAdministrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_administrador);

    }
    public void gestionarP(View view){

        Intent i = new Intent(this,GestionProducto.class);
        startActivity(i);
    }
}
