package BaseDatosFunciones;

import java.sql.*;

import Empleados.EmpleadoTemporal;
import utilidades.EntradaSalida;
/**
 * BaseDatosFunciones Realiza el manejo de diferentes operaciones con bases de datos para facilitar la implementación de los métodos y mejorar la lectura del código
 */
public abstract class BDFunciones {

    public static Connection conexion = EntradaSalida.establecerConexion("proyectofinal", "mati", "mati");


    /**
     * Se encarga de contar las columnas que tiene una tabla
     * @param st el Statement que se utiliza para sus funciones
     * @param tabla la tabla de la que contar las columnas
     * @return (int) numeroColumnas
     */
    public static int getNumeroColumnas(String tabla){
        String codigoSQL = "select * from "+tabla;
        ResultSet resultadosRs = null;
        ResultSetMetaData metadataResultSet = null;
        int numeroColumnas = -1;

        try {
            PreparedStatement st = conexion.prepareStatement(codigoSQL);
            resultadosRs = st.executeQuery(codigoSQL) ;
            metadataResultSet = resultadosRs.getMetaData();
            numeroColumnas = metadataResultSet.getColumnCount();

            //trata de realizar un commit si todo ha ido bien
            realizarCommitBD();
        } catch (SQLException e) {
            e.printStackTrace();
            //Trata de realizar rollback si hay error
            realizarRollback(); 
        }

        return numeroColumnas;

    }


    /**Crea un empleadoTemporal en la base de datos
     * @returns void
     */
    public static void crearEmpleadoTemporalBD(EmpleadoTemporal empleadoTemp1){


    }

    /**Guarda los datos de los empleados en la base de datos
     * @returns void
     */
    public static void guardarDatosEnBD(){


    }


    /**Carga los datos de los empleados en la base de datos
     * @returns void
     */
    public static void cargarDatosDesdeBD(){


    }

    /**Enciende el autocommit */
    public static void encenderAutoCommit(){
        try {
            conexion.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**Apaga el autocommit */
    public static void apagarAutoCommit(){
        try {
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**Realiza un commit si el autocommit está en desactivado */
    public static void realizarCommitBD(){
        try {
            if (conexion.getAutoCommit() == false) {
                conexion.commit();
            }

        } catch (SQLException e) {
        
            e.printStackTrace();
        }


    }
    /**Realiza un rollback  si el autocommit está en desactivado*/
    public static void realizarRollback(){
        try {
            if (conexion.getAutoCommit() == false) {
                conexion.rollback();
            }
        } catch (SQLException e) {
            
        }


    }

}