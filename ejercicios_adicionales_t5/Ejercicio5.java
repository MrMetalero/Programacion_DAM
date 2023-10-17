package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio5 {
    
    static double F_Primos(double numX){
        
        int contador = 2;
        //System.out.println("Dentro de la función"); para debug
        double resto;
        boolean esprimo = true;

    if(numX < 2){ //elimina 1 y negativos, no son primos
         return 0;
    }else if(numX >= 4){ //comprueba cualquier número a partir de 4 
            
            do {resto = numX % contador; contador++;}
            
            while( esprimo && contador < numX && resto != 0 ); //asigna a resto el modulo de X entre
           
            /*  Si sale del loop  porque su resto es 0 en cualquiera de los pasos, no es primo 
             * menos cuando numX = contador, que es cuando se divide entre si mismo, cosa que
             * es una propiedad de los primos
            */

            if(resto == 0){
                 return 0;


            }else   return 1;
            
        }else  //contempla 2 y 3, primos

        return 1;
    }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int numInput1 = 100;

        System.out.println("Introduce el segundo número");
        int numInput2 = 1;

     

            for (int i = numInput2; i < numInput1; i++) {
                if(F_Primos(i) == 1) {System.out.println("El número "+ i +" es primo");}

            }

       

    }
}
