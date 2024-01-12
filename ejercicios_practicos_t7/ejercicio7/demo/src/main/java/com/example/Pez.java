package com.example;

public class Pez {
    
    String nombre;
    static private Integer numpeces = 0;



    public Pez(String nom){
        nombre = nom;
        Pez.setNumpeces( getNumpeces() + 1);


    }


    public Pez(Pez objPez){
        nombre = objPez.nombre;
        Pez.setNumpeces( getNumpeces() + 1);



    }

    static public boolean equals(Pez pez1, Pez pez2){
        boolean resultado;

        if(pez1.getNombre() == pez2.getNombre()){
            resultado = true;
            System.out.println("Los peces "+ pez1.getNombre() + " Y " + pez2.getNombre() + " son iguales");

        }else{
            resultado = false;
            System.out.println("Los peces "+ pez1.getNombre() + " Y " + pez2.getNombre() + " son diferentes");
        }


        return resultado;
    }


    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public static Integer getNumpeces() {
        return numpeces;
    }


    public static void setNumpeces(Integer numpeces) {
        Pez.numpeces = numpeces;
    }


   






    
}
