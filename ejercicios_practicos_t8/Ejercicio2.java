package ejercicios_practicos_t8;

import java.util.Scanner;

public class Ejercicio2 {

    public static int funcionNumRandom() { // Funcion Random-------------------------------------------
        int numInput;
        numInput = (int) ((Math.random() * 71) + 10);

        return numInput;
    }

    public static int funcionNumMax(int[] arrayNums) { // Funcion Maximo-----------------------------------

        int controlMayor = arrayNums[0];

        for (int i = 0; i < arrayNums.length; i++) { // Comprueba el mayor entre i y el primero del array y se queda
            if (controlMayor < arrayNums[i]) { // el mayor
                controlMayor = arrayNums[i];

            }

        }
        return controlMayor;
    }

    public static int funcionNumMin(int[] arrayNums) { // Funcion Minimo----------------------------------

        int controlMenor = arrayNums[0];

        for (int i = 0; i < arrayNums.length; i++) { // Comprueba el mayor entre i y el primero del array y se queda
            if (controlMenor > arrayNums[i]) { // el menor
                controlMenor = arrayNums[i];
            }

        }
        return controlMenor;
    }

    public static int funcionNumMedia(int[] arrayNums) { // Funcion Media-------------------------------------

        int controlMedia = 0;

        for (int i = 0; i < arrayNums.length; i++) { // Suma a 0 el valor de todos los indices del array por los que
            controlMedia = controlMedia + arrayNums[i]; // pasa el for y luego los divide entre el tamaño del array -1
        }
        controlMedia = controlMedia / (arrayNums.length); // División para sacar la media
        return controlMedia;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arrayNums = new int[100];

        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = funcionNumRandom();
            System.out.println(arrayNums[i]);
        }

        System.out.println("Máximo");
        System.out.println(funcionNumMax(arrayNums));

        System.out.println("Mínimo");
        System.out.println(funcionNumMin(arrayNums));

        System.out.println("Media");
        System.out.println(funcionNumMedia(arrayNums));

    }
}
