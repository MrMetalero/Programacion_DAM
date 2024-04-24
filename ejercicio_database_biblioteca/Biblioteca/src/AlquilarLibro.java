
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlquilarLibro {
    private static ArrayList<Libro> librosPrestables = BuscarLibros.opcionesBuscarLibros();
    private static Scanner sc = new Scanner(System.in);
    



    public static void alquilarLibro(Statement stAlquilar) throws Exception{
        int controlPrestar = -1;
        int idUsuarioaPrestar;
        int idEmpleadoPrestar;
        
        boolean empleadoEncontrado = false;
        boolean usuarioEncontrado = false;
        boolean idEncontrada = false;
        String sentenciaAlquilar = "UPDATE libros SET prestado = true WHERE id="+controlPrestar+"";

      

        do {

            System.out.println("Introduce tu numero de empleado:...");//Introduce el id del empleado
            idEmpleadoPrestar = sc.nextInt();

            for (Empleado empleado : App.empleados) {
                if (String.valueOf(idEmpleadoPrestar) == empleado.id) {
                    empleadoEncontrado = true;
                }
            }

            if (empleadoEncontrado) {
                


                for (Libro libro : librosPrestables) { // Lista los libros encontrados filtrando los que están prestados

                    if (libro.prestado == true) {
                        librosPrestables.remove(libro);
                    }else{
                        System.out.println("\n\n"+libro.toString());
                        
        
                    }
        
                }
    
                System.out.println("Introduce un indice para prestar un libro\n"
                +"o introduce [-1] para salir"
                );
    
                controlPrestar = sc.nextInt(); //Introduce el id del libro o la opción de salir
    
                if (controlPrestar != -1) { //comprueba si el ID introducido coincide con uno de los libros listados
    
                    for (Libro libro : librosPrestables) {
                        if (String.valueOf(controlPrestar) == libro.id) {
                            idEncontrada = true; //Si coincide con alguno
    
                            System.out.println("Introduce el ID del usuario al que se va a prestar el libro");
                            idUsuarioaPrestar = sc.nextInt();
    
                            for (Usuario usuario : App.usuarios) {
                                if (String.valueOf(idUsuarioaPrestar) == usuario.id) {
                                    usuarioEncontrado = true;
                                }
                            }
    
                            if (usuarioEncontrado) {
                                
                            }
    
    
    
                        }
    
    
                    } 
                    if (idEncontrada == false) { //NO coincide con alguno
                        System.out.println("No se ha encontrado esa ID entre las opciones. Introduce otra ID de la lista");
                    }
    
    
                }
    
                    

            }else{
                throw new Exception("ERROR AL INTRODUCIR LA ID DEL EMPLEADO. SALIENDO...");

            }


    

        } while (controlPrestar != -1);
        



    }


}