package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dato extends AppCompatActivity {

    TextView dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dato);

        dato = (TextView)findViewById(R.id.dato);

        Bundle bundle = this.getIntent().getExtras();
        dato.setText("el parámetro enviado es: " +  bundle.getString("dato1"));

    }
}
