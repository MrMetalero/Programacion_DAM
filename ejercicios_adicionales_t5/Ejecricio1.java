package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejecricio1 {
    public static void main(String[] args) {
        
        int controlIntroducirDatos = 0;
        float notaActual = 0;
        float encendidoNumeros = 0;

        Scanner sc = new Scanner(System.in);

        while(encendidoNumeros != 1){



            System.out.println("Introduce la nota numero " + controlIntroducirDatos );
            notaActual = notaActual + sc.nextFloat();

            System.out.println("Introduce 1 para parar de introducir datos, introduce otro valor para seguir añadiendo notas");
            encendidoNumeros = sc.nextInt();

            
            controlIntroducirDatos +=1;
        }

        System.out.println("La media es: "+ notaActual/(controlIntroducirDatos));


    }    
}
