package com.example;

public class Main {
    public static void main(String[] args) {


        Conversor conversor1 = new Conversor(128);

        System.out.println("Binario:");
        conversor1.getNumero('B');

        System.out.println("\nHexadecimal:");
        conversor1.getNumero('H');

        System.out.println("\nOctal:");
        conversor1.getNumero('O');

    }
}