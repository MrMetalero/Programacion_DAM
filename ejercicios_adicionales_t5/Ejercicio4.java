package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        String password = "pass";
        String inputComparador = "";
        Scanner sc = new Scanner(System.in);
        int loggedIn = 0;



        System.out.println("Introduce la contraseña para entrar");
        for (int i = 0; i < 3; i++) {

            if(loggedIn == 0){

                inputComparador = args[0];

                    
                if (inputComparador.equals(password)) {
                    System.out.println("Bienvenido");
                    loggedIn = 1;

                } else {
                    System.out.println("Por favor inténtalo de nuevo " + (i+1));
                }

            }else{






            }



        }



    }
}