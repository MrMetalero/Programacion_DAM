package com.example;

public class Main {
    public static void main(String[] args) {

        Pez pez1 = new Pez("Jose");
        System.out.println(pez1.getNombre());
        System.out.println("Numero de peces: " + Pez.getNumpeces());

        Pez pez2 = new Pez("Manuel");
        System.out.println(pez2.getNombre());
        System.out.println("Numero de peces: " + Pez.getNumpeces());

        Pez pezCopia = new Pez(pez1);
        System.out.println(pezCopia.getNombre());
        System.out.println("Numero de peces: " + Pez.getNumpeces());

        Pez.equals(pez1, pez2);
        Pez.equals(pez1, pezCopia);
        Pez.equals(pez2, pezCopia);

        System.out.println("cambiando el nombre de pez1...");
        pez1.setNombre("Harry");
        Pez.equals(pez1, pezCopia);

    }
}