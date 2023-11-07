package actividades_propuestas_t8;

public class Ejercicio2 {
    public static int funcionNumRandom(){ //Funcion Random-------------------------------------------
        int numInput;
        numInput = (int) (Math.random()*9999999);

            

        return numInput;
    }


    public static void main(String[] args) {
        
  
    int[] arrayNums100 = new int[100];
    int totalSuma = 0;

    for (int i = 0; i < arrayNums100.length; i++) {
        arrayNums100[i] = funcionNumRandom();
        totalSuma += arrayNums100[i];
        System.out.println(i + "] " + arrayNums100[i]);

        
    }   
    System.out.println("El total es: " + totalSuma);
        
    

    }



}
