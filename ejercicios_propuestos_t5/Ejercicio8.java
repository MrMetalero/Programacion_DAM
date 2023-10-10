package ejercicios_propuestos_t5;

import java.util.Scanner;

public class Ejercicio8 {

    static int funcionSeparar(int numeroRecibido){
      
        int numLongitudControl = 1;
        int numLongitud = 0;
        String cifrasJuntas = "" ;

        //calcular la longitud del número multiplicando 1 por 10 
        //hasta que sea mayor que el número dado
        while(numLongitudControl < numeroRecibido){
            numLongitudControl = numLongitudControl * 10;
            ++numLongitud;
    
        }


        //DECLARACIÓN DEL ARRAY Y ASIGNACIÓN DE numLongitud como longitud del array

        int [] arrayValores = new int[numLongitud];
        




        //Para testing del array y su longitud
        int longitudArrayMostrar = 0;
        //Testing-------  System.out.println("Longitud del array " + longitudArrayMostrar);
        

        // LOOP Para pasar entre los diferentes dígitos. Mientras el número a 
        // dividir entre 10 no sea 0 ,lo sigue dividiendo (como es un int, se truncan los decimales)
        do{
        
            //El resto de la división entre el número y 10 lo guardamos y queremos
            //meterlo en el array en la posición 0 al empezar e ir
            //metiéndiolos al seguir el loop en posiciones del array diferentes
            int cifraguardada = numeroRecibido%10;
           
            //Testing------ System.out.println("Cifra guardada actual "+ cifraguardada);

    
                arrayValores[longitudArrayMostrar] = cifraguardada;
            

                //Testing------ System.out.println("Valor de arrayValores[i]: "+ arrayValores[longitudArrayMostrar-1]);

                // Vamos reduciendo la variable que hemos usado para introducir 
                // valores en el índice del array justo arriba en 1 para que vaya
                // cruzando la longitud del array en orden decreciente y podamos mostrar
                // el array en orden creciente luego.
                longitudArrayMostrar = longitudArrayMostrar +1 ;

          
          

            //Vamos moviéndonos entre las cifras en este loop dividiendo
            numeroRecibido = numeroRecibido/10;
          
        }while(numeroRecibido != 0);








        // Recibir los valores del array
       for(int i = 0 ; i <= numLongitud-1 ; i++){

        cifrasJuntas += String.valueOf(arrayValores[i]);
        

       
       }
        System.out.println("El número al reves es: "+ cifrasJuntas);

        return Integer.parseInt(cifrasJuntas);
       
    }











    static double F_Primos(double numX){
        double numY = 1;
        int contador = 2;
        //System.out.println("Dentro de la función"); para debug
        double resto;
        boolean esprimo = true;

    if(numX < 2){ //elimina 1 y negativos, no son primos
        System.out.println("---El número  no es primo---"); return 0;
    }else if(numX >= 4){ //comprueba cualquier número a partir de 4 
            
            do {resto = numX % contador; contador++;}
            
            while( esprimo && contador < numX && resto != 0 ); //asigna a resto el modulo de X entre
           
            /*  Si sale del loop  porque su resto es 0 en cualquiera de los pasos, no es primo 
             * menos cuando numX = contador, que es cuando se divide entre si mismo, cosa que
             * es una propiedad de los primos
            */

            if(resto == 0){
                System.out.println("---El número no es primo---"); return 0;


            }else  System.out.println("---El número es primo---"); return 1;
            
        }else System.out.println("---El número es primo---"); //contempla 2 y 3, primos

        return 1;
    }



    public static void main(String[]args){

        double num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número...");
        num1 = sc.nextDouble();


        
        if(num1 != 0 && num1 > 1){ 

                F_Primos(num1);
            if (F_Primos(funcionSeparar((int)num1)) == 1) {
                 System.out.println("El número es OMIRP");

            }else System.out.println("El número NO ES OMIRP");


        }



    }






}
