package com.example;

import java.util.ArrayList;
import java.util.Scanner;

class Tienda {
    public static ArrayList<Lavadora> arrayLavadora = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void agregarLavadora(){
        System.out.println("Introduce los datos para la lavadora a añadir: ");
    
        String modeloInput = "";
        Character consumoEnInput = null;
        Integer pesoElecInput = 0;
        Integer cargaLavadoraInput = 0;
        Integer precioBaseInput = 0;

        //Introduccion de datos lavadora
        System.out.println("Introduce a continuación los datos de la lavadora o deja los valores en blanco para creat una por defecto");
        System.out.println("Modelo:");
        sc.next();
        modeloInput = sc.nextLine();
        System.out.println("Consumo:");
        consumoEnInput = sc.nextLine().charAt(0);
        System.out.println("Peso:");
        pesoElecInput = sc.nextInt();
        System.out.println("Carga:");
        cargaLavadoraInput = sc.nextInt();
        System.out.println("Precio Base: ");
        precioBaseInput = sc.nextInt();

        if(
            modeloInput == "" ||
            consumoEnInput == null ||
            pesoElecInput == 0 ||
            cargaLavadoraInput == 0 ||
            precioBaseInput == 0
        ){

            Lavadora lavadora = new Lavadora(modeloInput, 100, consumoEnInput, pesoElecInput, cargaLavadoraInput);
            lavadora.setModelo(modeloInput);
            lavadora.setPrecioBase(precioBaseInput);
            lavadora.toString();
            arrayLavadora.add(lavadora);
            



            
        }else{
            Lavadora lavadora;
            arrayLavadora.add(lavadora = new Lavadora());

            
        }


        



    }





}



