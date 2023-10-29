package ejercicios_pag213y214;
import java.util.Scanner;

public class Ejercicio5 {
    

    public static int funcionDivisionRestas(int dividendo, int divisor, int resultado){

        if(dividendo - divisor == 0 ){
            
            return resultado+1;


        }else{
            
            return funcionDivisionRestas(dividendo-divisor, divisor, resultado+1);
        }

        

    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el dividendo");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor");
        int divisor = sc.nextInt();


        
        while(dividendo < divisor){
            System.out.println("El divisor tiene que ser menor que el dividendo");
            System.out.println("Introduce el dividendo");
            dividendo = sc.nextInt();
            System.out.println("Introduce el divisor");
            divisor =sc.nextInt();


        }

        
        System.out.println("El resultado de la división es : "+ funcionDivisionRestas(dividendo, divisor, 0));





    }

}
