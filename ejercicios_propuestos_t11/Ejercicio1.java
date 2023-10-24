package ejercicios_propuestos_t11;
import java.util.Scanner;

public class Ejercicio1 {

    public static int funcionIterativaFactor(int numRecibido){
        int factorRetornoResultado = 1;
    
        //5 = 5*4*3*2*1
        for (int i = 0; i < numRecibido; i++) {
            factorRetornoResultado += factorRetornoResultado * i;

           
        }

        return factorRetornoResultado;
        
    }

    public static int funcionRecursivaFactor(int numRecibido){

        //Caso base: "1*1 = 1"

        /* 
        *  Recordar que al realizar estas operaciones, se va simplificando el problema con cada llamada
        *  Pero no se va resolviendo poco a poco, es más bien como si fuese enlazando preguntas
        *  Hasta llegar a la pregunta más sencilla que es mi caso base y luego se van resolviendo
        *  Todas las demás  partir de ese momento en cascada "hacia arriba" (El caso dado)
        */

        if(numRecibido == 1){
           return numRecibido;
        }
        else
        {
            return funcionRecursivaFactor(numRecibido-1)*numRecibido;
        }
                                  

    }



        
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor para calcular factorial");
        int numInputFactorial = sc.nextInt();
        
        
        System.out.println(funcionIterativaFactor(numInputFactorial)); 

        System.out.println(funcionRecursivaFactor(numInputFactorial));
    }
}
