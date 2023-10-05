package ejercicios_desde_cero_2;
import java.util.Scanner;

public class EjercicioCondicional7 {
        
    public static void main(String[] args) {
        String dividendo = "";
        String divisor = "";
        Scanner sc = new Scanner(System.in);

        //Comprobar que sean números y que el divisor no sea 0
        do {
            System.out.println("Introduce dos números primero un dividendo y luego un divisor");

            System.out.println("Introduce dividendo: ");
            dividendo = sc.nextLine();

            System.out.println("Introduce divisor: ");
            divisor = sc.nextLine();

            
        } while (!dividendo.matches("^[0-9]*$") || !divisor.matches("^[1-9]*$"));


        System.out.println("La divisíon es igual a = " + Integer.valueOf(dividendo)/Integer.valueOf(divisor) + " Con resto: " + Integer.valueOf(dividendo)%Integer.valueOf(divisor));




    }

}
