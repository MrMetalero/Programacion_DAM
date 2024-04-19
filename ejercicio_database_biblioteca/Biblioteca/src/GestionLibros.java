import java.sql.*;
import java.util.Scanner;

public abstract class GestionLibros {
    static Scanner sc = new Scanner(System.in);
    
    public static void menuLibros() throws SQLException{
        int programaControl = -1;
        Statement stLibros = App.connection.createStatement();

        do {
                
            try {
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

                if (programaControl > 6 | programaControl < 1) {
                    throw new Exception("Esa opción del menú no existe, inténtalo de nuevo");
                }else{

                    switch (programaControl) {
                        case 1:
                            App.biblioteca.add(AddLibro.addLibro(stLibros)); //añade al arraylist el libro
                            App.connection.commit(); //aplica los cambios
                            stLibros.close(); // Cierra el statement
                            break;

                        case 2:
                            RemoveLibro.borrarLibro(stLibros);
                            break;
                        case 3:
                            BuscarLibros.opcionesBuscarLibros();
                            break;

                        case 4:

                            break;

                        case 5:

                            break;

                        case 6:
                            programaControl = -1;
                            break;

                        default:
                            break;
                    }






                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: \n" + e.getMessage());

            }


            


            
        } while ( programaControl != 6);

      



    }




}