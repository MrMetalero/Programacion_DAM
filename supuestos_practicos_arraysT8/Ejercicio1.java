package supuestos_practicos_arraysT8;
import java.math.*;
import java.util.Scanner;

public class Ejercicio1 {
    





    public static int funcionNumRandom(){ //Funcion Random-------------------------------------------
        int numInput;
        numInput = (int) (Math.random()*9999999);



        return numInput;
    }


    public static int funcionNumMax(int[] arrayNums){ //Funcion Maximo-----------------------------------
      
        int controlMayor = arrayNums[0];

        for (int i = 0; i < arrayNums.length; i++) { // Comprueba el mayor entre i y el primero del array y se queda 
            if(controlMayor < arrayNums[i]){           // el mayor
                controlMayor = arrayNums[i];
                
            }
    
        }
        return controlMayor;
    }


    public static int funcionNumMin(int[] arrayNums){ // Funcion Minimo----------------------------------
      
        int controlMenor = arrayNums[0];

        for (int i = 0; i < arrayNums.length; i++) { // Comprueba el mayor entre i y el primero del array y se queda 
            if(controlMenor > arrayNums[i]){           // el menor
                controlMenor = arrayNums[i];
            }

        }
        return controlMenor;
    }


    public static int funcionNumSuma(int[] arrayNums){ // Funcion Suma-------------------------------------
    
        int controlSuma = 0;

        for (int i = 0; i < arrayNums.length; i++) { // Suma a 0 el valor de todos los indices del array por los que
            controlSuma = controlSuma + arrayNums[i]; // pasa el for
        }
        return controlSuma;
    }



    public static int funcionNumMedia(int[] arrayNums){ // Funcion Media-------------------------------------
      
        int controlMedia = 0;

        for (int i = 0; i < arrayNums.length; i++) { // Suma a 0 el valor de todos los indices del array por los que
            controlMedia = controlMedia + arrayNums[i]; // pasa el for y luego los divide entre el tamaño del array -1
        }
        controlMedia = controlMedia/(arrayNums.length); //División para sacar la media
        return controlMedia;
    }

    public static String funcionNumCambio(int[] arrayNums, int indiceCambiarInput){ // Funcion Cambio de Valor-------------------------------------
        Scanner scCambio = new Scanner(System.in);
        String resultado = "El número del índice ["+ indiceCambiarInput +"] cambiado a: ";
        System.out.println("Introduce el número por el que quieres cambiarlo");
        arrayNums[indiceCambiarInput] = scCambio.nextInt();
        scCambio.close();

        resultado += arrayNums[indiceCambiarInput];

        return resultado;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNums = new int[100];
        int panelPrincipal;



        //Creación del array para contener los números aleatorios
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = funcionNumRandom();
            System.out.println(arrayNums[i]);
        }

        


        //Menú principal
        do {

            System.out.println("Introduce 1 para saber el mayor de los números");
            System.out.println("Introduce 2 para saber el menor de los números");
            System.out.println("Introduce 3 para saber la suma de los números");
            System.out.println("Introduce 4 para saber la media de los números");
            System.out.println("Introduce 5 para cambiar el valor de uno de los números randoms");
            panelPrincipal = sc.nextInt();

        } while (panelPrincipal > 5 || panelPrincipal < 1);


        if(panelPrincipal == 1){
            System.out.println(funcionNumMax(arrayNums));
            
        }
        else if (panelPrincipal == 2){
            System.out.println(funcionNumMin(arrayNums));
            
        }
        else if(panelPrincipal == 3){
            System.out.println(funcionNumSuma(arrayNums));
        }
        else if(panelPrincipal == 4){
            System.out.println(funcionNumMedia(arrayNums));
        }
        else if(panelPrincipal == 5){
            System.out.println("Introduce el índice del número que quieres cambiar del siguiente listado:");
            for(int x = 0; x < arrayNums.length; x++){
                System.out.println("numero["+ x +"] " + arrayNums[x]);

            }

            System.out.println("introduce el índice del número a cambiar ahora");
            int indiceCambiarInput = sc.nextInt();

            System.out.println(funcionNumCambio(arrayNums , indiceCambiarInput));
            
        }
        sc.close();
    





    }



}
