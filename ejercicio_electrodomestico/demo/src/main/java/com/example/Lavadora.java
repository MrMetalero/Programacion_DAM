package com.example;

import java.util.HashMap;

class Lavadora extends Electrodomestico {
    
    private Integer cargaLavadora = 5;
    
    public Lavadora(){
       
    }

    public Lavadora(String modelo,Integer precioBase,Character consumoEn,Integer pesoElec, Integer cargaLavadora){
        super(modelo,precioBase,consumoEn,pesoElec);
        this.cargaLavadora = cargaLavadora;


    }

    public Lavadora(Lavadora lavaCopia){
       this.setModelo(lavaCopia.getModelo());
       this.setPrecioBase(lavaCopia.getPrecioBase());
       this.setConsumoEn(lavaCopia.getConsumoEn());
       this.setPesoElec(lavaCopia.getPesoElec());
       this.setCargaLavadora(lavaCopia.getCargaLavadora());

       numeroObjElectrodomestico += 1;

    }


    public double precioFinal(){
        double precioFinalLavadora = 0;

        



        return precioFinalLavadora;
    }


    public Integer getCargaLavadora() {
        return cargaLavadora;
    }

    public void setCargaLavadora(Integer cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
        
    }



    

}
