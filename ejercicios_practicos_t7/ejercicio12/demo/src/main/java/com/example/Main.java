package com.example;

public class Main {
    public static void main(String[] args) {

        Circulo f = new Circulo();
        f.identidad();
        Circulo c = new Circulo();
        c.identidad();
        f.identidad();
        // forma es abstracta esto no tiene sentido forma f2 = new forma( );
        Circulo f2 = new Circulo();
        f2.identidad();
        f.identidad();

    }
}