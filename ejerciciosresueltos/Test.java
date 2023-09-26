package ejerciciosresueltos;
import java.math.*;
import java.util.Scanner;

public class Test {
    
    public static double funcionRandomizar(){

        double randomNumber = Math.random() * 25;

      return randomNumber;  
    }


    public static char funcionLetras(double letraRandom){

        letraRandom = Math.round(letraRandom);

        // probablemente hay formas más eficientes, pero quería intentar
        // hacerlo sin mirar demasiado la respuesta, así que se me ocurrió
        // esto

        if(letraRandom == 0){ return 'a';}
        else if(letraRandom == 1){ return 'b';}
        else if(letraRandom == 2){return 'c';}
        else if(letraRandom == 3){return 'd';}
        else if(letraRandom == 4){return 'e';}
        else if(letraRandom == 5){return 'f';}
        else if(letraRandom == 6){return 'g';}
        else if(letraRandom == 7){return 'h';}
        else if(letraRandom == 8){return 'i';}
        else if(letraRandom == 9){return 'j';}
        else if(letraRandom == 10){return 'k';}
        else if(letraRandom == 11){return 'l';}
        else if(letraRandom == 12){return 'm';}
        else if(letraRandom == 13){return 'n';}
        else if(letraRandom == 14){return 'o';}
        else if(letraRandom == 15){return 'p';}
        else if(letraRandom == 16){return 'q';}
        else if(letraRandom == 17){return 'r';}
        else if(letraRandom == 18){return 's';}
        else if(letraRandom == 19){return 't';}
        else if(letraRandom == 20){return 'u';}
        else if(letraRandom == 21){return 'v';}
        else if(letraRandom == 22){return 'w';}
        else if(letraRandom == 23){return 'x';}
        else if(letraRandom == 24){return 'y';}
        else if(letraRandom == 25){return 'z';}
        //En caso de que algo vaya mal que muestre este símbolo
        else return '#';
        
    }


    public static void main(String[] args){

    Scanner sc  = new Scanner(System.in);

    int randomIniciado = 0;
    String textoFinal = "";   

    System.out.println("Introduce 1 para comenzar la generación de letras");

    randomIniciado = sc.nextInt();

        while (randomIniciado == 1){

            
            System.out.println(funcionRandomizar());

            System.out.println(textoFinal += funcionLetras(funcionRandomizar()));

            System.out.println("Introduce 1 para continuar generando, pulsa"
                             + " introduce cualquier otro número para parar de generar letras"
            );
            randomIniciado = sc.nextInt();
        }





    }



}
