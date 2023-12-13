package com.example;

import java.util.Scanner;

    
public class Main {

    public String funcionIMC(int imcComprobar){
        String resultado = "";

        if (imcComprobar == 0){
            
        }



        return resultado;
        }



    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce el edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el edad");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        int peso = sc.nextInt();

        System.out.println("Introduce el altura");
        float altura = sc.nextFloat();



        Persona Dan = new Persona(nombre,edad,sexo,peso,altura);


        Persona Daniela = new Persona();
        Daniela.setNombre(sc.nextLine());
        Daniela.setEdad(sc.nextInt());
        Daniela.setSexo(sc.nextLine().charAt(0));


        Persona German = new Persona();

        
        
        

        if(Dan.calcularIMC() == 0){
            


        }

        System.out.println(Dan.calcularIMC());
        System.out.println(Daniela.calcularIMC());
        System.out.println(German.calcularIMC());





    }
}