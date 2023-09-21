import java.util.*;


public class ejercicio6 {
static final double gravedad = 9.8;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double velocidad;
    double tiempo;

    System.out.println("Introduce el tiempo para multiplcarlo por Gravedad(9.8)");
    tiempo = sc.nextInt(); 
    if(tiempo > 0){

        velocidad = gravedad * tiempo;
        System.out.println("El la velocidad con el tiempo dado es de: " + velocidad);

    } else {System.out.println("Número inválido");}




    
}





}
