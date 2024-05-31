package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;
import Empleados.Empleado;
import Empleados.EmpleadoTemporal;
import Empleados.GestionEmpleados;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;
import utilidades.EntradaSalida;

public class App {
    public static Connection conexion;

    public static void main(String[] args) {
        BDFunciones.apagarAutoCommit();

        try {
            BDFunciones.cargarDatosDesdeBD();
        } catch (Exception e) { //Si se detecta error al realizar la carga, rollback
            e.printStackTrace();
            BDFunciones.realizarRollback();
        }

        try {
            GestionEmpleados.agregarEmpleadoTemporal();
        } catch (FailedCreateEmpleado e) { //Si se detecta error al crear el usuario o su salario es inválido rollback
            e.printStackTrace();
            BDFunciones.realizarRollback(); 
        } catch (SalarioInvalidoException e) {
            e.printStackTrace();
            BDFunciones.realizarRollback();
        }


      
        try {
            GestionEmpleados.agregarEmpleadoGerente();
        } catch (FailedCreateEmpleado e) { //Si se detecta error al crear el usuario o su salario es inválido rollback
            e.printStackTrace();
            BDFunciones.realizarRollback();
        } catch (SalarioInvalidoException e) {
            e.printStackTrace();
            BDFunciones.realizarRollback();

        }
        


        //Empleado empleadoPrinteable = GestionEmpleados.buscarEmpleado();
        //System.out.println(empleadoPrinteable.toString());

        //GestionEmpleados.listarEmpleados();
        
        GestionEmpleados.listarEmpleados();
        
      
    }

       
}
