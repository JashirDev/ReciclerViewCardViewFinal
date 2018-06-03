package com.example.gamer.reciclerviewcardviewfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Persona> lista;
    RecyclerView reciclador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista= new ArrayList<>();
        reciclador=findViewById(R.id.reciclador);
        reciclador.setHasFixedSize(true);
        reciclador.setLayoutManager(new LinearLayoutManager(this));
        llenardatos();
        PersonaAdapter adapter= new PersonaAdapter(lista);
        reciclador.setAdapter(adapter);

    }

    public void llenardatos(){
        lista.add(new Persona("krosty","putoo",R.drawable.bart));
        lista.add(new Persona("krosty","putooooooooo",R.drawable.flanders));
        lista.add(new Persona("krosty","putooo",R.drawable.lisa));
        lista.add(new Persona("krosty","putooo",R.drawable.homero));
        lista.add(new Persona("krosty","putoooooooooooo",R.drawable.krusti));
        lista.add(new Persona("krosty","putoooo",R.drawable.magie));
        lista.add(new Persona("krosty","puto",R.drawable.krusti));
        lista.add(new Persona("krosty","puto",R.drawable.magie));
        lista.add(new Persona("krosty","puto",R.drawable.milhouse));
        lista.add(new Persona("krosty","puto",R.drawable.bart));

    }
}
