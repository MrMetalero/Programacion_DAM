package ejercicios_iniciales;
import java.util.*;



public class ejercicio10 {
    
public static void main(String[] args){

int control = 0;
int num;
int negativos = 0;
int positivos = 0;
int cero = 0;

Scanner sc = new Scanner(System.in);




while(control != 9){

    System.out.println("Introduce 10 números... ");
    num = sc.nextInt();
    if(num > 0){
        positivos += 1;
    }
    else if(num < 0){
        negativos += 1;

    }
    else cero += 1;




    control += 1;

}

System.out.println("La cantidad de positivos es: "+ positivos);
System.out.println("La cantidad de negativos es: "+ negativos);
System.out.println("La cantidad de ceros es: "+ cero);



















}



}
