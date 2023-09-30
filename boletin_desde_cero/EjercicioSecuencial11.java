package boletin_desde_cero;
import java.util.Scanner;


public class EjercicioSecuencial11 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumero;

        System.out.println("Introduce un número: ");

        inputNumero = sc.nextInt();


        if(inputNumero >= 10000 && inputNumero < 100000){
            System.out.println("Número válido");

            System.out.println("Primera cifra "+ (inputNumero/10000));
            System.out.println("Segunda cifra "+ (inputNumero/1000)%10);
            System.out.println("Tercera cifra "+ (inputNumero/100)%10);
            System.out.println("Cuarta cifra "+ (inputNumero/10)%10);
            System.out.println("Quinta cifra "+ (inputNumero%10));




        }else System.out.println("Error!! Numero mayor o menor de 5 cifras");





    }







}