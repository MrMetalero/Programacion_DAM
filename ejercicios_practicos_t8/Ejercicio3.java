package ejercicios_practicos_t8;

import java.util.Arrays;

public class Ejercicio3 {

    public static int funcionNumRandom() {
        int numOutput = 0;

        numOutput = (int) ((Math.random() * 91) + 1);

        return numOutput;
    }

    public static void main(String[] args) {

        int[][] matrizNums = new int[5][8];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                matrizNums[i][j] = funcionNumRandom();
            }


        }

        System.out.println(Arrays.deepToString(matrizNums));






        
    }

}
