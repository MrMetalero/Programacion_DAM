public class Libro {

    String id;
    String titulo;
    String autor;
    String editorial;
    String ubicacion;
    String isbn;
    boolean prestado = false;
    Empleado prestadoPor = null;
    Usuario prestadoUsuario = null;

    Libro(String titulo, String autor, String editorial, String ubicacion, String isbn, boolean prestado,Empleado prestadoPor, Usuario prestadoUsuario){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ubicacion = ubicacion;
        this.isbn = isbn;
        this.prestado = prestado;
        this.prestadoPor = prestadoPor;
        this.prestadoUsuario = prestadoUsuario;


    }

      


}