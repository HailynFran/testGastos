package com.example.gastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class agregar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
    }

    public void regresarInicio(View view){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void supermercado(View view){
        Toast.makeText(this,"Supermercado",Toast.LENGTH_LONG).show();

    }


}