package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_reg;
    Button btn_cons;
    Button btn_env;
    Button btn_env_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_reg = (Button)findViewById(R.id.btn_reg);
        btn_cons = (Button)findViewById(R.id.btn_cons);
        btn_env = (Button)findViewById(R.id.btn_env);
        btn_env_d = (Button)findViewById(R.id.btn_env_d);


        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, registro.class);
                startActivity(x);
            }
        });

        btn_cons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(MainActivity.this, consulta.class);
                startActivity(y);
            }
        });

        btn_env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(MainActivity.this, envio.class);
                startActivity(z);
            }
        });

        btn_env_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, ingreso_datos.class);
                startActivity(b);
            }
        });


    }
}
