package BaseDatosFunciones;

import java.sql.*;
/**
 * BaseDatosFunciones Realiza el manejo de diferentes operaciones con bases de datos para facilitar la implementación de los métodos y mejorar la lectura del código
 */
public abstract class BDFunciones {

    public static int getNumeroColumnas(Statement st, String tabla){
        String codigoSQL = "select * from "+tabla;
        ResultSet resultadosRs = null;
        ResultSetMetaData datosResultSet = null;
        int numeroColumnas = -1;
        try {
            resultadosRs = st.executeQuery(codigoSQL) ;
            datosResultSet = resultadosRs.getMetaData();
            numeroColumnas =datosResultSet.getColumnCount();

            
        } catch (SQLException e) {
            e.printStackTrace();

        }
        

        return numeroColumnas;

    }
    



}