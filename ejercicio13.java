import java.util.*;





public class ejercicio13 {
    


    static double F_Primos(double numX){
        double numY = 1;
        int contador = 2;
        System.out.println("Dentro de la función");
        System.out.println("numX o i será ahora" + numX);
        double resto;
        boolean esprimo = true;

    if(numX < 2){
        System.out.println("El número o es primo");
    }else if(numX > 4){
            
            do resto = numX % 1; while( esprimo && contador < numX);
            if(esprimo){System.out.println("El número es primo");}

        }

        return 0;
    }



    public static void main(String[]args){

        double num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número...");
        num1 = sc.nextDouble();


        if(num1 != 0 && num1 > 1){
            System.out.println("Dentro del if en principal");
            F_Primos(num1);
            System.out.println("Al finalizar la función");
        }



    }








}
