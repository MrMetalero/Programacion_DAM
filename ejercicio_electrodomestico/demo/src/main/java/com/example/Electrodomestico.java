package com.example;

import java.util.HashMap;

abstract public class Electrodomestico {

  

    


    private String modelo = "Desconocido";
    private Integer precioBase = 100;
    private Character consumoEn = 'F';
    private Integer pesoElec = 5;
    public static Integer numeroObjElectrodomestico = 0;
    
    public static HashMap<Character,Integer> EnerPrecio = new HashMap<>();

    protected static void rellenarLetras(){
        EnerPrecio.put('A', 100);
        EnerPrecio.put('B', 80);
        EnerPrecio.put('C', 60);
        EnerPrecio.put('D', 50);
        EnerPrecio.put('E', 30);
        EnerPrecio.put('F', 10);


    }

    private static char comprobarConsumo(char letraComprobar){
        if (EnerPrecio.containsKey(letraComprobar) ){
           
            return letraComprobar;
        //Si la letra no coincide con las del hashmap te dice que nanay y pone F
        }else{


            return 'F';
        }


    }

    final double incrementoPrecio(){
        Double incrementoLavadora = 0.0;

        if(pesoElec >= 0 && pesoElec <= 19){
            incrementoLavadora = 10.0;

        }else if(pesoElec >= 20 && pesoElec <= 49){
            incrementoLavadora = 50.0;

        }else if(pesoElec >= 50 && pesoElec <= 79){
            incrementoLavadora = 80.0;

        }else if(pesoElec >= 80){
            incrementoLavadora = 100.0;

        }

        incrementoLavadora += EnerPrecio.get(consumoEn);




        return incrementoLavadora;

    }
    



    

    // Constructores
    protected Electrodomestico(){
        numeroObjElectrodomestico += 1;
        
    }

    public Electrodomestico(String modelo, Integer precioBase, Character consumoEn, Integer pesoElec) {
        numeroObjElectrodomestico += 1;
        this.consumoEn = comprobarConsumo(consumoEn);
    }

    @Override
    public String toString(){
        return "Datos del electrodoméstico:\n"
        + "Modelo: " + modelo + "\n"
        + "Precio: " + precioBase + "\n"
        + "Consumo Energético: " + consumoEn + "\n"
        + "Peso: " + pesoElec + "\n";
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
