package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio8 {

    public static int algoritmoBisiesto (int year1){

        int div4 = 0;
        int div100 = 0;
        int div400 = 0;
        int esBisiesto = 0;
    
        /*MOD DEVUELVE EL RESTO DE UNA DIVISIÓN ENTRE DOS NÚMEROS
        div4 significa que es divisible entre 4 y así sobre sus números
        correspondientes */
    
    
    
    
        if (year1 % 4 == 0) {div4 = 1;}
    
    
    
    
        if (year1 % 100 == 0) {div100 = 1;}
    
    
    
    
        if (year1 % 400 == 0) {div400 = 1;}
    
    
    
    
        if (div4 == 1 || div400 == 1 && div100 == 0) {
            esBisiesto = 1;
        }
        
        return esBisiesto; //Recordando que es mejor quitarme de en medio el usar varios returns
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputDia;
        int inputMes;
        int inputYear;


      
        System.out.println("Introduce el Día: ");
        inputDia = sc.nextInt();

        System.out.println("Introduce el Mes: ");
        inputMes = sc.nextInt();

        System.out.println("Introduce el Año: ");
        inputYear =sc.nextInt();



        if(inputMes > 12 || inputMes < 1){
            System.out.println("Mes introducido no válido");

        }else{ 
            System.out.println("mes correcto");
   
            if(inputMes != 4 || inputMes != 6 || inputMes != 9 || inputMes != 1 && inputMes != 2 ){
                
                if(inputDia > 31 || inputDia < 1){
                    System.out.println("El día no es válido");


                }


            }else{
                if(inputMes != 2){ //los meses de Abril, Junio, Septiembre y Noviembre
                    if(inputDia > 30 || inputDia < 1){
                        System.out.println("el día introducido no es válido");


                    }


                }else{ //El mes de febrero

                    if(algoritmoBisiesto(inputYear) == 1){
                        System.out.println("El año es bisiesto");
                        if(inputDia > 29 || inputDia < 1){
                            System.out.println("El día no es válido");
                            

                        }


                    }else{
                        if(inputDia > 28 || inputDia < 1){
                            System.out.println("El día no es válido");

                        }

                    }





                }
                    
            }


            System.out.println("Día válido");
            System.out.println("Año válido");



        }





    
    







    }

}
