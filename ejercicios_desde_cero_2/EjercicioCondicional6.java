package ejercicios_desde_cero_2;

import java.util.Scanner;

public class EjercicioCondicional6 {
    
     public static void main(String[] args) {
        
        String input = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un caracter si no es un número se volverá a solicitar");
            input = sc.nextLine();

           
        } while (input.length() !=1 || !input.matches("[0-9]") ) ;
        System.out.println("El valor introducido es un número entre 0-9");





    }



}
