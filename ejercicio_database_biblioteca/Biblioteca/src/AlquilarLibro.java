
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlquilarLibro {
    private static ArrayList<Libro> librosPrestables = BuscarLibros.opcionesBuscarLibros();
    private static Scanner sc = new Scanner(System.in);
    



    public static void alquilarLibro(Statement stAlquilar) throws Exception{
        int idControlPrestar = -1;
        int idUsuarioaPrestar = 0;
        int idEmpleadoPrestar = 0;
        
        boolean empleadoEncontrado = false;
        boolean usuarioEncontrado = false;
        boolean idLibroEncontrada = false;
        String sentenciaAlquilar = "UPDATE libros SET prestado = true, SET prestadopor ="+idEmpleadoPrestar+",SET prestadousuario ="+idUsuarioaPrestar+" WHERE id= idControlPrestar;";




        do {

            System.out.println("Introduce tu numero de empleado:...");//Introduce el id del empleado
            idEmpleadoPrestar = sc.nextInt();

            for (Empleado empleado : App.empleados) { //Comprueba si existe tu numero de empleado
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
    
                    idControlPrestar = sc.nextInt(); //Introduce el id del libro o la opción de salir
    
                    if (idControlPrestar != -1) { //comprueba si el ID introducido coincide con uno de los libros listados
        
                        for (Libro libro : librosPrestables) {
                            if (String.valueOf(idControlPrestar) == libro.id) {
                                idLibroEncontrada = true; //Si coincide con alguno

        
                            }
        

                        } 


                    
                        
                        if (idLibroEncontrada == false) { //NO coincide con alguno
                        System.out.println("No se ha encontrado esa ID entre las opciones. Introduce otra ID de la lista");
                        }else{

                            //comprobación del usuario

                            System.out.println("Introduce el ID del usuario al que se va a prestar el libro");
                            idUsuarioaPrestar = sc.nextInt();


                            for (Usuario usuario : App.usuarios) { //comprueba si el usuario existe
                                if (String.valueOf(idUsuarioaPrestar) == usuario.id) {
                                    usuarioEncontrado = true;
                                }
                            }
                            
                            if (usuarioEncontrado) {
                                
                                stAlquilar.execute(sentenciaAlquilar);
                                App.connection.commit(); //aplica los cambios
                            }


                        }
        
                    

    
                    }
    
                    

            }else{
                throw new Exception("ERROR AL INTRODUCIR LA ID DEL EMPLEADO. SALIENDO...");

            }


    

        } while (idControlPrestar != -1);
        

        stAlquilar.close(); //cuando acaba cierra el statement

    }






    public static void devolverLibro(Statement stDevolver) throws Exception{
        int idControlDevolver = -1;
     
        int idEmpleadoDevolver;
        boolean empleadoEncontrado = false;
        boolean idLibroEncontrada = false;
        String sentenciaAlquilar = "UPDATE libros SET prestado = false WHERE id="+idControlDevolver+";";




        do {

            System.out.println("Introduce tu numero de empleado:...");//Introduce el id del empleado
            idEmpleadoDevolver = sc.nextInt();

            for (Empleado empleado : App.empleados) { //Comprueba si existe tu numero de empleado
                if (String.valueOf(idEmpleadoDevolver) == empleado.id) {
                    empleadoEncontrado = true;
                }
            }

            if (empleadoEncontrado) {
                


                for (Libro libro : librosPrestables) { // Lista los libros encontrados filtrando los que no están prestados

                    if (libro.prestado == false) { // Puede dar confusión pero los libros en este caso son los prestados
                        librosPrestables.remove(libro);
                    }else{
                        System.out.println("\n\n"+libro.toString());
                        
        
                    }
        

                }
                    System.out.println("Introduce un [IDLibro] para devolver un libro\n"
                    +"o introduce [-1] para salir"
                    );
    
                    idControlDevolver = sc.nextInt(); //Introduce el id del libro o la opción de salir
    
                    if (idControlDevolver != -1) { //comprueba si el ID introducido coincide con uno de los libros listados
        
                        for (Libro libro : librosPrestables) {
                            if (String.valueOf(idControlDevolver) == libro.id) {
                                idLibroEncontrada = true; //Si coincide con alguno

                                

        
                            }
        

                        } 


                    
                        
                        if (idLibroEncontrada == false) { //NO coincide con alguno
                        System.out.println("No se ha encontrado esa ID entre las opciones. Introduce otra ID de la lista");
                        }else{

                         
                            if (idLibroEncontrada) {
                                
                                stDevolver.execute(sentenciaAlquilar);
                                App.connection.commit(); //aplica los cambios
                            }


                        }
        
                    

    
                    }
    
                    

            }else{
                throw new Exception("ERROR AL INTRODUCIR LA ID DEL EMPLEADO. SALIENDO...");

            }


    

        } while (idControlDevolver != -1);
        
        stDevolver.close(); //cuando acaba cierra el statement


    }

}