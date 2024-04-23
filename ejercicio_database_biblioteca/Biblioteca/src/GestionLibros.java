import java.sql.*;
import java.util.Scanner;

public abstract class GestionLibros {
    static Scanner sc = new Scanner(System.in);
    
    public static void menuLibros() throws SQLException{
        int programaControl = -1;
        Statement stLibros = App.connection.createStatement();

        do {
        
            System.out.println(
                "Introduce una de las opciones del menú:"
                + "[1] Añadir un libro"
                + "[2] ELIMINAR un libro" 
                + "[3] Buscar un libro"
                + "[4] Alquiler"
                + "[5] Devolución"
                + "[6] Salir"

            );

            programaControl = sc.nextInt(); //Introducción del usuario


            switch (programaControl) {
                case 1:
                    App.biblioteca.add(AddLibro.addLibro(stLibros)); //añade al arraylist el libro
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
                    BuscarLibros.opcionesBuscarLibros();
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                System.out.println("Saliendo...");
                    programaControl = -1;
                    break;

                default:
                System.out.println("Opción no válida: Inténtalo de nuevo");
                    break;
            }


            
        } while ( programaControl > 6 | programaControl < 1);

      



    }




}