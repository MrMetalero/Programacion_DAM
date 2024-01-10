package com.example;

public class Producto {

    String fechaCaducidad;
    Integer numeroLote;



    //Constructor

    public Producto(String fCadu,Integer numLote){
        fechaCaducidad = fCadu;
        numeroLote = numLote;
    }








    public String getFechaCaducidad() {
        return fechaCaducidad;
    }




    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }




    public Integer getNumeroLote() {
        return numeroLote;
    }




    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }



}
