package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer numHoras = 0;
        Integer numMinutos = 0;
        Integer numSegundos = 0;
        int cronoEncendido;
        String formatoHora = "";



        do {
            
            System.out.println("Pulsa 1 para iniciar el cronómetro y 0 para salir");
            cronoEncendido = sc.nextInt();

        } while (cronoEncendido != 1 && cronoEncendido != 0);

    
        if (cronoEncendido == 1) {


            do {

                numSegundos = 0;

                for (int i = 0; i < 60; i++) {
                    numSegundos += 1;
                    
                }
                
             
                System.out.println(numHoras+":"+ numMinutos +":"+ numSegundos);
        
            } while (cronoEncendido == 1);

            



        } 



    }
}



