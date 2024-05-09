package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText TxtN1, TxtN2;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtN1 = (EditText) findViewById(R.id.TxtN1);
        TxtN2 = (EditText) findViewById(R.id.TxtN2);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt(TxtN1.getText().toString());
        int valor2 = Integer.parseInt(TxtN2.getText().toString());

        String resultado = String.valueOf(valor1 + valor2);

        txtResult.setText(resultado);
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt(TxtN1.getText().toString());
        int valor2 = Integer.parseInt(TxtN2.getText().toString());

        String resultado = String.valueOf(valor1 - valor2);

        txtResult.setText(resultado);
    }
    public void Teladois(View view){
        Intent in = new Intent(MainActivity.this, TelaDoix.class);
        startActivity(in);
    }
}
