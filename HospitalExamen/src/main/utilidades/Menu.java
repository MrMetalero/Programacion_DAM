package main.utilidades;

import main.EntradaSalida;


/**
 * Menu
 */
public class Menu {


    /**Método que nos muestra el menú principal y nos deja meter las opciones */
    public static void menuPrincipal() {

        System.out.println("[1] Dar de alta a un empleado\n" + //
        "[2] Mostrar a todos los empleados\n" + //
        "[3] Consultar el número de empleados en activo\n" + //
        "[4] Consultar el número de empleados por categoría\n" + //
        "[5] Mostrar la información del empleado concreto (ID)\n" + //
        "[6] Eliminar un empleado\n" + //
        "[7] Ordenar los empleados por código\n" + //
        "[8] Modificar las guardias de un médico y mostrar sus nuevos datos (ID)\n" + //
        "[9] Salir");

        int programaControl = 9;

        //Control de el programa y su excepción en caso de valor no válido
        try {
            programaControl = EntradaSalida.getInt();
        } catch (Exception e) {
            
            e.printStackTrace();
        }


        switch (programaControl) {
            case 1:
                try {
                    MenuCrearEmpleados.menuCrearEmpleados();
                } catch (Exception e) {
                 
                    e.getMessage();
                }

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
                //Vacío no hace nada para salir
            break;
        
            default:
                break;
        }

    }
    
}