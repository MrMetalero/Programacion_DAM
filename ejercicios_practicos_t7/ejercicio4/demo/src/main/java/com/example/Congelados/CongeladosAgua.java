package com.example.Congelados;

import com.example.Congelado;

public class CongeladosAgua extends Congelado {
    
    Integer salinidadGramosPorLitro;

    public CongeladosAgua(String fechaCaducidad, Integer numeroLote, String fEnvasado, String paisOrig,Integer tempMantenimiento, Integer salinidadGPL){
        super(fechaCaducidad, numeroLote, fEnvasado, paisOrig, tempMantenimiento);

        salinidadGramosPorLitro = salinidadGPL;


    }

}