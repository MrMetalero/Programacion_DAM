package com.example;

public class Moneda extends Sorteo {
    
    public Moneda(Integer InputPosibilidades) {
        super(InputPosibilidades);
        
    }

    @Override
    public Integer lanzar() {
    return (int) (Math.random()*posibilidades+1);
        
    }



}
