package actividades_propuestas_t8;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {


    
    public static void main(String[] args) {
        
        String textoLeer = "este Este es el texto a comprobar";

        // .Split permite dividir un String basándose en una expresión regular
        // Si specificamos " " (espacio) podremos separar el string en palabras.
        // El 0 del final es el número de veces que se separa el string. 0 es todas las posibles
        String[] arrayPalabras = textoLeer.split(" ",0);


        System.out.println(Arrays.toString(arrayPalabras));

        String[] arrayCopiado = Arrays.copyOf(arrayPalabras, arrayPalabras.length);
        Arrays.sort(arrayCopiado); // Ordenamos la copia par poder hacer binary search.
        String palabrasCache = "";
        int contador = 0;
        int contadorDiferentes = 0;
        
      
       
            

            for (int i = 0; i < arrayCopiado.length; i++) {

                // Comprueba si el i actual es igual a si mismo para hacer el conteo y evitar los null
                // si es null (que sería una repetición) no se suma 1 al contador
                if(arrayCopiado[i].equalsIgnoreCase(arrayCopiado[i]) && arrayCopiado[i] != ""){

                    contadorDiferentes += 1;
                    palabrasCache += arrayCopiado[i];

                    // Este for recorre el array poniendo a null todos los valores de la palabra encontrada
                    // Para que al volver a pasarlo por el for de arriba, no se detenga en las palabras
                    // iguales a la que acabamos de comprobar
                    for (int x = 0; x < arrayCopiado.length; x++) { 

                        //Comprueba si coincide con la palabra encontrada para no borrar las otras
                        if(palabrasCache != "" && palabrasCache.equalsIgnoreCase(arrayCopiado[i]) ){ 
                            arrayCopiado[x] = ""; 
                        }
                    }

                    palabrasCache = "";
                }
                
               

            }






       


    
        System.out.println("Contador diferentes: " + contadorDiferentes);


        
    }

}
