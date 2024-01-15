package com.example;

public class Main {
    public static void main(String[] args) {
        
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);

        Moneda m2 = new Moneda(2);


        System.out.println(d6.lanzar());
        System.out.println(d20.lanzar());
        System.out.println(m2.lanzar());
        
        


    }
}