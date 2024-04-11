import java.sql.*;

public class Sincronizar {

    



    public static void sync(Statement st) throws SQLException{

        ResultSet rsUsuarios;
        rsUsuarios = st.executeQuery("SELECT * FROM usuarios");
    
        ResultSet rsEmpleados;
        rsUsuarios = st.executeQuery("SELECT * FROM empleados");

        ResultSet rsLibros;
        rsUsuarios = st.executeQuery("SELECT * FROM libros");





    }




}