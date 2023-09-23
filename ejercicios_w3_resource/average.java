package ejercicios_w3_resource;
import java.util.*;


public class average {
    

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
float numbers[] = {0, 0, 0,};
int numbers_Max_Size = 3;
float total_Media = 0;


    for(int i = 0;i < numbers.length; i++){
        System.out.println(" Introduce un número : "+ (i+1));
        numbers[i] = sc.nextFloat();
        

        
        total_Media += numbers[i]   ;
    }

float resultado = total_Media/numbers_Max_Size;
System.out.println("La media de los números introducidos es: "+ resultado);





}






}
