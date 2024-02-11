package com.example;

import java.util.HashMap;

class Lavadora extends Electrodomestico {
    
    Integer cargaLavadora = 5;
    
    public Lavadora(){
       
    }

    public Lavadora(String modelo,Integer precioBase,Character consumoEn,Integer pesoElec, Integer cargaLavadora){
        super(modelo,precioBase,consumoEn,pesoElec);
        this.cargaLavadora = cargaLavadora;


    }

    public Integer getCargaLavadora() {
        return cargaLavadora;
    }

    public void setCargaLavadora(Integer cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
    }



    

}
