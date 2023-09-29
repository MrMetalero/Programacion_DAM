package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial6 {
        
    public static void main(String[] args) {
    int velocidadMs;
    int velocidadKms;        
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    velocidadKms = sc.nextInt();

    velocidadMs = velocidadKms * 1000;

    System.out.println("El valor introducido en m/s = " + velocidadMs + "m/s");




    }


}
