import java.sql.*;
import java.util.Scanner;

public abstract class GestionEmpleados {
    static Scanner sc = new Scanner(System.in);
    
    public static void menuEmpleado() throws SQLException{
        int programaControl = -1;
        Statement stEmpleados = App.connection.createStatement();

        do {
                
            try {
                System.out.println(
                    "Introduce una de las opciones del menú:\n"
                    + "[1] Añadir un empleado\n"
                    + "[2] ELIMINAR un empleado\n" 
                    + "[3] Buscar un empleado\n"
                    + "[4] Salir\n"

                );
                
                programaControl = sc.nextInt(); //Introducción del usuario

               
                

                switch (programaControl) {
                    case 1:
                        App.empleados.add(AddEmpleado.addEmpleado(stEmpleados)); //añade al arraylist el empleado
                        App.connection.commit(); //aplica los cambios
                        stEmpleados.close(); // Cierra el statement
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
                    System.out.println("Opción inválida: inténtalo de nuevo");
                        break;
                }






                

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: \n" + e.getMessage());

            }


            


            
        } while (programaControl < 1 | programaControl > 4);

      



    }




}