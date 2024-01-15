package com.example;

import java.util.ArrayList;
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
        arrayInput.iterator();

        return arrayInput;
    }

}