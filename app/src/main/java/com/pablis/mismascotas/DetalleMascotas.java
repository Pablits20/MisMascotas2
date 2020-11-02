package com.pablis.mismascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleMascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascotas);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String huesitos = parametros.getString("huesitos");
        int foto = parametros.getInt("foto");

        TextView tvnombre = (TextView) findViewById(R.id.tvnombre);
        TextView tvmegusta = (TextView) findViewById(R.id.tvmegusta);
        ImageView ivfoto = (ImageView) findViewById(R.id.ivfoto);
        tvnombre.setText(nombre);
        tvmegusta.setText(huesitos);
        ivfoto.setImageResource(foto);
    }


}