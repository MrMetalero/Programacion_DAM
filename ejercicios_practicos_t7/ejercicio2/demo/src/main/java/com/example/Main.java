package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pelicula pelicula1 = new Pelicula("Interestellar", "Christopher Nolan", Formato.avi, 190, "Mathew McConaughey",
                "Anne Hathaway");

        Pelicula pelicula2 = new Pelicula("Interestellar", "Christopher Nolan", Formato.avi, 190, "Mathew McConaughey",
                "Anne Hathaway");

        Pelicula pelicula3 = new Pelicula("Django", "Tarantino", Formato.dvd, 120, "Mipadre", "");






        System.out.println("Comprobando las películas...");

        if (pelicula1.equals(pelicula2)) {
            System.out.println("Las película"+ pelicula1.getTitulo() +" y "+ pelicula2.getTitulo() + " son iguales");

        } else {
            System.out.println("Las película"+ pelicula1.getTitulo() +" y "+ pelicula2.getTitulo() + " son diferentes");

        }


        if (pelicula1.equals(pelicula3)) {
            System.out.println("Las películas :"+ pelicula1.getTitulo() +" y "+ pelicula3.getTitulo() + " son iguales");

        } else {
            System.out.println("Las películas :"+ pelicula1.getTitulo() +" y "+ pelicula3.getTitulo() + " son diferentes");

        }


        System.out.println("\nDetalles de las películas:");

        System.out.println(pelicula1.toString());    

        System.out.println(pelicula2.toString()); 

        System.out.println(pelicula3.toString()); 

        System.out.println("Modificando la película 1...\nIntroduce un título nuevo para la película:");

        pelicula1.setTitulo(sc.nextLine());
        System.out.println("Introduce un nuevo autor:");
        pelicula1.setAutor(sc.nextLine());


        System.out.println("MOSTRANDO AHORA LA PELÍCULA 1 TRAS MODIFICARLA:\n");


        System.out.println(pelicula1.toString()); 

    }
}