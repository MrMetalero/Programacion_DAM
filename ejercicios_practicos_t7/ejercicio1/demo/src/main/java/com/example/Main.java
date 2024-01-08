package com.example;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Interestellar", "Christopher Nolan", Formato.avi, 190, "Mathew McConaughey",
                "Anne Hathaway");

        Pelicula pelicula2 = new Pelicula("Interestellar", "Christopher Nolan", Formato.avi, 190, "Mathew McConaughey",
                "Anne Hathaway");

        Pelicula pelicula3 = new Pelicula("Django", "Tarantino", Formato.dvd, 120, "Mipadre", "");

        System.out.println("Comprobando las películas...");

        if (pelicula1.equals(pelicula2)) {
            System.out.println("Las películas son iguales");

        } else {
            System.out.println("Las películas son diferentes");

        }

    }
}