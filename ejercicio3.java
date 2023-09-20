import java.util.*;


public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumar = 0;
        int num1;

          

        for (int i = 1;i <= 10;i++) {
            System.out.println("Introduce un número a sumar: ");
            num1 = sc.nextInt();
            sumar = num1 + sumar;
        }


        System.out.println("El resultado de la suma de los números introducidos es: "+ sumar);
      
    }

}