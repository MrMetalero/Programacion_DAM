package main;
import java.sql.*;

import BaseDatosFunciones.BDFunciones;

public class App {
    public static Connection conexion = EntradaSalida.establecerConexion("proyectofinal", "mati", "mati");

    public static void main(String[] args) throws Exception {
    Statement sentenciaGeneral = conexion.prepareStatement("");
      
    BDFunciones.getNumeroColumnas(sentenciaGeneral);
    





    }


       
}
