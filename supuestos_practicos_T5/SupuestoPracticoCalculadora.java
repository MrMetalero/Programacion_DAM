package supuestos_practicos_T5;
import java.util.Scanner;
import java.math.*;

public class SupuestoPracticoCalculadora {
    


    public static void main(String[] args) {
        int encendido = 1;
        int tipoOperacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores de dos números para realizar operaciones");
        
        while (encendido == 1){
            System.out.println("Número 1: ");
            int num1 = Integer.parseInt(args[0]);
            System.out.println("Número 2: ");
            int num2 = Integer.parseInt(args[1]);

            System.out.println("Introduce:... "
                                + "\n1 para sumar"
                                + "\n2 para restar"
                                + "\n3 para dividir numero 1 entre número 2"
                                + "\n4 para multiplicar"
                                + "\n5 para potencia de número 1 elevado a numero 2"
                                
            );
            tipoOperacion = sc.nextInt();
            switch (tipoOperacion) {

                case 1: System.out.println("La suma es igual a: "+ Math.addExact(num1, num2)); 
                break;
                
                case 2: System.out.println("La resta es igual a: "+Math.subtractExact(num1, num2)); 
                break;  

                case 3: System.out.println("La división es igual a: " + Math.floorDiv(num1, num2)); 
                break;

                case 4: System.out.println("La multiplicación es igual a: " + Math.multiplyExact(num1, num2)); 
                break;

                case 5: System.out.println("La potencia de "+ num1+"^"+ num2 +" = "+ Math.pow(num1, num2)); 
                break;



                default: System.out.println("Número introducido no válido");
                    break;
            }
            










            System.out.println("Introduce 1 para volver a ejecutar u otro número para salir");
            encendido = sc.nextInt();
                
          
            
            
        }





    }
}
