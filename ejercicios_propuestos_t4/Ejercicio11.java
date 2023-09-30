package ejercicios_propuestos_t4;
import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio11 {


    public static int funcionEuros(int inputNumero){
        int n500, n200, n100, n50, n20, n10, n5, n2, n1 = 0;



 

        n500 = inputNumero /500;
        inputNumero = inputNumero - (500 * n500);

        n200 = inputNumero /200;
        inputNumero = inputNumero - (200 * n200);

        n100 = inputNumero / 100;
        inputNumero = inputNumero - (100 * n100);

        n50 = inputNumero / 50;
        inputNumero = inputNumero - (50 * n50);

        n20 = inputNumero /20;
        inputNumero = inputNumero - (20 * n20);

        n10 = inputNumero /10;
        inputNumero = inputNumero - (10 * n10);

        n5 = inputNumero /5;
        inputNumero = inputNumero - (5 * n5);

        System.out.println("El número es ahora: "+ inputNumero);
        n2 = inputNumero /2;
        inputNumero = inputNumero - (2* n2);

        System.out.println("El número es ahora: "+ inputNumero);
        if(inputNumero > 0){
            n1 = inputNumero /1;
            inputNumero = inputNumero - (1* n1);
        }
        
        System.out.println( 

        "500 euros: "+n500 + 
        "\n  200 euros: "+ n200 + 
        "\n  100 euros: "+ n100 + 
        "\n  50 euros: "+ n50 + 
        "\n  20 euros: "+ n20 +
        "\n  10 euros: "+ n10 +
        "\n  5 euros: "+ n5 +
        "\n  2 euros: "+ n2 +
        "\n  1 euros: "+ n1 


        );

        return 0;
    }

    

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidadIntroducida  = sc.nextInt();

        /* 
         *  moneda 0,10 euros
         *  moneda 0,50 euros
         *  moneda 1 euro
         *  moneda 2 euros
         *  billete 5 euros
         *  billete 10 euros
         *  billete 20 euros
         *  billete 50 euros
         *  billete de 100 euros
         *  billete de 200 euros
         *  billete de 500 euros
        */

        funcionEuros(cantidadIntroducida);
        

        


        





    }




}
