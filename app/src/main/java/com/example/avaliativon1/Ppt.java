package com.example.avaliativon1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.*;

public class Ppt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ppt);
        TextView result = findViewById(R.id.result);

        Button pedra = findViewById(R.id.pedra);
        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random computador = new Random();
                int comp = computador.nextInt(3)+1;
                JogadaComputador(comp);
                if(comp==1){//Pedra
                    result.setText("EMPATOU");
                }
                else if (comp==2){//Papel
                    result.setText("VOCÊ PERDEU!!!");
                }
                else{//Tesoura
                    result.setText("VOCÊ GANHOOOOU!!!!");
                }
            }
        });
        Button papel = findViewById(R.id.papel);
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random computador = new Random();
                int comp = computador.nextInt(3)+1;
                JogadaComputador(comp);
                if(comp==1){//Pedra
                    result.setText("VOCÊ GANHOOOOU!!!!");
                }
                else if (comp==2){//Papel
                    result.setText("EMPATOU");
                }
                else{//Tesoura
                    result.setText("VOCÊ PERDEU!!!");
                }
            }
        });
        Button tesoura = findViewById(R.id.tesoura);
        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random computador = new Random();
                int comp = computador.nextInt(3)+1;
                JogadaComputador(comp);
                if(comp==1){//Pedra
                    result.setText("VOCÊ PERDEU!!!");
                }
                else if (comp==2){//Papel
                    result.setText("VOCÊ GANHOOOOU!!!!");
                }
                else{//Tesoura
                    result.setText("EMPATOU");
                }
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
    public void JogadaComputador (int comp){
        ImageView computador = findViewById(R.id.Computador);
        if(comp==1){
            computador.setBackgroundResource(R.drawable.pedra);
        }
        else if (comp==2){
            computador.setBackgroundResource(R.drawable.papel);
        }
        else{
            computador.setBackgroundResource(R.drawable.tesoura);
        }
    }

} 