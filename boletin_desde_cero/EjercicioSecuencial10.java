package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial10 {
 

    public static int funcionSeparar(int cifra){

        for(int i = 0; i == cifra; i++ ){

            cifra = cifra /10;
            System.out.println("La cifra "+ i +"es: " + cifra);
            return  cifra;

        }


       
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroRecibido = sc.nextInt();

        System.out.println(funcionSeparar(numeroRecibido));



    }





}
