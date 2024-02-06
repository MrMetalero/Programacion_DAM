package com.example;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Main {
    static ArrayList<Double> arrElementos = new ArrayList<Double>();
    static ArrayList<Integer> arrIndicesModificables = new ArrayList<Integer>();
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

            opcionElegida = sc.nextInt();


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
                    System.out.println("Introduce un valor a buscar en el arrayList");
                  
                    try {
                        numeroCache = sc.nextDouble();
                    
                        IteradorLista.funcionBusqueda(arrElementos, numeroCache);
    
                    } catch (Exception e) {
                       System.out.println("Algo ha salido mal");
                    }




                    break;

                case 3:

                    try {
                        System.out.println("Introduce un valor a buscar en el arrayList");
                        Integer numeroControlIndices = -1;
                        numeroCache = sc.nextDouble();

                        IteradorLista.funcionModificar(arrElementos, numeroCache);
                        System.out.println("Los índices a modificar son los siguientes...: "+arrIndicesModificables.toString());

                        do {
                            System.out.println("\nIntroduce un índice a modificar, si has terminado introduce -1 ");

                            numeroControlIndices = sc.nextInt();

                            if(arrIndicesModificables.contains(numeroControlIndices) ){

                                System.out.println("\nIntroduce el número Double para el índice ["+ numeroControlIndices +"]");
                                arrElementos.add(numeroControlIndices, sc.nextDouble());



                            }else{
                                System.out.println("El indice seleccionado está fuera del rango de índices que corresponden a tu búsqueda"
                                + ", por favor introduce otro valor");

                            }



                            
                        } while (numeroControlIndices != -1);


                    } catch (Exception e) {
                        System.out.println("Algo ha salido mal, error");
                    }

                    break;

                case 4:
                    
                    try {
                        System.out.println("Introduce un valor a buscar en el arrayList para su TOTAL ELIMINACIÓN");
                        Integer numeroControlIndices = -1;
                        numeroCache = sc.nextDouble();

                        IteradorLista.funcionModificar(arrElementos, numeroCache);
                        System.out.println("Los índices a ELIMINAR son los siguientes...: "+arrIndicesModificables.toString());

                        do {
                            System.out.println("\nIntroduce un índice a ELIMINAR, si has terminado introduce -1 ");

                            numeroControlIndices = sc.nextInt();

                            if(arrIndicesModificables.contains(numeroControlIndices) ){

                                
                                System.out.println("\nQuieres ELIMINAR el valor contenido en: ["+ numeroControlIndices +"]  ?");
                                String comprobarSi = sc.nextLine();
                                if (comprobarSi.equalsIgnoreCase("si")) {

                                    arrElementos.remove(arrElementos.get(numeroControlIndices));

                                    //Borrar el índice modificable de la lista donde acabamos de borrar el Elemento
                                    //           el indice del array de indices(que contiene el indice que acabamos de borrar)
                                    arrIndicesModificables.remove(arrIndicesModificables.indexOf(numeroControlIndices));

                                }else{
                                    System.out.println("No se ha borrado nada");
                                }



                            }else{
                                System.out.println("El indice seleccionado está fuera del rango de índices que corresponden a tu búsqueda"
                                + ", por favor introduce otro valor");

                            }



                            
                        } while (numeroControlIndices != -1);


                    } catch (Exception e) {
                        System.out.println("Algo ha salido mal, error");
                    }






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