package com.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Gallo gallo1 = new Gallo();
        Canario canario1 = new Canario();

        System.out.println(persona1.cantar());

        System.out.println(gallo1.cantar());

        System.out.println(canario1.cantar());

    }
}