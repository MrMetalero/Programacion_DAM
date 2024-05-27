package main.utilidades;

import empleados.EmpleadoHospital;
import main.EntradaSalida;


/**
 * Menu
 */
public class MenuPrincipal {


    /**Método que nos muestra el menú principal y nos deja meter las opciones 
     * @throws Exception */
    public static void menuPrincipal() throws Exception {

        System.out.println("\n[1] Dar de alta a un empleado\n" + //
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
                    e.printStackTrace();
                }

            break;

            case 2:
                EmpleadoHospital.mostrarEmpleados();
            break;

            case 3:
                System.out.println("\nExisten actualmente "+ EmpleadoHospital.getNumeroTotalEmpleadosActuales() + " empleados en el sistema");
            break;

            case 4:
                System.out.println("\nIntroduce la categoría profesional (A,B,C) para buscar cuantos empleados hay de ese tipo");

                try {
                    System.out.println("\nExisten actualmente "+ EmpleadoHospital.getNumeroTotalEmpleadosTipoX() + " empleados en el sistema");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            break;

            case 5:
                EmpleadoHospital.listarEmpleadoBuscado();
            break;

            case 6:
                EmpleadoHospital.eliminarEmpleado();
            break;

            case 7:
                EmpleadoHospital.listaEmpleados.sort(null);
            break;

            case 8:
            EmpleadoHospital.modificarGuardiasMedicoSeleccionado();
            break;

            case 9:
                //Vacío no hace nada para salir
            break;
        
            default:
                throw new Exception("ESA OPCIÓN NO EXISTE, ELIGE OTRA");
                
        }

    }
    
}