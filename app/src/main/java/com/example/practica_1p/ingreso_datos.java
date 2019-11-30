package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ingreso_datos extends AppCompatActivity {

    EditText ing_nom, ing_tlf, ing_correo;
    Button btn_env;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_datos);
        ing_nom = (EditText)findViewById(R.id.ing_nom);
        ing_tlf = (EditText)findViewById(R.id.ing_tlf);
        ing_correo = (EditText)findViewById(R.id.ing_correo);
        btn_env = (Button)findViewById(R.id.btn_env);


        btn_env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ingreso_datos.this,datos_personales.class );

                    Bundle nombre = new Bundle();
                    nombre.putString("nombre", ing_nom.getText().toString());
                    i.putExtras(nombre);

                        Bundle telefono = new Bundle();
                        telefono.putString("telefono", ing_tlf.getText().toString());
                        i.putExtras(telefono);

                            Bundle correo = new Bundle();
                            correo.putString("correo", ing_correo.getText().toString());
                            i.putExtras(correo);

                startActivity(i);
            }
        });

    }
}
