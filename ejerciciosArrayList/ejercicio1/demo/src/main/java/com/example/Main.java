package com.example;

import java.math.*;;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros = leerValores(numeros);

    }

    public static ArrayList<Integer> leerValores(ArrayList<Integer> arrayInput) {
        Integer numeroCache = 0;

        do {
            numeroCache = sc.nextInt();

            if (numeroCache != 99) {
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

        while (iter.hasNext()) {
            resultadoMedia = calcularSuma(arrayInput) / arrayInput.size();

            // Faltan cositas por hacer aquí...
        }

        return "Listado de números " + "\nSuma: " + calcularSuma(arrayInput) + "\nMedia: "
                + "\nNúmeros superiores a la media: ";
    }

}