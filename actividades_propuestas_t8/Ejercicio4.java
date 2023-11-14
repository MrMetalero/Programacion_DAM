package actividades_propuestas_t8;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {


    
    public static void main(String[] args) {
        
        String textoLeer = "este Este es el texto el a comprobar ";

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
        boolean repetido = false;
        


        for (int i = 0; i < arrayCopiado.length; i++) { // recorre el array uno a uno

            //recorre los diferentes indices del array igual que arriba para
            //comparar el indice de i con todos los demás
            for (int j = 0; j < arrayCopiado.length && !repetido ;j++) {
                
                if(j != i)
                { 
                    if(arrayCopiado[i].equalsIgnoreCase(arrayCopiado[j]))
                    {
                        repetido=true;
                    }
                }
                
            }
            if(!repetido)
                contador++;
            
            repetido=false;
            
        }





    
        System.out.println("Contador diferentes: " + contador); 


        
    }

}



