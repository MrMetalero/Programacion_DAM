import java.util.Random;

public class NumeroRandom {
    
    static int[] funcionNumeroRandom(int limiteNumeros){
        int[] numeroArray = new int[limiteNumeros];
       

        Random numRandom = new Random();
        for (int i = 0; i < limiteNumeros; i++) {
            
            numeroArray[i] = numRandom.nextInt(101);

        }



        return numeroArray;
    }







}
