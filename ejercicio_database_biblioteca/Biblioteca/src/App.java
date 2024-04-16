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
    static Connection connection = null;
    public static void main(String[] args) throws Exception {
        
        boolean encendidoPrograma = true;
        int programaControl = -1;
  
     

        try {
            Class.forName("org.postgresql.Driver");
            // Conectamos con la base de datos
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca","mati", "mati");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
            
        
        connection.setAutoCommit(false); // cuidado que si no está entre esto y commit no funciona

        while (encendidoPrograma) {
            
            do {
                
                try {
                    System.out.println(
                        "Introduce una de las opciones del menú:"
                        + "[1] Gestión de libros"
                        + "[2] Gestión de usuarios" 
                        + "[3] Gestión de empleados"
                        + "[4] Salir"

                    );


                    if (programaControl > 4 | programaControl < 1) {
                        throw new Exception("Esa opción del menú no existe, inténtalo de nuevo");
                    }else{
                        ID
                        switch (programaControl) {
                            case 1:
                                GestionLibros.menuLibros();
                                break;

                            case 2:
                                GestionUsuarios.menuUsuarios();
                                break;
                            case 3:
                                GestionEmpleados.menuEmpleado();
                                break;

                            case 4:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                break;
                        }






                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }


                


                
            } while (programaControl > 4 | programaControl < 1);





        }



        Statement stMain = connection.createStatement(); //statement para sincronizar al final

        try {
            Sincronizar.sync(stMain);
        } catch (SQLException e) {
            System.out.println("No se ha podido sincronizar" + e.getMessage());
        }
        

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).nombre);
        }


        



        usuarios.add(AddUser.addUser(stMain)); //añade un usuario nuevo
        biblioteca.add(AddLibro.addLibro(stMain));
        empleados.add(AddEmpleado.addEmpleado(stMain));
        
        

        connection.commit(); //Esta mierda putea si escribes algún comando sql debajo porque no lo ejecuta. (Confirma y ejecuta los cambios porque le he  puesto que no haga auto commit)
        
        
        
        
        stMain.close(); // cierra el statement
        connection.close();// cierra la conexión
    }



}

