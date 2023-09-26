package ejerciciosresueltos;
import java.util.Scanner;

public class Ejercicio3 {
    






    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int variableTraspaso;


        System.out.println("Introduce el valor para 'a' ");
        a = sc.nextInt();

        System.out.println("Introduce el valor para 'b' ");
        b = sc.nextInt();

        
        variableTraspaso = a;
        a = b;
        b = variableTraspaso;

        System.out.println("La variable a = "+ a + "\n La variable b = " + b);
        


    }





}
