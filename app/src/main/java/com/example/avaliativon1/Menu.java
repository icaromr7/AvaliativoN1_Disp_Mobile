package com.example.avaliativon1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        final Intent[] intent = {getIntent()};

        Button cod, ppt, secret, random;
        cod = findViewById(R.id.cod);
        ppt = findViewById(R.id.ppt);
        secret = findViewById(R.id.secret);
        random = findViewById(R.id.random);

        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(Menu.this, Codificador.class);
                startActivity(intent[0]);
            }
        });
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(Menu.this, Ppt.class);
                startActivity(intent[0]);
            }
        });
        secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(Menu.this, CodSecret.class);
                startActivity(intent[0]);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(Menu.this, Randomizador.class);
                startActivity(intent[0]);
            }
        });
    }
}