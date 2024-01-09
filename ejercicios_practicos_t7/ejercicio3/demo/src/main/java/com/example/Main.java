package com.example;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "Finis mundi", 2001);

        Libro libro2 = new Libro(2, "Tus muertos", 1997);

        Revista revista1 = new Revista(1, "Hehe", 2005, 1);

        Revista revista2 = new Revista(2, "Hehe", 2002, 142);

        System.out.println("Desglose de cada libro y revista\n\n");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(revista1.toString());
        System.out.println(revista2.toString());

        libro1.prestado();

        System.out.println("Prestando el libro 1...\n");
        libro1.prestar();
        System.out.println(libro1.toString());

        System.out.println("Devolviendo libro 1...\n");
        libro1.devolver();
        System.out.println(libro1.toString());

    }

}