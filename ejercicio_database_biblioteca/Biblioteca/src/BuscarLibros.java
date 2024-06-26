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




    public static ArrayList<Libro> opcionesBuscarLibros(){

        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        int opcionesMenuBuscar = -1;
        librosEncontrados.clear();

  

        do {
            librosEncontrados.clear();

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

            //Introducción del menú
            opcionesMenuBuscar = sc.nextInt();
            
            switch (opcionesMenuBuscar) {

                case 1:
                    

                    System.out.println("introduce el id");
                    String id = sc.nextLine();

                    System.out.println("introduce eLl titulo");
                    String titulo = sc.nextLine();
                    
                    System.out.println("introduce el autor");
                    String autor = sc.nextLine();

                    System.out.println("introduce el editorial");
                    String editorial = sc.nextLine();

                    System.out.println("introduce el ubicacion");
                    String ubicacion = sc.nextLine();

                    System.out.println("introduce el isbn");
                    String isbn = sc.nextLine();
                    
                    System.out.println("introduce true para buscar prestados, false para no prestados");
                    boolean prestado = sc.nextBoolean();


                    System.out.println("introduce el id del Empleado que prestó el libro");
                    Empleado empleadoBuscar = null;
                    String idEmpleadoBuscar = sc.nextLine(); // Guardamos la id a buscar y la comparamos con los empleados

                    for (Empleado empleado : App.empleados) {
                        if (empleado.id == idEmpleadoBuscar) {
                            empleadoBuscar = empleado;
                        }
                    }


                    System.out.println("introduce el id del Usuario al que se le prestó el libro");
                    Usuario usuarioBuscar = null;
                    String idUsuarioBuscar = sc.nextLine(); // Guardamos la id a buscar y la comparamos con los empleados

                    for (Usuario usuario : App.usuarios) {
                        if (usuario.id == idUsuarioBuscar) {
                            usuarioBuscar = usuario;
                        }
                    }

                    System.out.println(buscarLibros(id, titulo, autor, editorial, ubicacion, isbn, prestado, empleadoBuscar, usuarioBuscar));
                    

                    
                break;


                case 2:
                System.out.println("introduce el id");
                    sc.nextLine();
                    System.out.println("\n"+ buscarPorId(id = sc.nextLine()) + "\n");
                    

                break;
        
                case 3:
                System.out.println("introduce el titulo");
                    sc.nextLine();
                    
                    System.out.println("\n"+ buscarTitulo(titulo = sc.nextLine()) + "\n");
                break;
        
                case 4:
                System.out.println("introduce el autor");
                    sc.nextLine();
                    System.out.println("\n"+ buscarAutor(autor = sc.nextLine()) + "\n");
                    
                break;
        
                case 5:
                System.out.println("introduce el editorial");
                    sc.nextLine();
                    System.out.println("\n"+ buscarEditorial(editorial = sc.nextLine()) + "\n");
                    
                break;
        
                case 6:
                System.out.println("introduce el ubicacion");
                    sc.nextLine();
                    System.out.println("\n"+ buscarUbicacion( ubicacion = sc.nextLine()) + "\n");
                    
                break;
        
                case 7:
                System.out.println("introduce el isbn");
                    sc.nextLine();
                    System.out.println("\n"+ buscarIsbn(isbn = sc.nextLine()) + "\n");

                break;
        
                case 8:
                System.out.println("introduce si está prestado o no");
                    sc.nextLine();
                    System.out.println("\n"+ buscarPrestado(prestado = sc.nextBoolean()) + "\n");
                    
                break;
        
                case 9:
                System.out.println("introduce el id del empleado que ha prestado");
                    sc.nextLine();
                    System.out.println("\n"+ buscarPrestadoPorId(id = sc.nextLine()) + "\n");

                    
                break;
        
                case 10:
                System.out.println("introduce el id del usuario al que se ha prestado");
                    sc.nextLine();
                    System.out.println("\n"+ buscarPrestadoUsuarioId(idUsuarioBuscar = sc.nextLine()) + "\n");

                    
                    
                break;
        
                case 11:
                System.out.println("Saliendo...");

                    opcionesMenuBuscar = -1;
                break;
        

                default:
                    System.out.println("Opción incorrecta vuelve a intentarlo");
                break;
            }




        } while (opcionesMenuBuscar < 1 | opcionesMenuBuscar > 10);

        

        return librosEncontrados;
    }







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



    public static ArrayList<Libro> buscarPorId(String busqId ){
        int i = 0;
        ArrayList<Libro> librosEncontrados = new ArrayList<>();


        for (i = 0; i < App.biblioteca.size(); i++) {
            String listaCoincidencias = "\nCoincidencia encontrada en: \n"; 
            boolean coincideAlguno = false;

                System.out.println("Buscando en libros... ["+ i +"]");
            if (App.biblioteca.get(i).id.equals(busqId)) {
                listaCoincidencias += "[ID "+busqId+"] ";
                
                
                coincideAlguno = true;
            }

            if (coincideAlguno) {
                librosEncontrados.add(App.biblioteca.get(i));
                System.out.println(listaCoincidencias);
            }else{

                System.out.println("No se han encontrado coincidencias\n\n");
            }


        }




        return librosEncontrados;

    }





}