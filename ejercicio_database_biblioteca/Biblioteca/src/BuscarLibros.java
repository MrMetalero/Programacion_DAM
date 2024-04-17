import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


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
    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Libro> buscarLibros(String busqIdLibro,String busqTitulo, String busqAutor, String busqEditorial,String busqUbicacion, String busqIsbn,boolean busqPrestado, Empleado busqPrestadoPor, Usuario busqPrestadoUsuario ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            
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
                System.out.println("Libro ["+ i +"] ");
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
                

            }


        }

        


        return  librosEncontrados;
    }

   
    public static ArrayList<Libro> buscarEditorial(String busqEditorial ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).editorial.equals(busqEditorial)) {
                listaCoincidencias += "[Editorial "+busqEditorial+"] ";
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

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).autor.equals(busqAutor)) {
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

    public static ArrayList<Libro> buscarTitulo(String busqTitulo ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).titulo.equals(busqTitulo)) {
                listaCoincidencias += "[Titulo "+busqTitulo+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }

    
    public static ArrayList<Libro> buscarUbicacion(String busqUbicacion ){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).ubicacion.equals(busqUbicacion)) {
                listaCoincidencias += "[Ubicacion "+busqUbicacion+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }


    public static ArrayList<Libro> buscarIsbn(String busqIsbn){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).isbn.equals(busqIsbn)) {
                listaCoincidencias += "[ISBN "+busqIsbn+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }


    public static ArrayList<Libro> buscarPrestado(boolean busqPrestado){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).prestado == busqPrestado) {
                listaCoincidencias += "[Prestado "+busqPrestado+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }

    public static ArrayList<Libro> buscarPrestadoPorId(String busqPrestadoPorId){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"]");
            if (App.biblioteca.get(i).prestadoPor.id.equals(busqPrestadoPorId)) {
                listaCoincidencias += "[Prestado Por "+busqPrestadoPorId+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }
    




    public static ArrayList<Libro> buscarPrestadoUsuarioId(String busqPrestadoUsuario){
        int i = 0;

        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "Coincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

            System.out.println("Libro ["+ i +"] ");
            if (App.biblioteca.get(i).prestadoUsuario.id.equals(busqPrestadoUsuario)) {
                listaCoincidencias += "[Prestado a "+busqPrestadoUsuario+"] ";
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                System.out.println(listaCoincidencias);
                librosEncontrados.add(App.biblioteca.get(i));
            }


        }

        return librosEncontrados;

    }






    public static ArrayList<Libro> opcionesBuscarLibros(){

        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        int opcionesMenuBuscar = -1;


  

        do {

            System.out.println("Introduce una opción del menú: \n"
            + "[1] Búsqueda múltiple \n"
            + "[2] Búsqueda id\n"
            + "[3] Búsqueda titulo\n"
            + "[4] Búsqueda autor\n"
            + "[5] Búsqueda editorial\n"
            + "[6] Búsqueda ubicacion\n"
            + "[7] Búsqueda isbn\n"
            + "[8] Búsqueda prestados\n"
            + "[9] Búsqueda prestados por...\n"
            + "[10] Búsqueda prestado a...\n"
            + "[11] Salir\n"
            
            
            );


            
            switch (opcionesMenuBuscar) {
                    case 1:
                        List atributosBusqueda = new ArrayList<>();


                        System.out.println("introduce el id");
                        atributosBusqueda.add(sc.nextLine());

                        System.out.println("introduce el titulo");
                        atributosBusqueda.add(sc.nextLine());
                        
                        System.out.println("introduce el autor");
                        atributosBusqueda.add(sc.nextLine());

                        System.out.println("introduce el editorial");
                        atributosBusqueda.add(sc.nextLine());

                        System.out.println("introduce el ubicacion");
                        atributosBusqueda.add(sc.nextLine());

                        System.out.println("introduce el isbn");
                        atributosBusqueda.add(sc.nextLine());
                        
                        System.out.println("introduce true para buscar prestados, false");
                        atributosBusqueda.add(sc.nextBoolean());

                        System.out.println("introduce el id del Empleado que prestó el libro");
                        atributosBusqueda.add(sc.nextLine());

                        System.out.println("introduce el id del Usuario al que se le prestó el libro");
                        atributosBusqueda.add(sc.nextLine());



                        buscarLibros((atributosBusqueda.get(0).toString()), atributosBusqueda.get(1), atributosBusqueda.get(2), atributosBusqueda.get(3), atributosBusqueda.get(4), atributosBusqueda.get(5), atributosBusqueda.get(6), atributosBusqueda.get(7), atributosBusqueda.get(8));
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
            
                    case 9:
                    
                    break;
            
                    case 10:
                    
                    break;
            
                    case 11:
                    opcionesMenuBuscar = -1;
                    break;
            




                default:
                
                    break;
            }




        } while (opcionesMenuBuscar > 9 | opcionesMenuBuscar < 1);

        

        return librosEncontrados;
    }


}