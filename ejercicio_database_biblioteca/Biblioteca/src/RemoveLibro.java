import java.sql.*;
import java.util.ArrayList;
public abstract class RemoveLibro {


    public static void borrarLibro(Statement stBorrar) throws Exception{
        //Llama primero a la búsqueda de libros para traerse los datos de los libros que quieres eliminar
        ArrayList<Libro> librosBorrables = BuscarLibros.opcionesBuscarLibros();
        String sentenciaIdsLibrosBorrables= "";
        for (int i = 0; i < librosBorrables.size()-1; i++) {  //ASEGURARSE DE QUE SIZE ES CORRECTO PENDIENTE

            if (librosBorrables.size() == 2) { // PUEDE CAMBIAR POR SIZE
                if (i == 0) {
                    sentenciaIdsLibrosBorrables += librosBorrables.get(i).id +",";
                }else{
                    sentenciaIdsLibrosBorrables += librosBorrables.get(i).id;
                }
                
            }
            else if (librosBorrables.size() == 1) { // PUEDE CAMBIAR POR SIZE
                sentenciaIdsLibrosBorrables += librosBorrables.get(i).id;

            }else if (librosBorrables.size() < 1) {
                throw new Exception("Error, no se han seleccionado libros borrables");

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