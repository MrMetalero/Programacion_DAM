package ejercicios_practicos_t8;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int[][] matrizNumeros = new int[4][4];
        Scanner sc = new Scanner(System.in);
        int sumaTotal = 0;
        int mediaTotal = 0;
        int sumaDiagonal = 0;
        int sumaDiagonalInversa = 0;

        int controlFila = 0;
        int sumaFila = 0;
        int controlColumna = 0;
        int sumaColumna = 0;


        //Asignar números a la matriz

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Introduce un valor para la posición fila: " + i + " columna " + j );
                matrizNumeros[i][j] = sc.nextInt();
                sumaTotal += matrizNumeros[i][j];
            }


        }

        //sumar una fila concreta

        System.out.println("Introduce la fila a sumar");
        controlFila = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            sumaFila += matrizNumeros[controlFila][i];
        }


        //sumar una columna concreta

        System.out.println("Introduce la columna a sumar");
        controlColumna = sc.nextInt();
        
        for (int i = 0; i < 3; i++) {
            sumaColumna += matrizNumeros[i][controlColumna];
        }


        //calcular la media
        mediaTotal = sumaTotal/16;



        //Suma de la diagonal y la diagonal inversa
        for (int i = 0; i < 3; i++) {
            sumaDiagonal += matrizNumeros[i][i];

            for (int j = 3; j > 0; j--) {
                sumaDiagonalInversa += matrizNumeros[i][j];

            }

        }


        //Imprimir por pantalla todo
        
        System.out.println("suma Total: "+ sumaTotal);
        System.out.println("Media: "+ mediaTotal);
        System.out.println("suma Diagonal: "+ sumaDiagonal);
        System.out.println("suma Diagonal Inversa: "+ sumaDiagonalInversa);
        System.out.println("suma Columna: "+ sumaColumna);
        System.out.println("suma Fila: "+ sumaFila);
        

        






    }


}
