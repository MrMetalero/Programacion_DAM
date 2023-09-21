import java.util.*;





public class ejercicio13 {
    


    static double F_Primos(double numX){
        double numY = 1;
        int contador = 2;
        double resultado;
        System.out.println("Dentro de la función");
        System.out.println("numX o i será ahora" + numX);

        for(double i = numX; i == numY; i--){
            System.out.println("Primer for1 funcion");

            for(int y = contador ; y == i; y++){
                System.out.println("Segundo for2 función");
                if(y %  i == 0){
                    System.out.println("Entrando al if dentro de segundo for2");
                System.out.println("El número " + i + " es primo" );   
                } else System.out.println("El número " + i + " No es primo" ); 

            }
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
