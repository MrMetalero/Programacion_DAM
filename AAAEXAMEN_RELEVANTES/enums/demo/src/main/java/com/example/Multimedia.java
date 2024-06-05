package com.example;

public class Multimedia {
    
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia (String t, String a, Formato f, int d){
        titulo = t;
        autor = a;
        formato = f;
        duracion = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }



    public String toString(){
        return ("Titulo: " + titulo + "\n"
                +"Autor: " + autor+ "\n"
                +"Formato: " + formato + "\n"
                +"Duración: " + duracion + "\n");


    }

    public boolean equals(Multimedia m){
        if (titulo.equals(m.getTitulo())&& autor.equals(m.getAutor())){

            return true;


        }else {return false;}
    }





}
