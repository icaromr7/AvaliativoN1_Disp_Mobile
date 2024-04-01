package com.example.avaliativon1;

import android.graphics.Color;
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

public class CodSecret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cod_secret);

        //Campos de digitação para cada digito
        EditText dig1,dig2,dig3,dig4;
        dig1= findViewById(R.id.dig1);
        dig2= findViewById(R.id.dig2);
        dig3= findViewById(R.id.dig3);
        dig4= findViewById(R.id.dig4);

        //Número de tentativas
        final int[] tentativas = {0};

        //Digitos sorteados.
        int digCorreto1,digCorreto2,digCorreto3,digCorreto4;
        Random digitos = new Random();
        digCorreto1= digitos.nextInt(10);
        digCorreto2= digitos.nextInt(10);
        digCorreto3= digitos.nextInt(10);
        digCorreto4= digitos.nextInt(10);

        ArrayList <String> listaJogada = new ArrayList<>();

        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button enviar = findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jogada = "" + dig1.getText().toString() + dig2.getText().toString()+ dig3.getText().toString() + dig4.getText().toString();
                listaJogada.add(jogada);
                RecyclerView listaTentativas = findViewById(R.id.tentativas);
                listaTentativas.setLayoutManager(new LinearLayoutManager(v.getContext()));
                listaTentativas.setAdapter(new JogadaAdapter(listaJogada));

                tentativas[0]++;
                int cont=0;
                //Verificar 1º digito
                int digito1 =  Integer.parseInt(dig1.getText().toString());
                if(digito1==digCorreto1){
                    cont++;
                    dig1.setTextColor(Color.parseColor("#00bb24"));
                }
                else if(digito1==digCorreto2 || digito1==digCorreto3 || digito1==digCorreto4 ){
                    dig1.setTextColor(Color.parseColor("#ffbf00"));
                }
                else{
                    dig1.setTextColor(Color.parseColor("#d91d00"));
                }
                //Verificar 2º digito
                int digito2 =  Integer.parseInt(dig2.getText().toString());
                if(digito2==digCorreto2){
                    cont++;
                    dig2.setTextColor(Color.parseColor("#00bb24"));
                }
                else if(digito2==digCorreto1 || digito2==digCorreto3 || digito2==digCorreto4 ){
                    dig2.setTextColor(Color.parseColor("#ffbf00"));
                }
                else{
                    dig2.setTextColor(Color.parseColor("#d91d00"));
                }
                //Verificar 3º digito
                int digito3 =  Integer.parseInt(dig3.getText().toString());
                if(digito3==digCorreto3){
                    cont++;
                    dig3.setTextColor(Color.parseColor("#00bb24"));
                }
                else if(digito3==digCorreto1 || digito3==digCorreto2 || digito3==digCorreto4 ){
                    dig3.setTextColor(Color.parseColor("#ffbf00"));
                }
                else{
                    dig3.setTextColor(Color.parseColor("#d91d00"));
                }
                //Verificar 4º digito
                int digito4 =  Integer.parseInt(dig4.getText().toString());
                if(digito4==digCorreto4){
                    cont++;
                    dig4.setTextColor(Color.parseColor("#00bb24"));
                }
                else if(digito4==digCorreto1 || digito4==digCorreto3 || digito4==digCorreto2 ){
                    dig4.setTextColor(Color.parseColor("#ffbf00"));
                }
                else{
                    dig4.setTextColor(Color.parseColor("#d91d00"));
                }
                if(cont==4){
                    setContentView(R.layout.result_secret);
                    TextView resultadoDigito = findViewById(R.id.resultDigitos);
                    TextView resultTentativas = findViewById(R.id.qntTentativas);
                    resultadoDigito.setText(jogada + "\nVOCÊ GANHOU!!!!!!!");
                    resultTentativas.setText("Você tentou "+ tentativas[0] + " vezes!!");
                    Button button_back = findViewById(R.id.button_back);
                    button_back.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            finish();
                        }
                    });
                }
            }
        });

    }
}