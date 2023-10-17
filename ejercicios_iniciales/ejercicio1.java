package ejercicios_iniciales;
import java.util.*;

public class ejercicio1 {
    

public static void main(String[] args){

int numero1;
int numero2;


Scanner sc = new Scanner(System.in);

System.out.println("introduce un número");
    numero1= sc.nextInt();

System.out.println("introduce un segundo número");
    numero2= sc.nextInt();

    if (numero1 > numero2) {
        System.out.println ("El múmero mayor es: "+ numero1);

    } else {System.out.println("El múmero mayor es: "+ numero2);}




}


}
