import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class AddUser {

    static Scanner sc = new Scanner(System.in);

    public static Usuario adduser(Statement statement) throws SQLException{

        
        ArrayList<String> listaParametros = new ArrayList<>();

        System.out.println("Introduce el nombre del usuario");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el apellido1 del usuario");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el apellido2 del usuario");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce la edad del usuario");
        listaParametros.add(String.valueOf(sc.nextInt()));


        Usuario usuarioNuevo = new Usuario(listaParametros.get(0),listaParametros.get(1),listaParametros.get(2),listaParametros.get(3));


        String sentenciaSqlBase = 
        "INSERT INTO usuarios (nombre,apellido1,apellido2,edad)" //(nombre),(apellido1),[apellido2],(edad)
        +"VALUES ("+"'" + usuarioNuevo.nombre+"',"+"'" + usuarioNuevo.apellido1+"'," +"'" + usuarioNuevo.apellido2+"'," + Integer.parseInt(usuarioNuevo.edad) + ")";
    
    if (sentenciaSqlBase != "INSERT INTO usuarios (nombre,apellido1,apellido2,edad) VALUES ()") { // (nombre),(apellido1),[apellido2],(edad)
        
        statement.execute(sentenciaSqlBase,Statement.RETURN_GENERATED_KEYS);//poner el segundo argumento permite que se retornen las claves generadas (Tengo que testear si las claves son las correctas)
        ResultSet generatedKeys = statement.getGeneratedKeys();

        if (generatedKeys.next()) { // este next afecta a las lineas de el resultset
            usuarioNuevo.id = String.valueOf(generatedKeys.getInt(1)) ;
        } else {
            System.out.println("No se pudo obtener la id");
        }
        
        System.out.println("La clave del usuario nuevo creado es:" + String.valueOf(generatedKeys.getInt(1))); //del resulset.get...(1) 1 es la columna
        
    

        
    }else{
        System.out.println("Fallo, no existe sentencia sql");
    }

        return usuarioNuevo;

    }



    
}