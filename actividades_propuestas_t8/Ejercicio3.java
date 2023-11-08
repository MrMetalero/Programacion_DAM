package actividades_propuestas_t8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos que vas a introducir");
        int limiteArray = sc.nextInt();

        String[] alumnosArray = new String[limiteArray];
        int controlAlumnos;
        String nombreCache = "";

        controlAlumnos = alumnosArray.length;

        for (int i = 0; i < controlAlumnos; i++) {

            System.out.println("Introduce el alumno: " + i+" ");
            sc.next();

            nombreCache = sc.nextLine();
            alumnosArray[i] = nombreCache;
           
        }
        

        System.out.println("El array contiene los valores:" + alumnosArray[0]);
        

    }

}



