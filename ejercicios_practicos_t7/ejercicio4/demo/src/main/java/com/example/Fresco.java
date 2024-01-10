package com.example;

public class Fresco extends Producto {
    
    String fechaEnvasado;
    String paisOrigen;


    public Fresco(String fechaCaducidad,Integer numeroLote, String fEnvasado, String paisOrig){
        super(fechaCaducidad, numeroLote);

        fechaEnvasado = fEnvasado;
        paisOrigen = paisOrig;


    }


}
