package com.example.finalappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void IrIniciar(View view){
        Intent i = new Intent(this,loginActivity.class);
        startActivity(i);
    }
    public void IrRegistrarse(View view){
        Intent i = new Intent(this,RegistrarActivity.class);
        startActivity(i);
    }


}