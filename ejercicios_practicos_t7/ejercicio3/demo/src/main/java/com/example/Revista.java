package com.example;

public class Revista extends Publicacion {
    
    int numeroRevista;


    public Revista(int codigo,String titulo, int yearPublicacion,int numRevista){
        super(codigo,titulo,yearPublicacion);
        numeroRevista = numRevista;

    }


    public int getNumeroRevista() {
        return numeroRevista;
    }


    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }


    public String toString(){
        return super.toString() + "Número de la revista: " + numeroRevista + "\n"; 


    }

}
