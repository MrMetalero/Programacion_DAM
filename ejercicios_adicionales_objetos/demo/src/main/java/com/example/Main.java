package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce el edad");
        String edad = sc.nextLine();

        System.out.println("Introduce el edad");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        int peso = sc.nextInt();

        System.out.println("Introduce el altura");
        float altura = sc.nextFloat();



        Persona Dan = new Persona(nombre,edad,peso,altura);






    }
}