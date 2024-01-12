package com.example;

public class Main {
    public static void main(String[] args) {

        Gato gato1 = new Gato();

        Tigre tigre1 = new Tigre();

        Loro loro1 = new Loro();

        Murcielago murcielago1 = new Murcielago();

        Avestruz avestruz1 = new Avestruz();

        System.out.println("\nEl gato...: ");
        System.out.println(gato1.caminar());
        System.out.println(gato1.nadar());
        System.out.println("\n");

        System.out.println("El tigre...: ");
        System.out.println(tigre1.caminar());
        System.out.println(tigre1.nadar());
        System.out.println("\n");

        System.out.println("El loro...: ");
        System.out.println(loro1.caminar());
        System.out.println(loro1.volar());
        System.out.println("\n");

        System.out.println("El murcielago...: ");
        System.out.println(murcielago1.caminar());
        System.out.println(murcielago1.volar());
        System.out.println("\n");

        System.out.println("El avestruz...: ");
        System.out.println(avestruz1.caminar());
        System.out.println("\n");

    }
}