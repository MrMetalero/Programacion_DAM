package supuestos_practicos_T5;
import java.util.Scanner;

public class SupuestoPracticoDatosPersonales {
    

    public static void main(String[] args) {
        
        String apellido1;
        String apellido2;
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu primer apellido");
        apellido1 = sc.nextLine();
        System.out.println("Introduce tu segundo apellido");
        apellido2 = sc.nextLine();
        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();


        System.out.println(nombre + apellido1 + apellido2);

    }


}
