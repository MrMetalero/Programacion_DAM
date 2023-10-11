package ejercicios_adicionales_t5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroVecesLoop = 0;
        float numeroCache = 0;
        float encendidoNumeros = 0;

        Scanner sc = new Scanner(System.in);

        while(encendidoNumeros != 1){



            System.out.println("Introduce la nota numero " + numeroVecesLoop );
            numeroCache = numeroCache + sc.nextFloat();

            System.out.println("Introduce 1 para parar de introducir datos, introduce otro valor para seguir añadiendo notas");
            encendidoNumeros = sc.nextInt();

            
            numeroVecesLoop +=1;
        }

        System.out.println("La media es: "+ numeroCache/(numeroVecesLoop));

    

    }
}
