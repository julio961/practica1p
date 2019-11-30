package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class datos_personales extends AppCompatActivity {

    TextView nom_d, tlf_d, correo_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales);
        nom_d = (TextView)findViewById(R.id.nom_d);
        tlf_d = (TextView)findViewById(R.id.tlf_d);
        correo_d = (TextView)findViewById(R.id.correo_d);

        Bundle bundle = this.getIntent().getExtras();
        nom_d.setText(bundle.getString("nombre"));
        tlf_d.setText(bundle.getString("telefono"));
        correo_d.setText(bundle.getString("correo"));
    }
}
