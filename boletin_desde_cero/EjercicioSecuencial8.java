package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial8 {
    
    public static void main(String[] args) {
        
        double radio;
        double pi = 3.1416;
        Scanner sc = new Scanner(System.in);
        double volumen;
        System.out.println("Introduce el radio para calcular el volumen de la esfera...");
        radio = sc.nextDouble();


        volumen = 1.33 * pi *(radio * radio * radio);
        System.out.println("El volumen de una esfera con  radio "+ radio + " es igual a " + volumen );
        System.out.println(radio * radio* radio);




        
    }


}
