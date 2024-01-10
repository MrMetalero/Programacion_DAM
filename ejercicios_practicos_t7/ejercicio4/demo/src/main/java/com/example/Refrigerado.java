package com.example;

public class Refrigerado extends Producto {
    
    String codigoSuper;
    String fechaEnvasado;
    Integer tempMantenimiento;


    public Refrigerado(String fechaCaducidad,Integer numeroLote, String codSuper, String fEnvasado, Integer tempMant){
        super(fechaCaducidad, numeroLote);

        fechaEnvasado = fEnvasado;
        codigoSuper = codSuper;
        tempMantenimiento = tempMant;


    }

}
