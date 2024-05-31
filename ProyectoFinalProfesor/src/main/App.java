package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;
import Empleados.Empleado;
import Empleados.EmpleadoTemporal;
import Empleados.GestionEmpleados;
import excepciones.CaseNotFoundException;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;
import utilidades.EntradaSalida;
import utilidades.MenuPrincipal;

public class App {
    public static Connection conexion;
    public static boolean programaEncendido = true;
    public static void main(String[] args) {
        
        BDFunciones.apagarAutoCommit();
        System.out.println("Comenzando programa... Autocommit apagado...");

        try {
            BDFunciones.cargarDatosDesdeBD();
        } catch (Exception e) { //Si se detecta error al realizar la carga, rollback
            e.printStackTrace();
            BDFunciones.realizarRollback();
        }
        System.out.println("Base de datos cargada");


        while (programaEncendido) {
            try {
                MenuPrincipal.menuPrincipal();
            } catch (CaseNotFoundException e) {
                e.printStackTrace();
            }
        }

      
        
        


        //Empleado empleadoPrinteable = GestionEmpleados.buscarEmpleado();
        //System.out.println(empleadoPrinteable.toString());

        
        
        
        
      
    }

       
}
