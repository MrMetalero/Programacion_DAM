package ejercicios_propuestos_t4;
import java.util.Scanner;

public class Ejercicio9 {
    

    public static void main(String[] args) {
        
        //Imaginemos que la clase se llama joven
        int edad = 25;
        int nivelDeEstudios =2;
        int ingresos = 29000;
        boolean jasp = false;
        Scanner sc = new Scanner(System.in);
       

        if((edad <= 28 && nivelDeEstudios > 3) || (edad <30 && ingresos > 28000)){jasp = true; System.out.println("jasp es " + jasp);
        }else System.out.println("jasp es " + jasp);







    }


}
