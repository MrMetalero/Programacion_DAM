package com.example;

public abstract class Congelado extends Producto {


    Integer temperaturaMantenimiento;

    public Congelado(String fechaCaducidad, Integer numeroLote, String fEnvasado, String paisOrig,Integer tempMantenimiento) {
        super(fechaCaducidad, numeroLote, fEnvasado, paisOrig);
        temperaturaMantenimiento = tempMantenimiento;

     


    }

    public String toString(){
        return super.toString() + "Temperatura de mantenimiento: " + temperaturaMantenimiento + "\n";


    }



}
