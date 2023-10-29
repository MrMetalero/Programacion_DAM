package ejercicios_pag213y214;

public class Ejercicio6 {
    


    public static int funcionPasarArray(int[] arraynum, int contador, int resultado){


        if(contador == 0){
            resultado = arraynum[0];
        }


        if (contador == arraynum.length-1 || contador > 15) {
            return resultado;
        }else{
            resultado = resultado*arraynum[contador+1];
            System.out.println(resultado);
            return funcionPasarArray(arraynum, contador+2, resultado);
        }


        
    }






    public static void main(String[] args) {
        
        
        int arraynum[] = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };

        for (int i = 0; i < 15; i++) {
            arraynum[i] = (int) (Math.random()*9);
            System.out.println(arraynum[i]);

        }

        System.out.println(funcionPasarArray(arraynum, 0, 0)); 



    }



}
