import java.sql.*;
public abstract class RemoveLibro {

    


    public static void borrarLibroId(Statement stBorrar, String idLibroBorrar){

        String sentenciaSqlBase = 
        "DELETE FROM libros WHERE id = " + idLibroBorrar;

        try {
            stBorrar.execute(sentenciaSqlBase);
        } catch (SQLException e) {
            System.out.println("error al borrar" + e.getMessage());
        }

        try {
            Sincronizar.sync(stBorrar);
        } catch (SQLException e) {
            System.out.println("No se ha podido sincronizar");
        }


        


    }

    public static void borrarLibroTitulo(Statement stBorrar, String tituloLibroBorrar){

        String sentenciaSqlBase = 
        "DELETE FROM libros WHERE titulo = '" + tituloLibroBorrar+"'";

        try {
            stBorrar.execute(sentenciaSqlBase);
        } catch (SQLException e) {
            System.out.println("error al borrar" + e.getMessage());
        }

        try {
            Sincronizar.sync(stBorrar);
        } catch (SQLException e) {
            System.out.println("No se ha podido sincronizar");
        }


    }





}