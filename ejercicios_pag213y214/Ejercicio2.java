package ejercicios_pag213y214;

public class Ejercicio2 {
    

    public static int funcionAumentar(int numInput){
        System.out.println(numInput);

        
        return funcionAumentar(numInput+1);
    
    }

    
    public static void main(String[] args) {
        int variableX = 0;

        try{
           funcionAumentar(variableX);



        }catch(StackOverflowError errorDesbordamiento){
            System.out.println("error de desbordamiento");


        }
       
        
    }

}
