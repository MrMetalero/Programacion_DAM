package supuestos_practicos_T5;
import java.util.Scanner;

public class SupuestoPracticoBisiesto {


/* HE USADO LA ESTRUCTURA DE FUNCIÓN QUE SE DA EN EL LIBRO */


public static String algoritmoBisiesto (int year1){

    int div4 = 0;
    int div100 = 0;
    int div400 = 0;

    /*MOD DEVUELVE EL RESTO DE UNA DIVISIÓN ENTRE DOS NÚMEROS
    div4 significa que es divisible entre 4 y así sobre sus números
    correspondientes */




    if (year1 % 4 == 0) {div4 = 1;}




    if (year1 % 100 == 0) {div100 = 1;}




    if (year1 % 400 == 0) {div400 = 1;}




    if (div4 == 1 || div400 == 1 && div100 == 0) {
        return "El año introducido es bisiesto";
    }
    else {return "El año no es bisiesto";}

}


    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year1;
    System.out.println("Introduce el año para determinar si es bisiesto"); 
     year1 = Integer.parseInt(args[0]);

     System.out.println(algoritmoBisiesto(year1));
     
   
    



        



}



}
