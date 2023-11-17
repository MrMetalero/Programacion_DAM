package ejercicios_practicos_t8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);

    public static int solicitarSize() {

        System.out.println("Introduce la longitud del Vector a crear");
        int longitudVector = sc.nextInt();
        sc.nextLine();

        return longitudVector;
    }

    public static int[] asignarDatos(int[] arrayInput) {

        // Random-------------------------------------------

        for (int i = 0; i < arrayInput.length - 1; i++) {
            arrayInput[i] = (int) (Math.random() * 9999999);

        }

        return arrayInput;
    }

    public static int maximo(int[] arrayInput) {
        int maximo = arrayInput[0];

        for (int i = 0; i < arrayInput.length - 1; i++) {
            if (arrayInput[i] >= maximo) {
                maximo = arrayInput[i];
            }

        }

        return maximo;
    }

    public static int minimo(int[] arrayInput) {

        int minimo = arrayInput[0];

        for (int i = 0; i < arrayInput.length - 1; i++) {
            if (arrayInput[i] <= minimo) {
                minimo = arrayInput[i];
            }

        }

        return minimo;
    }

    public static int[] insertar(int[] arrayInput, int indiceCambiar, int valorCambiar) {
        System.out.println("Introduce el nuevo valor de [" + indiceCambiar + "]");
        arrayInput[indiceCambiar] = valorCambiar;

        return arrayInput;
    }

    public static void main(String[] args) {

        int lon = solicitarSize();

        System.out.println("Creando el array...");
        int[] v = new int[lon];
        System.out.println("Array creado");

        System.out.println("Asignando numeros random...");
        v = asignarDatos(v);
        System.out.println("Array: " + Arrays.toString(v));

        System.out.println("Guardando cambios");

        System.out.println("Introduce el indice a cambiar: ");
        int indiceCambiar = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el valor a cambiar: ");
        int valorCambiar = sc.nextInt();
        sc.nextLine();

        v = insertar(v, indiceCambiar, valorCambiar);

        System.out.println("Array: " + Arrays.toString(v));
        System.out.println("Maximo: " + maximo(v));
        System.out.println("Minimo " + minimo(v));
        System.out.println("Array: " + Arrays.toString(v));
        sc.close();

    }

}
