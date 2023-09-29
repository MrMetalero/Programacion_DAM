package boletin_desde_cero;

import java.util.Scanner;

public class EjercicioSecuencial7 {
        
    public static void main(String[] args) {
    double cateto1;
    double cateto2;    
    double hipotenusa;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un valor para un cateto");
    cateto1 = sc.nextDouble();


    System.out.println("Introduce un valor para un cateto");
    cateto2 = sc.nextDouble();
    

    System.out.println("La hipotenusa = " + ( hipotenusa = (2*cateto1) + (2*cateto2) ));
    




        
    }




}
