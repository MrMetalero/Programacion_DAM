package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        int numeroMax;  
        int controlDeLineas = 1;
        int filaCompletada = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número límite");
        numeroMax = sc.nextInt();


    
            
        for (int x = 1; x < numeroMax+1; x = x) { //Hacer esto 15 veces por ejemplo
            
            
            for (int i = 0; i < controlDeLineas; i++) {
            	System.out.print(x);
                if(x >1){System.out.print(" ");} //Para añadir un espacio a los números y no verlos apelotonados, solo después de imprimir el primero
                                     //Printea el número una vez en la primera fila
                                    //Luego al salir del loop le añadimos 1 bien para la siguiente fila
                                    //O bien para el siguiente print
                                    //En el caso del 2, lo imprimirá al acabar
            	
                if (i == controlDeLineas-1) {
                    System.out.print("\n");
                }
                x += 1;
            }
            controlDeLineas +=1;
        }

      






    }
}