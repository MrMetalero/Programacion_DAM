package boletin_desde_cero;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class EjercicioSecuencial10 {
 

    static int funcionSeparar(int numeroRecibido){
        

        int numLongitudControl = 1;
        int numLongitud = 0;

        //calcular la longitud del número multiplicando 1 por 10 
        //hasta que sea mayor que el número dado
        while(numLongitudControl < numeroRecibido){
            numLongitudControl = numLongitudControl * 10;
            ++numLongitud;
    
        }


        //DECLARACIÓN DEL ARRAY Y ASIGNACIÓN DE numLongitud como longitud del array

        int [] arrayValores = new int[numLongitud];
        




        //Para testing del array y su longitud
        int longitudArrayMostrar = arrayValores.length;
        //Testing-------  System.out.println("Longitud del array " + longitudArrayMostrar);
        System.out.println("EL NÚMERO ESTÁ COMPUESTO DE LAS SIGUIENTES CIFRAS");

        // LOOP Para pasar entre los diferentes dígitos. Mientras el número a 
        // dividir entre 10 no sea 0 ,lo sigue dividiendo (como es un int, se truncan los decimales)
        do{
        
            //El resto de la división entre el número y 10 lo guardamos y queremos
            //meterlo en el array en la posición 0 al empezar e ir
            //metiéndiolos al seguir el loop en posiciones del array diferentes
            int cifraguardada = numeroRecibido%10;
           
            //Testing------ System.out.println("Cifra guardada actual "+ cifraguardada);

    
                arrayValores[longitudArrayMostrar-1] = cifraguardada;
            

                //Testing------ System.out.println("Valor de arrayValores[i]: "+ arrayValores[longitudArrayMostrar-1]);

                // Vamos reduciendo la variable que hemos usado para introducir 
                // valores en el índice del array justo arriba en 1 para que vaya
                // cruzando la longitud del array en orden decreciente y podamos mostrar
                // el array en orden creciente luego.
                longitudArrayMostrar = longitudArrayMostrar -1 ;

          
          

            //Vamos moviéndonos entre las cifras en este loop dividiendo
            numeroRecibido = numeroRecibido/10;
          
        }while(numeroRecibido != 0);








        // Recibir los valores del array
       for(int i = 0 ; i <= numLongitud-1 ; i++){
        System.out.print("   "+arrayValores[i]);

       
       }
        

        return 0;
       
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cifra");
        int numeroRecibido = sc.nextInt();

        funcionSeparar(numeroRecibido);



    }





}
