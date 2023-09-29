package boletin_desde_cero;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        double radio;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        double volumen;
        System.out.println("Introduce el radio para calcular el volumen de la esfera...");
        radio = sc.nextDouble();


        volumen = 4/3 * pi *(radio * radio * radio);
        System.out.println("El volumen de una esfera con  radio "+ radio + " es igual a " + volumen );





        
    }


}
