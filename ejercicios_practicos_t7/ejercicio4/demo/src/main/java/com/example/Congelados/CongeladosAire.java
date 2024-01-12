package com.example.Congelados;

import com.example.Congelado;

public class CongeladosAire extends Congelado {
    
    Integer porcentajeNitrogeno;
    Integer porcentajeOxigeno;
    Integer porcentajeCo2;
    Integer porcentajeVaporAgua;
    Double porcentajeTotal = 100.0;
    
    public CongeladosAire(String fechaCaducidad, Integer numeroLote, String fEnvasado, String paisOrig,Integer tempMantenimiento, Integer porcentajeNitro, Integer porcentajeOxi, Integer porcentajeDioxidoCarbono, Integer porcentajeVapor ) throws Exception{
        super(fechaCaducidad, numeroLote, fEnvasado, paisOrig, tempMantenimiento);

        porcentajeNitrogeno = porcentajeNitro;
        porcentajeOxigeno = porcentajeOxi;
        porcentajeCo2 = porcentajeDioxidoCarbono;
        porcentajeVaporAgua = porcentajeVapor;


        if(porcentajeTotal - (porcentajeNitro + porcentajeOxi + porcentajeVapor + porcentajeCo2 ) != 0.0){
            throw new Exception("Los porcentajes no cuadran");

        }




    }


    public String toString(){
        return super.toString() + "porcentaje de Nitrógeno: " + porcentajeNitrogeno + "%\n"
                                + "porcentaje de Oxigeno: " + porcentajeOxigeno + "%\n"
                                + "porcentaje de Co2: " + porcentajeCo2 + "%\n"
                                + "porcentaje de Vapor de agua: " + porcentajeVaporAgua + "%\n";


    }


 

}
