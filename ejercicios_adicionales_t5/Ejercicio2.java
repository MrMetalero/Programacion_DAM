package ejercicios_adicionales_t5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float encendidoNumeros = 0;
        //Para media
        int numeroVecesLoop = 0;
        float numerosSumadosPeriod = 0;


        
        //Para Mayor y Menor
        int numeroCacheMaximo = 0;
        int numeroCacheMinimo = 0;
        int numerosParaComparar;
        int numerosParaComparar2;


        //Para contar positivos y negativos
        int numeroDeNegativos = 0;
        int numeroDePositivos = 0;

        //Pares
        int sumaPares = 0;
        int cantidadDePares = 0;

        //Impares
        int sumaImpares = 0;
        int cantidadDeImpares = 0;

      
        Scanner sc = new Scanner(System.in);

        while(encendidoNumeros != 1){

            //limpiar numeroCacheMaximo
            
            System.out.println("Introduce un valor " + numeroVecesLoop );
            int numeroInput = sc.nextInt();

            // Para realizar media
            numerosSumadosPeriod = numerosSumadosPeriod + numeroInput;

            //Para guardarlos números que nos llegan en caso del MAYOR
            numerosParaComparar = numeroInput;

            //Para guardarlos números que nos llegan en caso del MENOR
            numerosParaComparar2 = numeroInput;





            //Compara el número en caché con el número recibido y guarda el MAYOR
            if(numerosParaComparar > numeroCacheMaximo && numeroVecesLoop != 0){
                numeroCacheMaximo = numerosParaComparar;


            }
            else{ 
                if (numeroVecesLoop != 0) {
                    numeroCacheMaximo = numeroCacheMaximo;
                }
            }


            //Compara el número en caché con el número recibido y guarda el MENOR
            if(numerosParaComparar2 < numeroCacheMinimo && numeroVecesLoop != 0){
                numeroCacheMinimo = numerosParaComparar2;


            }
            else{ 
                if (numeroVecesLoop != 0) {
                    numeroCacheMinimo = numeroCacheMinimo;
                }
            }

            // Para asignar el primer valor al caché y poder compararlo con el segundo número introducido
            if (numeroVecesLoop == 0) {

                //Para positivos
                numeroCacheMaximo = numerosParaComparar;
                //Para negativos
                numeroCacheMinimo = numerosParaComparar2;
            }
        


            if (numeroInput > 0) {
                numeroDePositivos += 1;
            } else {
                numeroDeNegativos += 1;
            }

            if (numeroInput%2 == 0) {
                sumaPares += numeroInput;
                cantidadDePares += 1;
            } else {
                sumaImpares += numeroInput;
                cantidadDeImpares += 1;
            }            






            //Apagar el loop al pulsar 1
            System.out.println("Introduce 1 para parar de introducir datos, introduce otro valor para continuar introduciendo valores");
            encendidoNumeros = sc.nextInt();

            
            numeroVecesLoop +=1;



        }





        //Aquí fuera irán todas las operaciones que requieren haber pasado por todos los números
        //o habr completado el loop antes de mostrarse.


        //media de los números introducidos
        System.out.println("La media es: "+ numerosSumadosPeriod/(numeroVecesLoop));

        //numero maximo de los números introducidos
        System.out.println("El numero máximo es: " + numeroCacheMaximo);

        //numero mínimo de los números introducidos
        System.out.println("El número mínimo es: " + numeroCacheMinimo);
    
        //numero de positivos
        System.out.println("El numero de negativos es: "+ numeroDeNegativos);

        //numero de negativos
        System.out.println("El numero de positivos es: "+ numeroDePositivos);

        //suma de números positivos y negativos
        System.out.println("La suma de los números es: "+ numerosSumadosPeriod);



        //cantidad de pares
        System.out.println("La cantidad de los pares es: "+ cantidadDePares);
        
        //cantidad de impares
        System.out.println("La cantidad de los impares es: "+ cantidadDeImpares);


        //suma de pares
        System.out.println("La suma de los pares es: "+ sumaPares);

        //suma de impares
        System.out.println("La suma de los impares es: "+ sumaImpares);








    }
}
