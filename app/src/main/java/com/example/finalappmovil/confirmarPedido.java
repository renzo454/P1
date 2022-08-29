package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class confirmarPedido extends AppCompatActivity {

        RadioButton c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_pedido);
        c1=(RadioButton)findViewById(R.id.r1);
        c2=(RadioButton)findViewById(R.id.r2);

    }
    public void btnCancelar(View view){
        Intent i = new Intent(this,listadeBebidas.class);
        startActivity(i);
    }
    public void onclick(View view){
        if (view.getId()==R.id.btnPago){
            validar();
        }
    }
    private void validar(){
        if (c1.isChecked()==true){
            Intent i = new Intent(this,gracias.class);
            startActivity(i);
        }
        if(c2.isChecked()){
            Intent i = new Intent(this,datosTarjeta.class);
            startActivity(i);
        }
    }

}