package com.example;

public class Dado extends Sorteo{

    public Dado(Integer inputPosibilidades){
        super(inputPosibilidades); 
        posibilidades = inputPosibilidades;
        


    }



    @Override
    public Integer lanzar() {
    return (int) (Math.random()*posibilidades+1);
        
    }
    
    

}
