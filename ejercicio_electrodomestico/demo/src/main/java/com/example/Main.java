package com.example;

public class Main {
    public static void main(String[] args) {
        

        Lavadora.rellenarLetras();
    
        Lavadora lava1 = new Lavadora();
        Lavadora lava2 = new Lavadora("Hey", 100, 'C', 40, 7);
    
        System.out.println(lava1.getCargaLavadora());
        System.out.println(lava2.getCargaLavadora());

    
    }



    


}