package com.example.Congelados;

import com.example.Congelado;

public class CongeladosNitrogeno extends Congelado {
    
    String metodoCongelacion;
    Integer tiempoExposicionSegundos;



    public CongeladosNitrogeno(String fechaCaducidad, Integer numeroLote, String fEnvasado, String paisOrig,Integer tempMantenimiento, String metCongelacion, Integer tiempoExpo){
        super(fechaCaducidad, numeroLote, fEnvasado, paisOrig, tempMantenimiento);

        metodoCongelacion = metCongelacion;
        tiempoExposicionSegundos = tiempoExpo;

    }   

    public String toString(){
        return super.toString() + "Método de congelación: " + metodoCongelacion + "\n"
                                + "Tiempo de exposición al Nitrógeno (segundos): " + tiempoExposicionSegundos + "\n";


    }

    

}
