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
                    "Introduce una de las opciones del menú:"
                    + "[1] Añadir un empleado"
                    + "[2] ELIMINAR un empleado" 
                    + "[3] Buscar un empleado"
                    + "[4] Salir"

                );
                
                programaControl = sc.nextInt(); //Introducción del usuario

                if (programaControl > 4 | programaControl < 1) {
                    throw new Exception("Esa opción del menú no existe, inténtalo de nuevo");
                }else{

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

                        default:
                            break;
                    }






                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: \n" + e.getMessage());

            }


            


            
        } while (programaControl > 4 | programaControl < 1);

      



    }




}