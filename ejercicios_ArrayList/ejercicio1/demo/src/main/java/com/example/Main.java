package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Integer contadorMayoresMedia = 0;

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros = leerValores(numeros);

        calcularSuma(numeros);
        System.out.println(mostrarResultados(numeros));
        
    }

    public static ArrayList<Integer> leerValores(ArrayList<Integer> arrayInput) {
        Integer numeroCache = 0;

        do {
            System.out.println("\nIntroduce valores. \nPara finalizar introduce el valor -99\n");
            numeroCache = sc.nextInt();

            if (numeroCache != -99) {
                arrayInput.add(numeroCache);
            }

        } while (numeroCache != -99);

        return arrayInput;
    }

    public static Integer calcularSuma(ArrayList<Integer> arrayInput) {
        Integer resultadoSuma = 0;
        Iterator<Integer> iter = arrayInput.iterator();

        while (iter.hasNext()) {
            resultadoSuma += iter.next();

        }

        return resultadoSuma;
    }

    public static String mostrarResultados(ArrayList<Integer> arrayInput) {

        Iterator<Integer> iter = arrayInput.iterator();
        Integer resultadoMedia;
        resultadoMedia = calcularSuma(arrayInput) / arrayInput.size();

        while (iter.hasNext()) {

            if (iter.next() > resultadoMedia) {
                contadorMayoresMedia++;

            }
            // Faltan cositas por hacer aquí...
        }

        return "Listado de números: "
                + arrayInput.toString()
                + "\nSuma: "
                + calcularSuma(arrayInput)
                + "\nMedia: "
                + resultadoMedia
                + "\nNúmeros superiores a la media: "
                + contadorMayoresMedia;
    }

}