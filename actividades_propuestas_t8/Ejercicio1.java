package actividades_propuestas_t8;

public class Ejercicio1 {
    
    public static int funcionNumRandom(){ //Funcion Random-------------------------------------------
        int numInput;
        numInput = (int) (Math.random()*9999999);

            

        return numInput;
    }


    public static void main(String[] args) {
        
  
    int[] arrayNums100 = new int[100];

    for (int i = 0; i < arrayNums100.length; i++) {
        arrayNums100[i] = funcionNumRandom();
        System.out.println(i + "] " + arrayNums100[i]);
    }   
    
        
    

    }



}
