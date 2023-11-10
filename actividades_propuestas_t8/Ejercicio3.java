package actividades_propuestas_t8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos que vas a introducir");
        int limiteArray = sc.nextInt();

        // creamos el array
        String[] alumnosArray = new String[limiteArray];
        String Basura = ""; // recoge las putas lineas tocahuevos PD: Introducir lineas por aquí es una
                            // mierda

        for (int i = 0; i < alumnosArray.length; i++) { // recorre los indices del array para introducir nombres

            System.out.println("Introduce el alumno: " + i + " ");

            Basura = sc.nextLine(); // recoge las líneas que haya en el buffer para que no nos fastidie el input
            alumnosArray[i] = sc.next();

        }

        // solo para listar el Array con los indices
        for (int i = 0; i < alumnosArray.length; i++) {

            System.out.println("[" + i + "] " + alumnosArray[i]);

        }
        System.out.println("El array contiene los valores:" + Arrays.toString(alumnosArray));

        // Menú--------------------------------------

        int controlMenu = 50;

        // Es posible que los necesite ordenados así que haremos eso mismo con los
        // elementos del array con esto

        // Menú para las diferentes opciones, preguntará siempre al acabar una operación
        // hast que metas 0
        while (controlMenu != 0) {
            System.out.println("Introduce 1 para eliminar a un alumno del array");
            System.out.println("Introduce 2 para añadir un alumno al array");
            System.out.println("Introduce 3 para ordenar el array");
            System.out.println("Introduce 0 para finalizar el programa");

            controlMenu = sc.nextInt(); // Seleccionas la opción del menú

            if (controlMenu == 1) {

                System.out.println("introduce el nombre a borrar");
                Basura = sc.nextLine();

                String nombreBorrar = sc.next();
                int nombreEncontradoEn = -1;

                for (int i = 0; i < alumnosArray.length; i++) {

                    if (alumnosArray[i].equals(nombreBorrar)) {

                        nombreEncontradoEn = i;

                    }

                }

                String[] arrayCopia = new String[alumnosArray.length - 1]; // Array para copiar los nuevos datos en
                                                                           // varios casos

                // Primero se copia en caso de que el número a cambiar sea diferente de 0
                if (nombreEncontradoEn > 0 && nombreEncontradoEn < alumnosArray.length) {

                    for (int i = 0; i < alumnosArray.length; i++) {

                        System.arraycopy(alumnosArray, i, arrayCopia, controlMenu, nombreEncontradoEn);

                    }

                }

                // En el segundo caso se copia en caso de que el numero a cambiar sea el 0
                if (nombreEncontradoEn == 0) {
                    arrayCopia = Arrays.copyOfRange(alumnosArray, 1, alumnosArray.length);
                }

                // solo para listar el Array con los indices
                for (int i = 0; i < alumnosArray.length; i++) {

                    System.out.println("[" + i + "] " + alumnosArray[i]);

                }

            } else if (controlMenu == 2) {

            } else if (controlMenu == 3) {

                Arrays.sort(alumnosArray);

            }

        }

    }

}
