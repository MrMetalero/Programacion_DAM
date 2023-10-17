package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio5 {

    //funciona
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numinput1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numinput2 = sc.nextInt();



        if(numinput1 > numinput2){
            for (int i = 0; i < 10; i++) {
            int numRandomizado = (int)((Math.random() *numinput1)+numinput2);
            System.out.println(numRandomizado);
            }


        }
        else{
            for (int i = 0; i < 10; i++) {
            int numRandomizado = (int)((Math.random() *numinput2)+numinput1);
            System.out.println(numRandomizado);
            }

        }

        

        


        

  


    }


}
