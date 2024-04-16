import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class BuscarLibros {

    // String id;
    // String titulo;
    // String autor;
    // String editorial;
    // String ubicacion;
    // String isbn;
    // boolean prestado = false;
    // Empleado prestadoPor = null;
    // Usuario prestadoUsuario = null;

    public static ArrayList<Libro> buscarLibros(String busqIdLibro,String busqTitulo, String busqAutor, String busqEditorial,String busqUbicacion, String busqIsbn,boolean busqPrestado, Empleado busqPrestadoPor, Usuario busqPrestadoUsuario ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ");
            if (App.biblioteca.get(i).id.equals(busqIdLibro)) {
                listaCoincidencias += "[ID "+busqIdLibro+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).titulo.equals(busqTitulo)) {
                listaCoincidencias += " [Titulo "+busqTitulo+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).autor.equals(busqAutor)) {
                listaCoincidencias += " [Autor "+busqAutor+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).editorial.equals(busqEditorial)) {
                listaCoincidencias += " [Editorial "+busqEditorial+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).ubicacion.equals(busqUbicacion)) {
                listaCoincidencias += " [Ubicación "+busqUbicacion+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).isbn.equals(busqIsbn)) {
                listaCoincidencias += " [ISBN: "+busqIsbn+ "] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).prestado == busqPrestado) {
                listaCoincidencias += " [Prestado "+busqPrestado+"] ";
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).prestadoPor.equals(busqPrestadoPor)) {
                listaCoincidencias += " [Prestado Por... "+ busqPrestadoPor + "] " ;
                coincideAlguno = true;
            } else if (App.biblioteca.get(i).prestadoUsuario.equals(busqPrestadoUsuario)) {
                listaCoincidencias += " [Prestado a usuario... "+ busqPrestadoUsuario + "] ";
                coincideAlguno = true;
            }
            

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        


        return  librosEncontrados;
    }

   
    public static ArrayList<Libro> buscarTitulo(String busqTitulo ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ");
            if (App.biblioteca.get(i).id.equals(busqTitulo)) {
                listaCoincidencias += "[ID "+busqTitulo+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }

    public static ArrayList<Libro> buscarAutor(String busqAutor ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ");
            if (App.biblioteca.get(i).id.equals(busqAutor)) {
                listaCoincidencias += "[Autor "+busqAutor+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }

}