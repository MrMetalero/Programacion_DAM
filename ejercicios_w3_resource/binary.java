package ejercicios_w3_resource;
import java.util.*;



public class binary {

public static void main(String[]args){
Scanner sc = new Scanner(System.in);

binary binario1;
binary binario2;
String input_a_comprobar1;
String input_a_comprobar2;
binary resultado;

System.out.println("Introduce el primer número binario");
input_a_comprobar1 = sc.nextLine(); 

System.out.println("Introduce el segundo número binario");
input_a_comprobar2 = sc.nextLine();

if(!input_a_comprobar1.matches("[01]{1,}") && !input_a_comprobar2.matches("[01]{1,}")){

    System.out.println("ERROR El número introducido no es binario, ERROR");



}else {
    resultado = input_a_comprobar1 + input_a_comprobar2;
    System.out.println("El resultado de la suma es:");




}




}










    
}
