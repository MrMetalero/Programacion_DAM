package ejerciciosresueltos3;
import java.util.Scanner;

public class Ejercicio3 {
    






    public static void main(){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int variableTraspaso;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Variable 'a' introducida inicial:"+ a);
        System.out.println("Variable 'b' introducida inicial:"+ a);
        variableTraspaso = a;
        a = b;
        b = variableTraspaso;

        System.out.println("La variable a = "+ a + "la variable b = " + b);
        


    }





}
