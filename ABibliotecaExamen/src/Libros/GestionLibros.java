package Libros;

import java.util.Iterator;
import BaseDatosFunciones.BDFunciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

import excepciones.FailedCreateLibro;
import excepciones.LibroNoEncontradoException;
import utilidades.EntradaSalida;

/**
 * GestionLibros
 */
public abstract class GestionLibros {
   
    public static ArrayList<Libro> listaLibros = new ArrayList<Libro>();






    /**
     * Crea y agrega un nuevo Libro a la base de datos y al Arraylist listaLibros
     * @param Libro
     * @throws SalarioInvalidoException 
     */
    public static void agregarLibro() throws FailedCreateLibro{
        Libro libroTempCreado = null;
        try {
            libroTempCreado = new Libro();
            
        } catch (FailedCreateLibro e) { //Captura y relanza la excepción más arriba
            throw e;
        }

        
        BDFunciones.realizarCommitBD();
        listaLibros.add(libroTempCreado);
        
    }

    public static void agregarLibro(int hardcoded) throws FailedCreateLibro{
        Libro libroTempCreado = null;
       
        libroTempCreado = new Libro("libro", "autor1", 1997, "genero1");
            
        libroTempCreado.identificador = BDFunciones.crearLibroBD(libroTempCreado);

        
        BDFunciones.realizarCommitBD();
        listaLibros.add(libroTempCreado);
        
    }

    public static void agregarColeccionLibros() throws FailedCreateLibro{
        Libro libroTempCreado = null;
        Libro libroTempCreadoSegundo = null;
        try {
            libroTempCreado = new Libro();
            
        } catch (FailedCreateLibro e) { //Captura y relanza la excepción más arriba
            throw e;
        }

        libroTempCreado.identificador = BDFunciones.crearLibroBD(libroTempCreado);

        libroTempCreadoSegundo = libroTempCreado;
        libroTempCreadoSegundo.titulo += " parte II";

        libroTempCreadoSegundo.identificador = BDFunciones.crearLibroBD(libroTempCreadoSegundo);


        
        BDFunciones.realizarCommitBD();
        listaLibros.add(libroTempCreado);
        
    }


    /**
     * Elimina Libros recogiendo una ID. Utiliza un iterador para evitar excepciones recorriendo el ArrayList
     * @param id
     * @throws LibroNoEncontradoException 
     */
    public static void eliminarLibro() throws LibroNoEncontradoException{
        Libro LibroActual = null;
        Iterator<Libro> it = listaLibros.iterator();
        System.out.println("Introduce la ID del Libro a eliminar:");
        Integer idInput = EntradaSalida.getInteger();
        //Recorre el arraylist de los Libros y busca el que coincide
       while (it.hasNext()) {
            LibroActual = it.next();
            if (LibroActual.identificador == idInput) {
                it.remove();
                break; //Detiene la ejecución del loop una vez encuentra el libro que tiene que borrar para evitar errores
            }
        }

        // Para evitar eliminar en la base de datos si no se encuentra o que de error porque el Libro está inicializado en null
        if (LibroActual == null) {
            throw new LibroNoEncontradoException("No se ha podido encontrar el Libro a borrar");
        }

        BDFunciones.eliminarLibroBD(LibroActual); //El Libro que tiene que pasar es el que coincide en el momento que encuentra el ID
        BDFunciones.realizarCommitBD();


    }






    /**
     * Busca y lista Libros recogiendo un nombre de autor
     * @param idInput (Integer) Se pide un valor a través de EntradaSalida que es el nombre de autor a buscar
     * @param printearLibro (boolean) true para mostrar el Libro, false para no mostrarlo
     * @return el último libro encontrado
     */
    public static Libro buscarLibro(boolean printearLibro){
        Libro LibroEncontrado = null;
        System.out.println("Introduce un nombre de autor para buscar un Libro");
        String autorInput = EntradaSalida.getString();

        //Recorre el arraylist de los Libros y busca el que coincide
        for (Libro LibroActual : listaLibros) {
            //Recorre el arraylist de los Libros y busca el que coincide
                if (LibroActual.autor.matches(autorInput)) {
                    LibroEncontrado = LibroActual;
                    if (printearLibro) {
                        System.out.println(LibroActual.toString()); // OPCIONAL EL MOSTRAR EL Libro
                    }
                    
                }
            

        }
        //Si no se encuentra el Libro lanza una excepción
        if (LibroEncontrado == null) {

            try {
                throw new LibroNoEncontradoException("No se ha encontrado el Libro con la ID "+ autorInput);
            } catch (LibroNoEncontradoException e) {
                e.printStackTrace();
            }
        }

        return LibroEncontrado;
    }

    /**Lista los Libros del ArrayList 
     * @Exception Si no hay Libros en el ArrayList listaLibros lanza excepción
     */
    public static void listarLibros(){

        for (Libro LibroActual : listaLibros) {

            if (listaLibros.size() < 1) {
                try {
                    throw new Exception("No hay Libros en la lista");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                System.out.println(LibroActual.toString());
        }
    }

 

 

  















}