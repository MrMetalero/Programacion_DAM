package ejercicios_practicos_t8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio5 {

    public static int solicitarSize() {
        Scanner scSize = new Scanner(System.in);

        System.out.println("Introduce la longitud del Vector a crear");
        int longitudVector = scSize.nextInt();
        scSize.close();

        return longitudVector;
    }

    public static int[] asignarDatos(int[] arrayInput) {

        // Random-------------------------------------------

        for (int i = 0; i < arrayInput.length - 1; i++) {
            arrayInput[i] = (int) (Math.random() * 9999999);

        }

        return arrayInput;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lon = solicitarSize();

        int[] v = new int[lon];
        v = asignarDatos(v);

    }

}
