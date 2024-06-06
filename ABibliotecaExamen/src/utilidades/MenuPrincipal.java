package utilidades;

import java.io.IOException;
import BaseDatosFunciones.BDFunciones;
import Libros.GestionLibros;
import excepciones.CaseNotFoundException;
import excepciones.LibroNoEncontradoException;
import excepciones.FailedCreateLibro;
import main.App;

/**
 * Menu
 */
public class MenuPrincipal {


    /**Método que nos muestra el menú principal y nos deja meter las opciones 
     * @throws Exception */
    public static void menuPrincipal() throws CaseNotFoundException {

        System.out.println("\n[1] Añadir un libro\n" + //
        "[2] Añadir dos libros\n" + //
        "[3] Actualizar un libro\n" + //
        "[4] Eliminar un libro\n" + //
        "[5] Consultar libros por autor\n" + //
        "[6] Consultar todos los libros\n" + //
        "[7] Salir\n"
        );

        int programaControl = 7; //Por defecto salir

        //Control de el programa y su excepción en caso de valor no válido
        try {
            programaControl = EntradaSalida.getInt();
        } catch (Exception e) {
            
            e.printStackTrace();
        }


        switch (programaControl) {
            case 1:
                try {
                    GestionLibros.agregarLibro(1); //ELIMINAR EL numero de la función para usar el programa sin hardcoding !!!!
                } catch (FailedCreateLibro e) { //Si se detecta error al crear el usuario rollback
                    e.printStackTrace();
                    BDFunciones.realizarRollback(); 
                }
            break;

            case 2:
                try {
                    GestionLibros.agregarColeccionLibros();
                } catch (FailedCreateLibro e) {
                    e.printStackTrace();
                }
            break;

            case 3:
           
            break;

            case 4:
                try {
                    GestionLibros.eliminarLibro();
                } catch (LibroNoEncontradoException e) {
                    e.printStackTrace();
                }
            break;

            case 5:
                GestionLibros.buscarLibro(true);
            break;

            case 6:
                GestionLibros.listarLibros();
            break;

            case 7:
                App.programaEncendido = false;
            break;

        
            default:

            try {
                throw new CaseNotFoundException("ESA OPCIÓN NO EXISTE, ELIGE OTRA");
            } catch (Exception e) {
                e.printStackTrace();
            }
                
        }

    }
    
}