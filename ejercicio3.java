import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL


public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 10;
        int numeroint1;

          

        for (int i = 1;i <= 10;i++) {
            System.out.println("Introduce un número: ");
            numeroint1 = sc.nextInt();
            suma = numeroint1 + suma;
        }

        System.out.println(suma);
        System.out.println("El programa funciona");
    }

}