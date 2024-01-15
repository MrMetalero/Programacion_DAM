package com.example;

public abstract class Sorteo {
    
    protected Integer posibilidades;
    
    public Sorteo(Integer inputPosibilidades){
        posibilidades = inputPosibilidades;

    }
    
    public abstract Integer lanzar();



}
