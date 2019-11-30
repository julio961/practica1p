package com.example.practica_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practica_1p.utilidades.utilidades;

public class consulta extends AppCompatActivity {

    EditText c_id;
    TextView c_nombre;
    TextView c_telefono;
    Button consultar;


    // INICIO LA CONEXION CON LA BASE DE DATOS
    conexion x = new conexion(this, utilidades.tabla_usuario,null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);


        c_id = (EditText)findViewById(R.id.c_id);
        c_nombre = (TextView) findViewById(R.id.c_nombre);
        c_telefono = (TextView) findViewById(R.id.c_telefono);
        consultar = (Button) findViewById(R.id.consultar);




        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consultarSQL();
            }
        });

    }


    private void consultarSQL() {

        SQLiteDatabase db = x.getReadableDatabase();

        // DEFINIMOS LOS PARAMETROS DE CONSULTA
        String[] parametros = {c_id.getText().toString()};

        // DEFINIMOS LOS CAMPOS QUE NOS VA A DEVOLVER ESA CONSULTA
        //String[] campos = {utilidades.campo_nombre,utilidades.campo_telefono};

        try {
            //CONSTRUIMOS LA ESTRUCTURA PARA PODER ENVIAR LA INFORMACION A NUESTRA BASE DE DATOS
            Cursor cursor=db.rawQuery("SELECT "+ utilidades.campo_nombre+","+utilidades.campo_telefono+" FROM "+utilidades.tabla_usuario+" WHERE "+utilidades.campo_id+"=? ",parametros);
            cursor.moveToFirst();
            c_nombre.setText(cursor.getString(0));
            c_telefono.setText(cursor.getString(1));
        }catch (Exception e){
            Toast.makeText(this, "id invalido",Toast.LENGTH_LONG).show();
            limpiar();
        }

    }

    // EN CASO DE INTRODUCION UN ID INCORRETO LIMPIAREMOS EL FORMULARIO
    private void limpiar() {
        c_nombre.setText("");
        c_telefono.setText("");
    }

}
