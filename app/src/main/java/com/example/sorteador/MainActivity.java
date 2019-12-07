package com.example.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText etInicio, etFim;
    int max, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sortear(View view){
        txtResultado = findViewById(R.id.txtResultado);
        etInicio = findViewById(R.id.etInicio);
        etFim = findViewById(R.id.etFim);
        Random rand = new Random();


        if(etInicio.getText().toString().trim().equals("")||
                etFim.getText().toString().trim().equals("")){
            txtResultado.setText("Insira valor inicial e final!");
        }else{
            max = Integer.parseInt(etFim.getText().toString());
            min = Integer.parseInt(etInicio.getText().toString());
            if(max<min){
            txtResultado.setText("Valor Final deve ser maior que Inicial!");
            }
            else{

                int randomNum = rand.nextInt((max - min) + 1) + min;
                txtResultado.setText("Valor sorteado: "+randomNum);
            }
        }

    }
}
