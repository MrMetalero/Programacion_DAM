package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;
import Empleados.Empleado;
import utilidades.EntradaSalida;

public class App {
    public static Connection conexion;

    public static void main(String[] args) throws Exception {
     
        conexion = EntradaSalida.establecerConexion("empleadosproyectofinal", "mati", "mati");
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM empleados_temporales");
        while (rs.next()) {
            
            String datos = ""; 
            datos += rs.getString("nombre");
            System.out.println(datos);
        }


    }


       
}
