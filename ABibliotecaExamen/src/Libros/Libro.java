package Libros;

import utilidades.EntradaSalida;
import java.util.HashSet;
import java.util.Set;

import BaseDatosFunciones.BDFunciones;
import excepciones.FailedCreateLibro;

import java.util.Queue;
import java.util.LinkedList;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;


/**
 * Libro
 * Clase que envuelve a los Libros 
 * @param identificador
 * @param titulo
 * @param autor
 * @param any_publicacion
 * @param genero 
 */
public class Libro {
    
    protected Integer identificador = null;
    protected String titulo = null;
    protected String autor = null;
    protected Integer any_publicacion = null;  //NECESITA UN FORMATO DE FECHA 
    protected String genero = null;
    



    /**El constructor para construir un objeto Libro 
     *  
     *@param identificador
    * @param titulo
    * @param autor
    * @param any_publicacion
    * @param genero 
    * 
    */
    public Libro() throws FailedCreateLibro{
        System.out.println("Introduce un titulo");
        titulo = EntradaSalida.getString();
        System.out.println("Introduce un autor");
        autor = EntradaSalida.getString();
        System.out.println("Introduce un año de publicación");
        any_publicacion = EntradaSalida.getInteger();
        System.out.println("Introduce un género");
        genero = EntradaSalida.getString();
        
    
    }


    /**
     * Constructor de objetos Libro PARA LA CARGA DE LA BASE DE DATOS con los atributos comunes pasados como argumentos
     * @param tituloLibro (String)
     * @param autorLibro (String)
     * @param any_publicacionLibro (Integer)
     * @param generoLibro (String)
     * @param id (Int)
     * @throws SalarioInvalidoException 
     */
    public Libro(String tituloLibro, String autorLibro, Integer any_publicacionLibro, String generoLibro, Integer id) {
        titulo = tituloLibro;
        autor = autorLibro;
        any_publicacion = any_publicacionLibro;
        genero = generoLibro;
        identificador = id;

    
    }


    /**
     * Constructor de objetos Libro PARA LA CARGA DE LA BASE DE DATOS con los atributos comunes pasados como argumentos
     * @param tituloLibro (String)
     * @param autorLibro (String)
     * @param any_publicacionLibro (Integer)
     * @param generoLibro (String)
     * @throws SalarioInvalidoException 
     */
    public Libro(String tituloLibro, String autorLibro, Integer any_publicacionLibro, String generoLibro) {
        titulo = tituloLibro;
        autor = autorLibro;
        any_publicacion = any_publicacionLibro;
        genero = generoLibro;

    
    }



 
    

    //GETTERS Y SETTERS

    public Integer getIdentificador() {
        return identificador;
    }


    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public Integer getAny_publicacion() {
        return any_publicacion;
    }


    public void setAny_publicacion(Integer any_publicacion) {
        this.any_publicacion = any_publicacion;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Libro [identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor
                + ", any_publicacion=" + any_publicacion + ", genero=" + genero + "]";
    }


  
   
    
}