import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class App {
    static ArrayList<Libro> biblioteca = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Connection connection = null;
       
        
  
     

        try {
            Class.forName("org.postgresql.Driver");
            // Conectamos con la base de datos
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca","postgres", "postgres");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
            
        Statement st = connection.createStatement();
        connection.setAutoCommit(false); // cuidado que si no está entre esto y commit no funciona

        try {
            Sincronizar.sync(st);
        } catch (SQLException e) {
            System.out.println("No se ha podido sincronizar" + e.getMessage());
        }
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).nombre);
        }






        usuarios.add(AddUser.addUser(st)); //añade un usuario nuevo
        biblioteca.add(AddLibro.addLibro(st));
        empleados.add(AddEmpleado.addEmpleado(st));
        
        

        connection.commit(); //Esta mierda putea si escribes algún comando sql debajo porque no lo ejecuta. (Confirma y ejecuta los cambios porque le he  puesto que no haga auto commit)
        st.close(); // cierra el statement
        connection.close();// cierra la conexión
    }



}

