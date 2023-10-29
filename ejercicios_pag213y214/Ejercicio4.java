package ejercicios_pag213y214;
import java.util.Scanner;

public class Ejercicio4 {

    public static int funcionFibonacciIterativo(int inputNumber) {
        int numSucessionAnterior2 = 0;
        int numSucessionAnterior1 = 0;

        int numeroSucesionSiguiente = 0;

        for (int i = 0; i < inputNumber; i++) {

            if (i > 1) {
                numeroSucesionSiguiente = numSucessionAnterior2 + numSucessionAnterior1; // Al inicio 1+0 = 1
                System.out.print(numeroSucesionSiguiente + ", "); // Printeo ese primer valor (1)
                numSucessionAnterior2 = numSucessionAnterior1; // meto el valor que antes era el PRIMER ANTERIOR como el
                                                               // SEGUNDO ANTERIOR
                numSucessionAnterior1 = numeroSucesionSiguiente; // meto el valor que antes era el RESULTADO en el
                                                                 // PRIMER ANTERIOR

            } else {

                if (i == 0) {
                    numeroSucesionSiguiente = numSucessionAnterior1 + numSucessionAnterior2;
                    System.out.print(numeroSucesionSiguiente + ", ");
                    numSucessionAnterior1 += 1;

                } else {
                    numeroSucesionSiguiente = numSucessionAnterior1 + numSucessionAnterior2;
                    System.out.print(numeroSucesionSiguiente + ", ");
                }

            }

        }

        return 0;
    }

    public static int funcionRecursivaFibonacci(int limiteFibonacci, int numeroIzquierda2, int numeroIzquierda1,
            int conteo) {

        // Caso base
        // fibonacci_x(10) → 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // (0) (1)
        // numeroIzquierda2 + numeroIzquierda1 = 1

        int numeroSiguiente;

        if (limiteFibonacci != conteo) {
            numeroSiguiente = numeroIzquierda2 + numeroIzquierda1;
            System.out.print(numeroIzquierda2 + " | ");
            

            numeroIzquierda2 = numeroIzquierda1;
            numeroIzquierda1 = numeroSiguiente;

            funcionRecursivaFibonacci(limiteFibonacci, numeroIzquierda2, numeroIzquierda1, conteo += 1);

        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor para sacar ese número de cifras en Fibonacci");
        int numInputFibonacci = sc.nextInt();

        funcionFibonacciIterativo(numInputFibonacci);
        System.out.println("\n");

        funcionRecursivaFibonacci(numInputFibonacci, 0, 1, 0);

    }
}

