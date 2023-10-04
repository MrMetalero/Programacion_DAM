package ejercicios_desde_cero_2;

import java.util.Scanner;

public class EjercicioCondicional5 {
     public static void main(String[] args) {
        
        String input = "";
        String input2 = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce dos carácteres, LETRAS en mayúscula o minúscula");
            System.out.println("Introduce el primer caracter");
            input = sc.nextLine();
            System.out.println("Introduce el segundo caracter");
            input2 = sc.nextLine();

        } while (input.length() !=1 || input2.length() != 1 || !input.matches("[a-zA-Z]") || !input2.matches("[a-zA-Z]") ) ;
        


        if (input.matches("[a-z]") && input2.matches("[a-z]")) {
            System.out.println("Los carácteres son ambos minúsculas");
        }else {System.out.println("Uno o más de los caracteres no son minúsculas");}
   





    }


}
