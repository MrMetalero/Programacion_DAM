import java.sql.*;
import java.util.Scanner;

public abstract class GestionUsuarios {
    static Scanner sc = new Scanner(System.in);
    
    public static void menuUsuarios() throws SQLException{
        int programaControl = -1;
        Statement stUsuarios = App.connection.createStatement();

        do {
                
            try {
                System.out.println(
                    "Introduce una de las opciones del menú:\n"
                    + "[1] Añadir un usuario\n"
                    + "[2] ELIMINAR un usuario\n" 
                    + "[3] Buscar un usuario\n"
                    + "[4] Salir\n"

                );

                programaControl = sc.nextInt(); //Introducción del usuario


                switch (programaControl) {
                    case 1:
                        App.usuarios.add(AddUser.addUser(stUsuarios)); //añade al arraylist el usuario
                        App.connection.commit(); //aplica los cambios
                        stUsuarios.close(); // Cierra el statement
                        break;

                    case 2:

                        break;
                    case 3:

                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        programaControl = -1;
                    break;

                    default:
                    System.out.println("Selección incorrecta: Vuelve a introducir un valor");
                        break;
                }






                

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: \n" + e.getMessage());

            }


            


            
        } while (programaControl != -1);

      



    }




}