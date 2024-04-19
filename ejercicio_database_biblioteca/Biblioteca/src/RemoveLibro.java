import java.sql.*;
import java.util.ArrayList;
public abstract class RemoveLibro {


    public static void borrarLibro(Statement stBorrar){
        ArrayList<Libro> librosBorrables = BuscarLibros.opcionesBuscarLibros();
        String sentenciaIdsLibrosBorrables= "";
        for (int i = 0; i < librosBorrables.size()-1; i++) {

            if (librosBorrables.size() == 2) {
                if (i == 0) {
                    sentenciaIdsLibrosBorrables += librosBorrables.get(i).id +",";
                }else{
                    sentenciaIdsLibrosBorrables += librosBorrables.get(i).id;
                }
                
            }
            else if (librosBorrables.size() == 1) {
                sentenciaIdsLibrosBorrables += librosBorrables.get(i).id;
            }else {

                if (i == 0) {
                    sentenciaIdsLibrosBorrables += librosBorrables.get(i).id;

                }else {
                    sentenciaIdsLibrosBorrables += "," + librosBorrables.get(i).id;

                }




            }
            


        }


        String sentenciaSqlBase = 
        "DELETE FROM libros WHERE id IN (";

        //Se le añade los indices a borrar a la sentencia SQL y el ; del final
        sentenciaSqlBase += sentenciaIdsLibrosBorrables + ");";

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