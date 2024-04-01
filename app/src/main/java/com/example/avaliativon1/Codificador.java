package com.example.avaliativon1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class Codificador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_codificador);

        EditText valor = findViewById(R.id.text);
        TextView result = findViewById(R.id.result);

        //Codificador
        Button cod = findViewById(R.id.codificar);
        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = valor.getText().toString();
                String novoText = codificar(text);
                result.setText(novoText);
            }
        });
        //Descodificador
        Button descod = findViewById(R.id.descodificar);
        descod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = valor.getText().toString();
                String novoText = descodificar(text);
                result.setText(novoText);
            }
        });
        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public String codificar (String text){
        int cont = text.length();
        String novoText= "";
        for(int i=0; i<cont;i++){
            char L = text.charAt(i);
            int nL = (int) L +2;
            L = (char) nL;
            novoText += L;
        }
        return novoText;
    }

    public String descodificar (String text){
        int cont = text.length();
        String novoText= "";
        for(int i=0; i<cont;i++){
            char L = text.charAt(i);
            int nL = (int) L -2;
            L = (char) nL;
            novoText += L;
        }
        return novoText;
    }
}