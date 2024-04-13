import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AddEmpleado {

    static Scanner sc = new Scanner(System.in);

    public static Empleado addEmpleado(Statement statement) throws SQLException{

    
        ArrayList<String> listaParametros = new ArrayList<>();

        System.out.println("Introduce el nombre del empleado");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el apellido1 del empleado");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce el apellido2 del empleado");
        listaParametros.add(sc.nextLine());
        System.out.println("Introduce la edad del empleado");
        listaParametros.add(String.valueOf(sc.nextInt()));


        Empleado empleadoNuevo = new Empleado(listaParametros.get(0),listaParametros.get(1),listaParametros.get(2),listaParametros.get(3));


        String sentenciaSqlBase = 
        "INSERT INTO empleados (nombre,apellido1,apellido2,edad)" //(nombre),(apellido1),[apellido2],(edad)
        +"VALUES ("+"'" + empleadoNuevo.nombre+"',"+"'" + empleadoNuevo.apellido1+"'," +"'" + empleadoNuevo.apellido2+"'," + Integer.parseInt(empleadoNuevo.edad) + ")";

        if (sentenciaSqlBase != "INSERT INTO empleados (nombre,apellido1,apellido2,edad) VALUES ()") { // (nombre),(apellido1),[apellido2],(edad)
        
        statement.execute(sentenciaSqlBase,Statement.RETURN_GENERATED_KEYS);//poner el segundo argumento permite que se retornen las claves generadas (Tengo que testear si las claves son las correctas)
        ResultSet generatedKeys = statement.getGeneratedKeys();

        if (generatedKeys.next()) { // este next afecta a las lineas de el resultset
            empleadoNuevo.id = String.valueOf(generatedKeys.getInt(1)) ;
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