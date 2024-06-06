package BaseDatosFunciones;
import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.html.HTMLDocument.Iterator;

import Libros.GestionLibros;
import Libros.Libro;
import utilidades.EntradaSalida;
/**
 * BaseDatosFunciones Realiza el manejo de diferentes operaciones con bases de datos para facilitar la implementación de los métodos y mejorar la lectura del código
 */
public abstract class BDFunciones {

    public static Connection conexion = EntradaSalida.establecerConexion("examenbiblioteca", "mati", "mati");



    /**Crea un Libro en la base de datos y devuelve el identificador del Libro creado
     * @returns (Integer) identificador de la base de datos para un Libro
     */
    public static Integer crearLibroBD(Libro LibroTemp1){
        String codigoSql = "INSERT INTO libromena (titulo,autor,any_publicacion,genero) VALUES(?,?,?,?)";
        PreparedStatement stCrearTemporal;
        int filasAfectadas = 0;
        try {
            stCrearTemporal = conexion.prepareStatement(codigoSql, Statement.RETURN_GENERATED_KEYS);
            

            stCrearTemporal.setString(1,LibroTemp1.getTitulo());
            stCrearTemporal.setString(2,LibroTemp1.getAutor());
            stCrearTemporal.setInt(3,LibroTemp1.getAny_publicacion());
            stCrearTemporal.setString(4,LibroTemp1.getGenero());


            System.out.println(filasAfectadas = stCrearTemporal.executeUpdate()); //Las filas se muestran al ejecutar el statement
            //Como solo hago un insert por ejecución en este caso siempre va a haber una sola clave generada o ninguna por algún error
            ResultSet clavesGeneradas = stCrearTemporal.getGeneratedKeys();
            clavesGeneradas.next();
            //asignamos al Libro que estamos creando su clave creada por SERIAL en la base de datos
            LibroTemp1.setIdentificador(clavesGeneradas.getInt("id"));


        } catch (SQLException e) {
            e.printStackTrace();
            
        }

        System.out.println("Clave generada:" + LibroTemp1.getIdentificador());

        // solo se retorna la ID por si es necesaria para otra función
        return LibroTemp1.getIdentificador();
        

    }



    public static void eliminarLibroBD(Libro libroTemp1){
        String codigoSql = "DELETE FROM libromena WHERE id = ?;";
        PreparedStatement stCrearTemporal;
        int filasAfectadas = 0;

        try {
            stCrearTemporal = conexion.prepareStatement(codigoSql);
            stCrearTemporal.setInt(1, libroTemp1.getIdentificador());
            System.out.println(filasAfectadas = stCrearTemporal.executeUpdate());
            //Como solo hago un insert por ejecución siempre va a haber una sola clave generada o ninguna por algún error

        } catch (SQLException e) {
            e.printStackTrace();
            
        }



    

    }

    /**Guarda los datos de los Libros en la base de datos
     * @returns void
     */
    public static void guardarDatosEnBD(){


    }


    /**Carga los datos de los Libros en la base de datos recogiendo los datos de la tabla libromena en variables temporales que forman objetos
     * que se van añadiendo a un arraylist hasta que se vacia el resultset
     * @throws Exception 
     * @returns void
     */
    public static void cargarDatosDesdeBD() throws Exception{
        Integer identificadorCache;
        String tituloCache;        
        String autorCache;
        Integer any_publicacionCache;
        String generoCache;
        
        
        
        
        String codigoSqlLibrosTemporales = "SELECT * FROM libromena";
        
        try {
            PreparedStatement statementCargaDatos = conexion.prepareStatement(codigoSqlLibrosTemporales);
            ResultSet resultadoQueryTemporales = statementCargaDatos.executeQuery();
            while (resultadoQueryTemporales.next()) {

                //Saca los datos necesarios del resultset para obtener de una fila todos los atributos necesarios para construir un Libro y los guarda en variables
                identificadorCache = resultadoQueryTemporales.getInt("id");
                tituloCache = resultadoQueryTemporales.getString("titulo");
                autorCache = resultadoQueryTemporales.getString("autor");
                any_publicacionCache =  resultadoQueryTemporales.getInt("any_publicacion") ;
                generoCache = resultadoQueryTemporales.getString("genero");

                //Se usan las variables para crear un objeto temporal que añadir al ArrayList que contiene nuestros Libros
                Libro LibroCache = new Libro(tituloCache, autorCache, any_publicacionCache, generoCache,identificadorCache);

                GestionLibros.listaLibros.add(LibroCache); //añade al arraylist todos los libros cargados de la BBDD
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