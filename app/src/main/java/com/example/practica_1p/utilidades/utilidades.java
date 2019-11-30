package com.example.practica_1p.utilidades;

public class utilidades {

    //CONSTANTES DE LOS CAMPOS DE LA TABLA USUARIOS
    public static final String tabla_usuario = "usuario";
    public static final String campo_id = "id";
    public static final String campo_nombre = "nombre";
    public static final String campo_telefono = "telefono";

    public static final String crear_tabla = "CREATE TABLE " + tabla_usuario + "("+campo_id+" INTEGER, "+campo_nombre+" TEXT, "+campo_telefono+" TEXT)";

}
