package com.example;

public class Publicacion {
    
    int codigo;
    String titulo;
    int yearPublicacion;


    public Publicacion(int cod,String tit,int year){
        codigo = cod;
        titulo = tit;
        yearPublicacion = year;

    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getYearPublicacion() {
        return yearPublicacion;
    }


    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public String toString(){

        return "Código: " + codigo +"\n"
                + "Título: " + titulo + "\n"
                + "Año de publicación: "+ yearPublicacion + "\n"; 

    }



}
