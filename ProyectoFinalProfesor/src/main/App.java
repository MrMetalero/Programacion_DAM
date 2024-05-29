package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;
import Empleados.Empleado;
import utilidades.EntradaSalida;

public class App {
    public static Connection conexion;

    public static void main(String[] args) throws Exception {
     
        conexion = EntradaSalida.establecerConexion("biblioteca", "postgres", "postgres");
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM empleados");
        while (rs.next()) {
            
            String datos = "";
            datos += rs.getString("nombre");
            System.out.println(datos);
        }


    }


       
}
