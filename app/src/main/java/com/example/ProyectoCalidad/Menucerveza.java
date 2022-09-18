package com.example.ProyectoCalidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menucerveza extends AppCompatActivity {

    private TextView etiqueta;
    private CheckBox chc1,chc2,chc3,chc4,chc5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucerveza);
        etiqueta= findViewById(R.id.TotalV);
        chc1=findViewById(R.id.chc1);
        chc2=findViewById(R.id.chc2);
        chc3=findViewById(R.id.chc3);
        chc4=findViewById(R.id.chc4);
        chc5=findViewById(R.id.chc5);




    }
    public void btnPedido(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }

    public void operaciones(View view){
        String sumaTexto;
        double n1=0,n2=0,n3=0,n4=0,n5=0;
        double suma=0;

        if(chc1.isChecked()==true){
            n1=23;
        }
        else{
            n1=0;
        }
        if(chc2.isChecked()==true){
            n2=22.50;
        }
        else{
            n2=0;
        }
        if(chc3.isChecked()==true){
            n3=27.90;
        }
        else{
            n3=0;
        }
        if(chc4.isChecked()==true){
            n4=18.90;
        }
        else{
            n4=0;
        }
        if(chc5.isChecked()==true){
            n5=35;
        }
        else{
            n5=0;
        }


        suma=n1+n2+n3+n4+n5;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }
}