package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;
import Empleados.Empleado;
import Empleados.EmpleadoTemporal;
import Empleados.GestionEmpleados;
import utilidades.EntradaSalida;

public class App {
    public static Connection conexion;

    public static void main(String[] args) throws Exception {
        BDFunciones.apagarAutoCommit();

        BDFunciones.cargarDatosDesdeBD();

        //GestionEmpleados.agregarEmpleadoTemporal();
        Empleado empleadoPrinteable = GestionEmpleados.buscarEmpleado();
        System.out.println(empleadoPrinteable.toString());

        //GestionEmpleados.listarEmpleados();
        
        
      
    }

       
}
