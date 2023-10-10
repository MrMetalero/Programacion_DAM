package ejercicios_propuestos_t5;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int valor = rnd.nextInt();

        while (valor < 100 || valor > 200) {
            valor = rnd.nextInt();
        } 

        if (valor%2 == 0) {
            System.out.println("El valor " + valor + " es par");
        } else {
            System.out.println("El valor " + valor + " no es par");
        }
        
        






    }
}
