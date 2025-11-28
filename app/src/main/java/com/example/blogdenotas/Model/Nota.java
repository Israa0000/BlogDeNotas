package com.example.blogdenotas.Model;

import android.graphics.Color;

public class Nota {
    private String titulo;
    private String descripcion;
    private Color color;
    private int fecha;

    public Nota (String titulo, String descripcion, Color color, int fecha){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.color = color;
        this.fecha = fecha;
    }

    public Nota (){
        this.titulo ="";
        this.descripcion = "";
        this.color = new Color();
        this.fecha = 0;
    }


    //Getters
    public String getTitulo(){return this.titulo;}
    public String getDescripcion(){return this.descripcion;}
    public Color getColor(){return this.color;}
    public int getFecha(){return this.fecha;}

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    public String notaToString(){
        return "Nota{"+ "Titulo: "+titulo+", Descripcion: "+ descripcion + ", Color: "+ color +", fecha: "+ fecha +"}";
    }
}
