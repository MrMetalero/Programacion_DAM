package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial5 {
 

    public static void main(String[] args) {
        

        int radio;
        int longitud;
        int area;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio");
        radio = sc.nextInt();

        
        System.out.println("La longitud es: "+ (2* 3.14 *radio) );
        System.out.println("El área es : "+ (3.14 * (radio *radio)) );

        
    }

}
