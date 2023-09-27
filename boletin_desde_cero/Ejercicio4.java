package boletin_desde_cero;

public class Ejercicio4 {
    

    public static void main(String[]args){

        int A = 4, B = 5, C = 6, D = 7;

        int tempA, tempB, tempC, tempD;
        // B ---> C
        // C ---> A
        // A ---> D
        // D ---> B

        tempA = A;
        tempB = B;
        tempC = C;
        tempD = D;

        B = tempC;
        C = tempA;
        A = tempD;
        D = tempB;

    }







}
