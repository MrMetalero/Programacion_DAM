import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        int asignadorID = 0;
        ArrayList<Libro> biblioteca = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();


        String sql = "CREATE TABLE empleados " +
        "(id INTEGER not NULL, " +
        " nombre VARCHAR(255), " + 
        " apellido VARCHAR(255), " + 
        " edad INTEGER, " + 
        " PRIMARY KEY ( id ))";


        try {
            Class.forName("org.postgresql.Driver");
            // Conectamos con la base de datos
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca","mati", "mati");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
            
















        
        
        
        Statement st = connection.createStatement();
        connection.setAutoCommit(false); // cuidado que si no está entre esto y commit no funciona
        st.executeUpdate(sql); // ejecuta el comando que he escrito en el string sql





        connection.commit(); //Esta mierda putea si escribes algún comando sql debajo porque no lo ejecuta. (Confirma y ejecuta los cambios porque le he  puesto que no haga auto commit)
        st.close(); // cierra el statement
        connection.close();// cierra la conexión
    }



}

