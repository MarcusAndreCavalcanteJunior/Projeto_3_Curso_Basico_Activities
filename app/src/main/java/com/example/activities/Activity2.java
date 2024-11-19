package com.example.activities;

import  android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {/*cria a classe Activity2 e extends ela
para nossa aplcação no caso AppCompatActivity e da o Override e cria o metodo onCreate
abaixo */
/*OBS LEIA ANTES Os Estágios do ciclo de vida da atividade
CLICO DE VIDA DAS ACTIVITIES 1 MÉTODO onCreate*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);//Aqui seta a visualização do nosso aplicativo.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;/* ViewCompat utilizado para usar toda parte util da tela
            e assim vimos todo o metodo onCreate.*/
        });
        //Create a new toast para chamar o método onCrete.
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
/*  Ficar esperto com o fechamento desse método só passar o mouse na primeira chave
que ela vai piscar e indicar onde termina o metodo fique esperto. E podemos minimizar na
seta > para ele ficar mais limpo na tela.
  1 METODO onCreate
Próximo método do ciclo de vida da activity
é o método onStart menu superior code>Override Methods> e digitar onStart
para achar rapidamente o método ou pode usar o atalho ctrl+o*/

/* 2 METODO onStart o android sempre vai executar os metodos na sequencia onCreate,onStart,
* e assim por diante não importa a ordem que estiver escrita o código*/
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String nome = extras.getString("nome");
            TextView tvwNome = findViewById(R.id.tvw_Nome);
            tvwNome.setText(nome);
        }
    }
/* ? onRestart */
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    /* 3 METODO onResume cuidado nesse para ir no certo em void onResume*/
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
/* 4 onPause  */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
/* 5 onStop */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
/* 6 onDestroy */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
