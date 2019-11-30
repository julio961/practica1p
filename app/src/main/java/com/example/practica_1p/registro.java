package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practica_1p.utilidades.utilidades;

public class registro extends AppCompatActivity {

    EditText id;
    EditText nom;
    EditText tlf;
    Button reg;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        
        id = (EditText)findViewById(R.id.id);
        nom = (EditText)findViewById(R.id.nom);
        tlf = (EditText)findViewById(R.id.tlf);
        reg = (Button)findViewById(R.id.reg);
                
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuario();
            }
        });
        
        
    }

    private void registrarUsuario() {

        // INICIO LA CONEXION CON LA BASE DE DATOS
        conexion x = new conexion(this, utilidades.tabla_usuario,null,1);

        // ABRO LA BASE DE DATOS PARA PODER EDITARLA
        SQLiteDatabase db = x.getWritableDatabase();

        // AGREGO LOS VALORES EN LOS CAMPOS
        ContentValues values = new ContentValues();
        values.put(utilidades.campo_id,id.getText().toString());
        values.put(utilidades.campo_nombre,nom.getText().toString());
        values.put(utilidades.campo_telefono,tlf.getText().toString());

        // INSERTO LOS VALORES EN LA BD
        Long idResultante = db.insert(utilidades.tabla_usuario, utilidades.campo_id, values);

        Toast.makeText(this, "Registrado", Toast.LENGTH_LONG).show();
        db.close();

    }
}
