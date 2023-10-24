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
        *  1*2 = funcionRecursivaFactor(numRecibido) * funcionRecursivaFactor(numRecibido) *
        *  2*3 = (funcionRecursivaFactor(numRecibido)*2) * funcionRecursivaFactor(numRecibido)*2
        * 
        */

        if(numRecibido == 1){
           return numRecibido;
        }
        else
        {
            return funcionRecursivaFactor(numRecibido-1)*numRecibido;
        }
                                    //4      *      5
                                    // 
        

    }



        
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor para calcular factorial");
        int numInputFactorial = sc.nextInt();
        
        
        System.out.println(funcionIterativaFactor(numInputFactorial)); 

        System.out.println(funcionRecursivaFactor(numInputFactorial));
    }
}
