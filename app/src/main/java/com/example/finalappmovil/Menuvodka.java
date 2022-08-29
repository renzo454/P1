package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menuvodka extends AppCompatActivity {

    private TextView etiqueta;
    private CheckBox chv1,chv2,chv3,chv4,chv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuvodka);
        etiqueta= findViewById(R.id.TotalV);
        chv1=findViewById(R.id.chc1);
        chv2=findViewById(R.id.chc2);
        chv3=findViewById(R.id.chc3);
        chv4=findViewById(R.id.chc4);
        chv5=findViewById(R.id.chc5);



    }

    public void btnPedido5(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }

    public void operaciones(View view){
        String sumaTexto;
      double n1=0,n2=0,n3=0,n4=0,n5=0;
        double suma=0;

        if(chv1.isChecked()==true){
            n1=16.50;
        }
        else{
            n1=0;
        }
        if(chv2.isChecked()==true){
            n2=18.50;
        }
        else{
            n2=0;
        }
        if(chv3.isChecked()==true){
            n3=21.30;
        }
        else{
            n3=0;
        }
        if(chv4.isChecked()==true){
            n4=29.90;
        }
        else{
            n4=0;
        }
        if(chv5.isChecked()==true){
            n5=25.50;
        }
        else{
            n5=0;
        }


        suma=n1+n2+n3+n4+n5;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }

}