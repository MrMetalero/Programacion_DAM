package REFACTOR.refactor_trabajo_individual;

import java.util.Scanner;

public class Main {
    //Como añadido, este escaner tampoco sería necesario aquí
    //Y lo moveremos a la nueva clase
    public static Scanner sc = new Scanner(System.in);
    // Esta es la variable que no deberíamos tener en main
    static int numeroCompararPrimero;
    static int numeroCompararSegundo;
    static int numeroCache = -1;
    public static void main(String[] args) {
        boolean programaEncendido = true;

        while (programaEncendido) {
            System.out.println(recibirNumero()); 
      
        }
    }

    //Este es el método que recibe el número
    // y que compara en búsqueda del mayor para retornarlo
    public static int recibirNumero(){
        // Si es la primera vez que se ejecuta el programa
        // le pasaremos 2 numeros para poder compararlos
        if (numeroCache == -1) {
            System.out.println("Introduce el primer número para sacar el mayor");
            numeroCompararPrimero = sc.nextInt();
            System.out.println("Introduce el segundo número para sacar el mayor");
            numeroCompararSegundo = sc.nextInt();

            // lógica del retorno de números la primera vez
            // Se guarda siempre el numero mayor y lo devuelve
            if (numeroCompararPrimero > numeroCompararSegundo) {
                numeroCache = numeroCompararPrimero;
                return numeroCompararPrimero;
            }else{
                numeroCache = numeroCompararSegundo;
                return numeroCompararSegundo;
            }
        }else{
            System.out.println("Introduce el segundo número para sacar el mayor");
            numeroCompararSegundo = sc.nextInt();
            // lógica del retorno de números después de la 1a vez
            // Se guarda siempre el numero mayor y lo devuelve
            if (numeroCompararSegundo > numeroCache) {
                numeroCache = numeroCompararSegundo;
                return numeroCompararSegundo;
            }else{
                return numeroCache;
            }
        }
    }
}
