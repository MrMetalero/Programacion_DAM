package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial12 {
    

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        int inputNumero;

        System.out.println("Introduce un número: ");
        inputNumero = sc.nextInt();

        //comprobamos que el número tenga 5 cifras utilizando l mínimo y
        //el máximo número posible de 5 cifras como límites
        if(inputNumero >= 10000 && inputNumero < 100000){
            System.out.println("Número válido");

            //divido dependiendo de la cantidad de cifras que quiero quitar desde
            //la derecha para llegar a la cifra que quiero mostrar y si esta cantidad se
            //encuentra entre dos cifras, divido hasta la cantidad anterior y saco el resto
            //de dividir el número con la cantidad en la posición de las unidades entre 10
            //uso módulo para obtener ese resto, que como dividimos entre 10 será el valor
            //entero de el número que queremos obtener


            System.out.println("Quinta cifra "+ (inputNumero%10));
            System.out.println("Cuarta cifra "+ (inputNumero/10)%10);
            System.out.println("Tercera cifra "+ (inputNumero/100)%10);
            System.out.println("Segunda cifra "+ (inputNumero/1000)%10);
            System.out.println("Primera cifra "+ (inputNumero/10000));
            
            
            
            




        }else System.out.println("Error!! Numero mayor o menor de 5 cifras");









}




}
