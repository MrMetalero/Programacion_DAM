package ejercicios_desde_cero_2;
import java.util.Scanner;

public class EjercicioCondicional9 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M, S;
        do {
            System.out.println("Introduce números para la hora en el formato correcto HH/MM/SS");
            System.out.println("introduce el Primer número");
            H = sc.nextInt();
            System.out.println("introduce el Segundo número");
            M = sc.nextInt();
            System.out.println("introduce el Tercer número");
            S = sc.nextInt();




            
        } while (
            //Comprobantes para minutos y segundos
            H > 24 || H <0      ||M > 59 || M < 0      || S > 59 || S < 0 

        );

        System.out.println("La hora introducida es : " + H +":"+ M+":"+S);





    }

}
