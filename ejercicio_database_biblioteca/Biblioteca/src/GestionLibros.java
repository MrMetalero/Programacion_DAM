import java.sql.*;
import java.util.Scanner;

public abstract class GestionLibros {
    static Scanner sc = new Scanner(System.in);
    
    public static void menuLibros() throws SQLException{
        int programaControl = -1;
        Statement stLibros = App.connection.createStatement();

        do {
        
            System.out.println(
                "Introduce una de las opciones del menú:\n"
                + "[1] Añadir un libro\n"
                + "[2] ELIMINAR un libro\n" 
                + "[3] Buscar un libro\n"
                + "[4] Alquiler\n"
                + "[5] Devolución\n"
                + "[6] Salir\n"

            );

            programaControl = sc.nextInt(); //Introducción del usuario


            switch (programaControl) {
                case 1:
                    try {
                        App.biblioteca.add(AddLibro.addLibro(stLibros)); //añade al arraylist el libro
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    App.connection.commit(); //aplica los cambios
                    stLibros.close(); // Cierra el statement
                    break;

                case 2:

                    try {
                        RemoveLibro.borrarLibro(stLibros);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    break;
                    
                case 3:

                    try {
                       BuscarLibros.opcionesBuscarLibros();

                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    break;

                case 4:
                    try {
                        AlquilarLibro.alquilarLibro(stLibros);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        AlquilarLibro.devolverLibro(stLibros);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 6:
                System.out.println("Saliendo...");
                    programaControl = -1;
                    break;

                default:
                System.out.println("Opción no válida: inténtalo de nuevo");
                    break;
            }


            
        } while ( programaControl > 6 | programaControl < 1);

      



    }




}