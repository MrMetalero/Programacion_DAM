package supuestopractico1;

public class SupuestoPrimero {
 
public static final int CONSTANTE_AMPLIACION_1 = 1;
public static final String CONSTANTE_AMPLIACION_2 = "Hola soy una cadena";

    public static void main(String[]args){

        final int CONS_SUPUESTO_1 = 1008;

        final String CONS_SUPUESTO_2 = "Saludos";


        Integer variableWrapper1 = CONS_SUPUESTO_1;

        Integer variableWrapper2 = variableWrapper1;

        System.out.println("Supuestos Prácticos del 1 al 5: \n"+variableWrapper1 + " " + variableWrapper2 + " " + CONS_SUPUESTO_2);


        // Actividad de ampliación 1

        System.out.println("Actividad de ampliación 1: "+ CONSTANTE_AMPLIACION_1 + " " + CONSTANTE_AMPLIACION_2);



        /* Actividad de ampliación 2  | El resultado es d (36), el código 
        Lo que hace << es mover el valor del número de la izquierda hacia la izquierda
        un número de veces equivalente al número de la derecha

        9 = 001001     si lo muevo dos valores dos espacios hacia la izquierda...
            100100 = 36
            ------
                
        */

        int b = 9 <<2;
        System.out.println("Actividad ampliación 2: "+ b);


        /* Actividad ampliación 3 | d Todas son incorrectas porque hacer un AND
        en binario nos da el siguiente resultado (0):

        int a = 16;
        int b = 8;

        00010000
        00001000
        ==========
        00000000



        */
        b = 16 & 8;
        System.out.println("Actividad ampliación 3: "+ b);


        // Actividad ampliación 4  | Me da 13, el valor de b debería ser 0
        // por el ejercico anterior, aunque su valor se aumenta tras leer esa parte 
        // del código, por lo que al momento de hacer el print de debajo b = 0
        // y por tanto a = 0 + 13 = 13

        int a = b++ + 13;
        System.out.println("Actividad ampliación 4: "+ a);


        // Actividad ampliación 5

        int calcula_fecha;
        int $hora;
        //int 1Loveyou;       Los nombres de variables no pueden comenzar por números
        int Calcula_fecha;
        //int calcula Fecha;  Syntaxis no válida porque están separadas las palabras
        int calculaFecha;
        int IVA;
        //int iva%;           El símbolo % está reservado y no se puede usar en nombres de variables




    }



}

