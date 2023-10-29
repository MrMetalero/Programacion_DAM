package ejercicios_pag209;

import java.util.Scanner;

public class Ejercicio11_2 {
    
  
    public static int FuncionTransformarBinario(int numeroInput){

         
        if (numeroInput == 0) {
            return 0;

        }else{
            System.out.println(numeroInput % 2);
            return FuncionTransformarBinario(numeroInput/2);

        }

  
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numeroInput = sc.nextInt();
        

        System.out.println("Leer los números de arribaa abajo porfa :) (Lo arregrlaré si me da tiempo)");
        System.out.println("Binario");
        FuncionTransformarBinario(numeroInput);

        

    }
}
