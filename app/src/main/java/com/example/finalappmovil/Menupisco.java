package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menupisco extends AppCompatActivity {
    private TextView etiqueta;
    private CheckBox chp1,chp2,chp3,chp4,chp5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupisco);
        etiqueta= findViewById(R.id.TotalV);
        chp1=findViewById(R.id.chc1);
        chp2=findViewById(R.id.chc2);
        chp3=findViewById(R.id.chc3);
        chp4=findViewById(R.id.chc4);
        chp5=findViewById(R.id.chc5);



    }
    public void btnPedido2(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }


    public void operaciones(View view){
        String sumaTexto;
        double n1=0,n2=0,n3=0,n4=0,n5=0;
        double suma=0;

        if(chp1.isChecked()==true){
            n1=28.50;
        }
        else{
            n1=0;
        }
        if(chp2.isChecked()==true){
            n2=23.30;
        }
        else{
            n2=0;
        }
        if(chp3.isChecked()==true){
            n3=22.50;
        }
        else{
            n3=0;
        }
        if(chp4.isChecked()==true){
            n4=20.90;
        }
        else{
            n4=0;
        }
        if(chp5.isChecked()==true){
            n5=25.90;
        }
        else{
            n5=0;
        }


        suma=n1+n2+n3+n4+n5;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }

}