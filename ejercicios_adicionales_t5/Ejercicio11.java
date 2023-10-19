package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        int numInferior;
        int numSuperior;
        int numInput;
        int numSuma = 0;
        int numDentroIntervalo = 0;
        int numFueraIntervalo = 0;
        int numJustoEnIntervalo = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el número del límite inferior del rango");
            numInferior = sc.nextInt();

            System.out.println("Introduce el número del límite superior del rango");
            numSuperior = sc.nextInt();

        } while (numInferior > numSuperior);


        do {

            System.out.println("Introduce un número");
            numInput = sc.nextInt();

            if(numInput >= numInferior && numInput <= numSuperior){
                
                numDentroIntervalo += 1;
                numSuma = numSuma + numInput;
            }
            else{ 
                if (numInput != 0) {
                    numFueraIntervalo +=1;
                } 
            }


            if (numInput == numInferior || numInferior == numSuperior) {
                numJustoEnIntervalo += 1;
            
            }
                

        } while (numInput != 0);


        System.out.println("La suma de los números de dentro del intervalo es: " + numSuma);
        System.out.println("Cantidad de números dentro del intervalo: " + numDentroIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numFueraIntervalo);
        System.out.println("Cantidad de números Justo en el límite del intervalo: " + numJustoEnIntervalo);



    }
}
