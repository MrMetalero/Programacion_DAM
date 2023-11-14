package ejercicios_practicos_t8;

import java.util.Arrays;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int totalSuma = 0;
        int mediaDeSuma = 0;
        int arrayNums[] = new int[100];


        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = i+1;
            totalSuma += arrayNums[i];
            mediaDeSuma = totalSuma/100;
        }
        System.out.println(Arrays.toString(arrayNums));
        System.out.println("Total de suma: " +totalSuma);
        System.out.println("Media de la suma: " +mediaDeSuma);



    }


}
