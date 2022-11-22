package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnEliminar;
    public static final String EXTRA_MESSAGE = "com.example.intentpasardatos.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnEnviar = findViewById(R.id.btnEnviar);
        final Button btnEliminar = findViewById(R.id.btnEliminar);
        final EditText etTexto = findViewById(R.id.etTexto);

        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTexto.setText("");
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviarDatos = new Intent(MainActivity.this, Segunda.class);
                String texto = etTexto.getText().toString();
                enviarDatos.putExtra(EXTRA_MESSAGE, texto);
                startActivity(enviarDatos);
            }
        });
    }
}