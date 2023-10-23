package ejercicios_propuestos_t11;
import java.util.Scanner;

public class Ejercicio1 {

    public static int funcionIterativaFactor( int numRecibido){
        int factorRetornoResultado = 1;
    
        //5 = 5*4*3*2*1
        for (int i = 0; i < numRecibido; i++) {
            factorRetornoResultado += factorRetornoResultado * i;

            System.out.println("control factorretorno: "+ factorRetornoResultado);
            
        }

        return factorRetornoResultado;
        
    }

        
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor para calcular factorial");
        int numInputIterativo = sc.nextInt();
        
        
        System.out.println(funcionIterativaFactor(numInputIterativo)); 

    }
}
