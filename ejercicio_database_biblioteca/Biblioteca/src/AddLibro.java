import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AddLibro {

    static Scanner sc = new Scanner(System.in);

    public static Libro adduser(Statement statement) throws SQLException{

    
        ArrayList<String> listaParametros = new ArrayList<>();

        System.out.println("Introduce el título del libro");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el autor del libro");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce la editorial del libro");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce la ubicacion del libro");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el isbn del libro");
        listaParametros.add(sc.nextLine());


        Libro libroNuevo = new Libro(listaParametros.get(0),listaParametros.get(1),listaParametros.get(2),listaParametros.get(3),listaParametros.get(4),false,null,null);


        String sentenciaSqlBase = 
        "INSERT INTO usuarios (nombre,titulo,autor,editorial,ubicacion,isbn,prestado,prestadopor,prestadousuario)" //(nombre),(apellido1),[apellido2],(edad)
        +"VALUES ("+"'" + libroNuevo.titulo+"',"+"'" + libroNuevo.autor+"'," +"'" + libroNuevo.editorial+"'," + libroNuevo.ubicacion + ")";

        if (sentenciaSqlBase != "INSERT INTO usuarios (nombre,apellido1,apellido2,edad) VALUES ()") { // (nombre),(apellido1),[apellido2],(edad)
        
        statement.execute(sentenciaSqlBase,Statement.RETURN_GENERATED_KEYS);//poner el segundo argumento permite que se retornen las claves generadas (Tengo que testear si las claves son las correctas)
        ResultSet generatedKeys = statement.getGeneratedKeys();

        if (generatedKeys.next()) { // este next afecta a las lineas de el resultset
            libroNuevo.id = String.valueOf(generatedKeys.getInt(1)) ;
        } else {
            System.out.println("No se pudo obtener la id");
        }
        
        System.out.println("La clave del empleado nuevo creado es:" + String.valueOf(generatedKeys.getInt(1))); //del resulset.get...(1) 1 es la columna
        

        }else{
        System.out.println("Fallo, no existe sentencia sql");
        }

        return empleadoNuevo;


    }
}