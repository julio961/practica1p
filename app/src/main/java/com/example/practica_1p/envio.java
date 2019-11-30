package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class envio extends AppCompatActivity {


    EditText dato;
    Button btn_env;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio);


        dato = (EditText)findViewById(R.id.dato);
        btn_env = (Button)findViewById(R.id.btn_env);

        btn_env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(envio.this, dato.class);
                Bundle x = new Bundle();
                x.putString("dato1",dato.getText().toString());
                i.putExtras(x);
                startActivity(i);
            }
        });


    }
}
