package com.example;

import java.util.HashMap;

abstract public class Electrodomestico {

  

    


    private String modelo = "Desconocido";
    private Integer precioBase = 100;
    private Character consumoEn = 'F';
    private Integer pesoElec = 5;
    public static Integer numeroObjElectrodomestico = 0;
    
    public static HashMap<Character,Integer> EnerPrecio = new HashMap<>();

    public static void rellenarLetras(){
        EnerPrecio.put('A', 100);
        EnerPrecio.put('B', 100);
        EnerPrecio.put('C', 100);
        EnerPrecio.put('D', 100);
        EnerPrecio.put('E', 100);
        EnerPrecio.put('F', 100);


    }



    protected Electrodomestico(){
        numeroObjElectrodomestico += 1;
        
    }

    public Electrodomestico(String modelo, Integer precioBase, Character consumoEn, Integer pesoElec) {
        numeroObjElectrodomestico += 1;
    }













    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public Character getConsumoEn() {
        return consumoEn;
    }

    public void setConsumoEn(Character consumoEn) {
        this.consumoEn = consumoEn;
    }

    public Integer getPesoElec() {
        return pesoElec;
    }

    public void setPesoElec(Integer pesoElec) {
        this.pesoElec = pesoElec;
    }

    public static Integer getNumeroObjElectrodomestico() {
        return numeroObjElectrodomestico;
    }

    public static void setNumeroObjElectrodomestico(Integer numeroObjElectrodomestico) {
        Electrodomestico.numeroObjElectrodomestico = numeroObjElectrodomestico;
    }

    public static HashMap<Character, Integer> getEnerPrecio() {
        return EnerPrecio;
    }

    public static void setEnerPrecio(HashMap<Character, Integer> enerPrecio) {
        EnerPrecio = enerPrecio;
    }
    
    

    






}
