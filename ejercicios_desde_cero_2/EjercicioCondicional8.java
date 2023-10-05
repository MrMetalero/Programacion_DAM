package ejercicios_desde_cero_2;
import java.util.Scanner;
import java.math.*;

public class EjercicioCondicional8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce tres números para calcular el mayor");
        
        System.out.println("Primer número");
        int num1 = sc.nextInt();

        System.out.println("Segundo número");
        int num2 = sc.nextInt();

        System.out.println("Tercer número");
        int num3 = sc.nextInt();

        int mayorTemporal;

        if (num1 == num2 && num2 == num3) {
            
            System.out.println("Los números son iguales");

        } else {
            
            mayorTemporal = Math.max(num1, num2);

            if(mayorTemporal == num1){
                System.out.println("El número mayor es: " + Math.max(num1, num3)); 
            }
            else{
                System.out.println("El número mayor es: " + Math.max(num2, num3));

            }

        }
    }



}
