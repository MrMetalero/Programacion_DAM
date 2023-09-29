package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial9 {
    public static void main(String[] args) {
            
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo");
        base = sc.nextDouble();
        System.out.println("Introduce la altura del triángulo");
        altura = sc.nextDouble();

        System.out.println("El área del triángulo es: " + ((base * altura)/2));


    }





}
