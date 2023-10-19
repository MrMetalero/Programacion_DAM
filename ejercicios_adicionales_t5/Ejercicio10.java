package ejercicios_adicionales_t5;
import java.util.Scanner;
import java.math.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numInput;
        Scanner sc = new Scanner(System.in);

        int numAdivinar = (int)((Math.random()*100 )+1 );

        for(int i = 0; i < 10; i++){

            System.out.println("Introduce un número para adivinar el número secreto");
            numInput = sc.nextInt();


            if (numInput == numAdivinar) {
                System.out.println("Número correcto!!!!!!!!!");
                i += 100;
            } 
            else {
                if (numInput > numAdivinar) {
                    System.out.println("El número es mayor que el secreto");
                } 
                else {
                    System.out.println("El número es menor que el secreto");

                }

            }
            






            System.out.println("Un intento menos");

        }





    }
}
