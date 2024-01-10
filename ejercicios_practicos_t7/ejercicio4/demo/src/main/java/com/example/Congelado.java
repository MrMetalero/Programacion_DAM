package com.example;

public class Congelado extends Producto {

    String fechaEnvasado;
    String paisOrigen;
    String tempMantenimiento;

    public Congelado(String fechaCaducidad, Integer numeroLote, String fEnvasado, String paisOrig) {
        super(fechaCaducidad, numeroLote);

        fechaEnvasado = fEnvasado;
        paisOrigen = paisOrig;

    }

}
