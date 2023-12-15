package com.example;
import java.math.*;
import java.util.Scanner;

    
public class Main {



    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        




        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        int peso = sc.nextInt();

        System.out.println("Introduce la altura");
        float altura = sc.nextFloat();



        Persona Dan = new Persona(nombre,edad,sexo,peso,altura);
        System.out.println(Dan.devuelveString()); 


        Persona Daniela = new Persona();
        Daniela.setNombre("Daniela");
        Daniela.setEdad(19);
        Daniela.setSexo('M');
        System.out.println(Daniela.devuelveString());


        Persona German = new Persona();
        System.out.println(German.devuelveString());
        





    }
}