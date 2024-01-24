package com.example;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;

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

                    try {
                        System.out.println("Introduce un valor double");
                        numeroCache = sc.nextDouble();
                        arrElementos.add(arrElementos.size(), numeroCache);

                    } catch (Exception e) {
                        System.out.println("Error, el valor introducido no es valido");
                    }

                    break;

                case 2:

                    try {
                        System.out.println("Introduce un valor a buscar en el arrayList");
                        numeroCache = sc.nextDouble();

                        if (arrElementos.contains(numeroCache)) {
                            Iterator<Double> iter = arrElementos.iterator();
                            while (iter.hasNext()) {

                            }

                            System.out.println("Se ha encontrado el valor introducido en... "
                                    + arrElementos.lastIndexOf(numeroCache));
                        } else {

                        }

                    } catch (Exception e) {
                        System.out.println("Algo ha salido mal, error");
                    }

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