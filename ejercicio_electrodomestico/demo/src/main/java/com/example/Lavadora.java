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

        if(cargaLavadora > 30){
            precioFinalLavadora += 50.0;
            precioFinalLavadora += getPrecioBase();
            precioFinalLavadora += incrementoPrecio();

        }else{
            precioFinalLavadora += incrementoPrecio();
            precioFinalLavadora += getPrecioBase();
        }



        return precioFinalLavadora;
    }

    @Override
    public String toString(){
        return super.toString() + "Carga Lavadora: " + cargaLavadora + "\n"
        + "Precio final: " + precioFinal() + "\n"
        + "MODELO 2: " + getModelo() + "PRECIO 2: " + getPrecioBase();
    }





    public Integer getCargaLavadora() {
        return cargaLavadora;
    }

    public void setCargaLavadora(Integer cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
        
    }



    

}
