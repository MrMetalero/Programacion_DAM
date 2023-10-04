package ejercicios_desde_cero_2;
import java.util.Scanner;

public class EjercicioCondicional4 {
    public static void main(String[] args) {
        
        String input = "";
        String input2 = "";
        Scanner sc = new Scanner(System.in);

        do {
            input = sc.nextLine();
            input2 = sc.nextLine();

        } while (input.length() !=2 || input2.length() != 2 );
        


        if (input.equals(input2)) {
            System.out.println("Los carácteres son iguales");
        }else {System.out.println("Los carácteres no son iguales");}
   





    }


}
