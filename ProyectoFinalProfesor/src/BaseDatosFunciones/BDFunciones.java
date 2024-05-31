package BaseDatosFunciones;
import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.html.HTMLDocument.Iterator;

import Empleados.EmpleadoTemporal;
import Empleados.Gerente;
import Empleados.GestionEmpleados;
import utilidades.EntradaSalida;
/**
 * BaseDatosFunciones Realiza el manejo de diferentes operaciones con bases de datos para facilitar la implementación de los métodos y mejorar la lectura del código
 */
public abstract class BDFunciones {

    public static Connection conexion = EntradaSalida.establecerConexion("proyectofinalprofesor", "postgres", "postgres");


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


    /**Crea un empleadoTemporal en la base de datos y devuelve el identificador del empleado creado
     * @returns (Integer) identificador de la base de datos para un EmpleadoTemporal
     */
    public static Integer crearEmpleadoTemporalBD(EmpleadoTemporal empleadoTemp1){
        String codigoSql = "INSERT INTO empleados_temporales (nombre,apellido,salario) VALUES(?,?,?)";
        PreparedStatement stCrearTemporal;

        try {
            stCrearTemporal = conexion.prepareStatement(codigoSql, Statement.RETURN_GENERATED_KEYS);
            

            stCrearTemporal.setString(1,empleadoTemp1.getNombre());
            stCrearTemporal.setString(2,empleadoTemp1.getApellido());
            stCrearTemporal.setDouble(3,empleadoTemp1.getSalario());


            int filasAfectadas = stCrearTemporal.executeUpdate();
            //Como solo hago un insert por ejecución siempre va a haber una sola clave generada o ninguna por algún error
            ResultSet clavesGeneradas = stCrearTemporal.getGeneratedKeys();
            clavesGeneradas.next();
            //asignamos al empleado que estamos creando su clave creada por SERIAL en la base de datos
            empleadoTemp1.setIdentificador(clavesGeneradas.getInt("identificador"));


        } catch (SQLException e) {
            e.printStackTrace();
            
        }



    
        return empleadoTemp1.getIdentificador();
        

    }


    /**Crea un Gerente en la base de datos y devuelve el identificador del empleado Gerente creado
     * @returns (Integer) identificador de la base de datos para un Gerente
     */
    public static Integer crearGerenteBD(Gerente gerenteTemp1){
        String codigoSql = "INSERT INTO gerentes (nombre,apellido,salario,departamento) VALUES(?,?,?,?)";
        PreparedStatement stCrearTemporal;

        try {
            stCrearTemporal = conexion.prepareStatement(codigoSql, Statement.RETURN_GENERATED_KEYS);
            

            stCrearTemporal.setString(1,gerenteTemp1.getNombre());
            stCrearTemporal.setString(2,gerenteTemp1.getApellido());
            stCrearTemporal.setDouble(3,gerenteTemp1.getSalario());
            stCrearTemporal.setString(4,gerenteTemp1.getDepartamento());

            int filasAfectadas = stCrearTemporal.executeUpdate();
            //Como solo hago un insert por ejecución siempre va a haber una sola clave generada o ninguna por algún error
            ResultSet clavesGeneradas = stCrearTemporal.getGeneratedKeys();
            clavesGeneradas.next();
            //asignamos al empleado que estamos creando su clave creada por SERIAL en la base de datos
            gerenteTemp1.setIdentificador(clavesGeneradas.getInt("identificador"));


        } catch (SQLException e) {
            e.printStackTrace();
            
        }



    
        return gerenteTemp1.getIdentificador();
        

    }

    /**Guarda los datos de los empleados en la base de datos
     * @returns void
     */
    public static void guardarDatosEnBD(){


    }


    /**Carga los datos de los empleados en la base de datos
     * @throws Exception 
     * @returns void
     */
    public static void cargarDatosDesdeBD() throws Exception{
        String nombreCache;
        String apellidoCache;
        Double salarioCache;
        Integer identificadorCache;
        String departamentoCache;
        
        
        String codigoSqlEmpleadosTemporales = "SELECT * FROM empleados_temporales";
        String codigoSqlGerentes = "SELECT * FROM gerentes";
        
        try {
            PreparedStatement statementCargaDatos = conexion.prepareStatement(codigoSqlEmpleadosTemporales);
            ResultSet resultadoQueryTemporales = statementCargaDatos.executeQuery();
            while (resultadoQueryTemporales.next()) {

                //Saca los datos necesarios del resultset para obtener de una fila todos los atributos necesarios para construir un empleadoTemporal y los guarda en variables
                nombreCache = resultadoQueryTemporales.getString("nombre");
                apellidoCache = resultadoQueryTemporales.getString("apellido");
                salarioCache =  resultadoQueryTemporales.getDouble("salario") ;
                identificadorCache = resultadoQueryTemporales.getInt("identificador");

                //Se usan las variables para crear un objeto temporal que añadir al ArrayList que contiene nuestros empleados
                EmpleadoTemporal empleadoTemporalCache = new EmpleadoTemporal(nombreCache, apellidoCache, salarioCache, identificadorCache);

                GestionEmpleados.listaEmpleados.add(empleadoTemporalCache);
            }

            PreparedStatement statementCargaDatosGerente = conexion.prepareStatement(codigoSqlGerentes);
            ResultSet resultadoQueryTemporalesGerente = statementCargaDatosGerente.executeQuery();
            while (resultadoQueryTemporalesGerente.next()) {

                //Saca los datos necesarios del resultset para obtener de una fila todos los atributos necesarios para construir un empleadoTemporal y los guarda en variables
                nombreCache = resultadoQueryTemporalesGerente.getString("nombre");
                apellidoCache = resultadoQueryTemporalesGerente.getString("apellido");
                salarioCache =  resultadoQueryTemporalesGerente.getDouble("salario") ;
                identificadorCache = resultadoQueryTemporalesGerente.getInt("identificador");
                departamentoCache = resultadoQueryTemporalesGerente.getString("departamento");

                //Se usan las variables para crear un objeto temporal que añadir al ArrayList que contiene nuestros empleados
                Gerente empleadoTemporalCache = new Gerente(nombreCache, apellidoCache, salarioCache,departamentoCache, identificadorCache);
                GestionEmpleados.listaEmpleados.add(empleadoTemporalCache);
                
            }




        } catch (SQLException e) {
            realizarRollback();
            e.printStackTrace();
        }
        
        
        realizarCommitBD();

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