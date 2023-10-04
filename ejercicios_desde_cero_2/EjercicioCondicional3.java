package ejercicios_desde_cero_2;
import java.util.Scanner;



public class EjercicioCondicional3 {
    

    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);



        do{
            System.out.println("Introduce una letra mayúscula o minúscula");
            input = sc.nextLine();
        }
        while(
        input.length() <= 0 || input.length()> 1 || !input.matches("[a-zA-Z]"));
        

        if (input.matches("[a-z]") ) {
            System.out.println("La letra es minúscula");
        } 
        else {System.out.println("La letra es mayúscula");}






    }


}
