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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class Randomizador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_randomizador);

        EditText text = findViewById(R.id.text);
        TextView sorteado = findViewById(R.id.sorteado);
        ArrayList <String> lista = new ArrayList<>();
        Button enviar = findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = text.getText().toString();
                lista.add(texto);

                RecyclerView recyclerView = findViewById(R.id.lista);
                recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
                recyclerView.setAdapter(new TextoAdapter(lista));
            }
        });

        Button sortear = findViewById(R.id.sortear);
        sortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random sorte = new Random();
                int posSorteado = sorte.nextInt(lista.size());
                sorteado.setText("Sorteado: " + lista.get(posSorteado));
            }
        });

    }
}