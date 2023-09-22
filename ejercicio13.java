import java.util.*;





public class ejercicio13 {
    


    static double F_Primos(double numX){
        double numY = 1;
        int contador = 2;
        //System.out.println("Dentro de la función"); para debug
        double resto;
        boolean esprimo = true;

    if(numX < 2){ //elimina 1 y negativos, no son primos
        System.out.println("---El número  no es primo---");
    }else if(numX >= 4){ //comprueba cualquier número a partir de 4 
            
            do {resto = numX % contador; System.out.println("comprobando... "+ numX + " dividido entre " + contador); contador++;System.out.println("El divisor es ahora...: " + contador);}
            while( esprimo && contador < numX && resto != 0 ); //asigna a resto el modulo de X entre
           
            /*  Si sale del loop  porque su resto es 0 en cualquiera de los pasos, no es primo 
             * menos cuando numX = contador, que es cuando se divide entre si mismo, cosa que
             * es una propiedad de los primos
            */

            if(resto == 0){
                System.out.println("---El número no es primo---"); 


            }else  System.out.println("---El número es primo---");
            
        }else System.out.println("---El número es primo---"); //contempla 2 y 3, primos

        return 0;
    }



    public static void main(String[]args){

        double num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número...");
        num1 = sc.nextDouble();


        if(num1 != 0 && num1 > 1){ 
            F_Primos(num1);
    
        }



    }








}
