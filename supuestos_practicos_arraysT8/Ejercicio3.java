package supuestos_practicos_arraysT8;

import java.util.Scanner;

public class Ejercicio3 {

    public static String funcionSepararPalabras() {

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean encendidoPrograma = true;

        System.out.println("Introduce un texto para realizar operaciones");
        String textoInput = sc.nextLine();
        int controlMenu = 0;

        while (encendidoPrograma) {

            do {

                System.out.println("Elige una opción:");

                System.out.println(" Introduce (1) para devolver el texto");

                System.out.println(" Introduce (2) para pedir palabra");

                System.out.println(" Introduce (3) para indicar número de veces que aparece una palabra en el texto");

                System.out.println("Introduce (0) para terminar el programa");

                controlMenu = sc.nextInt();

            } while (controlMenu < 0 || controlMenu > 3);

        }

    }

}
