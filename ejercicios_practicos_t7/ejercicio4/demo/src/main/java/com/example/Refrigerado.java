package com.example;

public class Refrigerado extends Producto {
    
    String codigoSuper;

    Integer tempMantenimiento;


    public Refrigerado(String fechaCaducidad,Integer numeroLote, String fechaEnv, String paisOrigen, String codSuper, Integer tempMant){
        super(fechaCaducidad, numeroLote, fechaEnv, paisOrigen);

        codigoSuper = codSuper;
        tempMantenimiento = tempMant;


    }

}
