package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Menuvino extends AppCompatActivity {
    private TextView etiqueta;
    private CheckBox chvi1,chvi2,chvi3,chvi4,chvi5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuvino);
        etiqueta= findViewById(R.id.TotalV);
        chvi1=findViewById(R.id.chvi1);
        chvi2=findViewById(R.id.chvi2);
        chvi3=findViewById(R.id.chvi3);
        chvi4=findViewById(R.id.chvi4);
        chvi5=findViewById(R.id.chvi5);



    }

    public void btnPedido4(View view){
        Intent i = new Intent(this,confirmarPedido.class);
        startActivity(i);
    }
    public void operaciones(View view){
        String sumaTexto;
        double n1=0,n2=0,n3=0,n4=0,n5=0;
        double suma=0;

        if(chvi1.isChecked()==true){
            n1=21.50;
        }
        else{
            n1=0;
        }
        if(chvi2.isChecked()==true){
            n2=18.50;
        }
        else{
            n2=0;
        }
        if(chvi3.isChecked()==true){
            n3=19.90;
        }
        else{
            n3=0;
        }
        if(chvi4.isChecked()==true){
            n4=17.00;
        }
        else{
            n4=0;
        }
        if(chvi5.isChecked()==true){
            n5=24;
        }
        else{
            n5=0;
        }


        suma=n1+n2+n3+n4+n5;
        sumaTexto=" "+suma;
        etiqueta.setText(sumaTexto);


    }

}