package com.example;

import com.example.persona.viajero.Viajero;

public class Main {
    public static void main(String[] args) {
    
        Viajero viajero1 = new Viajero("23464678K", "Jose", "Roca", "Español", "Calle de la madre que me parió");
        
        Viajero viajero2 = new Viajero();
       
        Viajero viajero3 = new Viajero();
        
        
        viajero1.getInfo("pausado");

        //numero de viajeros creados
        System.out.println(Viajero.contador); 

    }
}