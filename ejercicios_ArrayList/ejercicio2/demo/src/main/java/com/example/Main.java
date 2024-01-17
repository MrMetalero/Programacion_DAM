package com.example;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    static ArrayList<Double> arrElementos = new ArrayList<Double>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Integer opcionElegida = 0;
        Double numeroCache = 0.0;

        do {
            System.out.println("Introduce una de las opciones: "
                    + "ACCIONES\n"
                    + "[1] Agregar elemento\n"
                    + "[2] Buscar elemento\n"
                    + "[3] Modificar elemento\n"
                    + "[4] Eliminar elemento\n"
                    + "[5] Insertar elemento\n"
                    + "[6] Mostrar elementos\n"
                    + "[7] Orden ascendente\n"
                    + "[8] Orden descendente\n"
                    + "[9] Salir\n");

            switch (opcionElegida) {
                case 1:

                    System.out.println("Introduce un valor double");
                    numeroCache = sc.nextDouble();

                    arrElementos.add(arrElementos.lastIndexOf(arrElementos), numeroCache);

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                default:
                    System.out.println("Saliendo...");

                    break;
            }

        } while (opcionElegida != 9);

    }
}