package utilidades;

import java.io.IOException;

import BaseDatosFunciones.BDFunciones;
import Empleados.GestionEmpleados;
import excepciones.CaseNotFoundException;
import excepciones.EmpleadoNoEncontradoException;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;
import main.App;

/**
 * Menu
 */
public class MenuPrincipal {


    /**Método que nos muestra el menú principal y nos deja meter las opciones 
     * @throws Exception */
    public static void menuPrincipal() throws CaseNotFoundException {

        System.out.println("\n[1] Crear un Empleado Temporal\n" + //
        "[2] Crear un Empleado Gerente\n" + //
        "[3] Consultar el número de empleados en activo\n" + //
        "[4] Mostrar la información del empleado concreto (ID)\n" + //
        "[5] Eliminar un empleado (ID)\n" + //
        "[6] Listar todos los empleados\n" + //
        "[7] Encender Autocommit\n" + //
        "[8] Apagar Autocommit\n" + //
        "[9] Aplanar ArrayList \n" + //
        "[10] Leer ArrayList aplanados \n" + //
        "[12] Salir");

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
                    GestionEmpleados.agregarEmpleadoTemporal();
                } catch (FailedCreateEmpleado e) { //Si se detecta error al crear el usuario o su salario es inválido rollback
                    e.printStackTrace();
                    BDFunciones.realizarRollback(); 
                } catch (SalarioInvalidoException e) {
                    e.printStackTrace();
                    BDFunciones.realizarRollback();
                }
            break;

            case 2:
                try {
                    GestionEmpleados.agregarEmpleadoGerente();
                } catch (FailedCreateEmpleado e) { //Si se detecta error al crear el usuario o su salario es inválido rollback
                    e.printStackTrace();
                    BDFunciones.realizarRollback();
                } catch (SalarioInvalidoException e) {
                    e.printStackTrace();
                    BDFunciones.realizarRollback();

                }
            break;

            case 3:
                System.out.println("Hay actualmente "+ GestionEmpleados.contarEmpleados() + " empleados en activo");
                System.out.println("De los cuales... \n");
                System.out.println("Gerentes: "+ GestionEmpleados.contarEmpleadosGerentes());
                System.out.println("EmpleadoTemporal: "+ GestionEmpleados.contarEmpleadosTemporales());
            break;

            case 4:
                GestionEmpleados.buscarEmpleado(true);
            break;

            case 5:
                try {
                    GestionEmpleados.eliminarEmpleado();
                } catch (EmpleadoNoEncontradoException e) {
                    e.printStackTrace();
                }
            break;

            case 6:
                GestionEmpleados.listarEmpleados();
            break;

            case 7:
                BDFunciones.encenderAutoCommit();
            break;

            case 8:
                BDFunciones.apagarAutoCommit();
            break;

            case 9:
                try {
                    GestionEmpleados.aplanarArraylistOutput();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            break;

            case 10:
                try {
                    GestionEmpleados.aplanarArraylistLectura();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            break;

            case 11:
            
            break;

            case 12:
                App.programaEncendido = false;
            break;
        
            default:
                throw new CaseNotFoundException("ESA OPCIÓN NO EXISTE, ELIGE OTRA");
                
        }

    }
    
}