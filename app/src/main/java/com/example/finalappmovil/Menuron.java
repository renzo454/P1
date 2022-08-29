package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menuron extends AppCompatActivity {
    private TextView etiqueta;
    private CheckBox chr1,chr2,chr3,chr4,chr5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuron);
        etiqueta= findViewById(R.id.TotalV);
        chr1=findViewById(R.id.chc1);
        chr2=findViewById(R.id.chc2);
        chr3=findViewById(R.id.chc3);
        chr4=findViewById(R.id.chc4);
        chr5=findViewById(R.id.chc5);



    }
    public void btnPedido3(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }
    public void operaciones(View view){
        String sumaTexto;
        double n1=0,n2=0,n3=0,n4=0,n5=0;
        double suma=0;

        if(chr1.isChecked()==true){
            n1=18;
        }
        else{
            n1=0;
        }
        if(chr2.isChecked()==true){
            n2=20;
        }
        else{
            n2=0;
        }
        if(chr3.isChecked()==true){
            n3=19;
        }
        else{
            n3=0;
        }
        if(chr4.isChecked()==true){
            n4=30;
        }
        else{
            n4=0;
        }
        if(chr5.isChecked()==true){
            n5=27.50;
        }
        else{
            n5=0;
        }


        suma=n1+n2+n3+n4+n5;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }
}