package supuestos_practicos_T5;
import java.util.Scanner;

public class SupuestoPracticoDatosPersonales {
    

    public static void main(String[] args) {
        
        String apellido1;
        String apellido2;
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu primer apellido");
        apellido1 = (args[0]);
        System.out.println("Introduce tu segundo apellido");
        apellido2 = (args[1]);
        System.out.println("Introduce tu nombre");
        nombre = (args[2]);


        System.out.println(nombre +" "+ apellido1  +" " + apellido2);

    }


}
