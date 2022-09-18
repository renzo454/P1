package com.example.ProyectoCalidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menuwhisky extends AppCompatActivity {

    private TextView etiqueta;
    private CheckBox chW1,chW2,chW3,chW4,chW5,chW6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuwhisky);
        etiqueta= findViewById(R.id.TotalV);
        chW1=findViewById(R.id.chW1);
        chW2=findViewById(R.id.chw2);
        chW3=findViewById(R.id.chw3);
        chW4=findViewById(R.id.chw4);
        chW5=findViewById(R.id.chw5);
        chW6=findViewById(R.id.chw6);


    }

    public void btnPedido6(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }
    public void operaciones(View view){
        String sumaTexto;
        int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
        int suma=0;

        if(chW1.isChecked()==true){
            n1=20;
        }
        else{
            n1=0;
        }
        if(chW2.isChecked()==true){
            n2=40;
        }
        else{
            n2=0;
        }
        if(chW3.isChecked()==true){
            n3=100;
        }
        else{
            n3=0;
        }
        if(chW4.isChecked()==true){
            n4=120;
        }
        else{
            n4=0;
        }
        if(chW5.isChecked()==true){
            n5=200;
        }
        else{
            n5=0;
        }
        if(chW6.isChecked()==true){
            n6=250;
        }
        else{
            n6=0;
        }

        suma=n1+n2+n3+n4+n5+n6;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }

}