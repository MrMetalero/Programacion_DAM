package ejercicios_practicos_t8;

import java.util.Arrays;

public class Ejercicio8 {

    public static void main(String[] args) {

        String cadena1 = "Juan\n8.5\nSergio\n8.5\nMario\n4.9\nPedro\n3.8\nAndrés\n6.3";
        String cadenaCopia = cadena1;

        String[] notasAlumnos = new String[10];
        String[] alumnos = new String[5];
        double[] notas = new double[5];

        
        for (int i = 0; i < notasAlumnos.length; i++) {

            if (cadenaCopia.contains("\n")) {

                notasAlumnos[i] = cadenaCopia.substring(0, cadenaCopia.indexOf("\n"));

                cadenaCopia = "" + cadenaCopia.substring(cadenaCopia.indexOf("\n") + 1, cadenaCopia.length());

            } else {
                notasAlumnos[i] = cadenaCopia.substring(0, cadenaCopia.length());

            }

        }
        System.out.println(Arrays.toString(notasAlumnos));

        int contadorNotas = 0;
        int contadorAlumnos = 0;

        for (int i = 0; i < notasAlumnos.length; i++) {
            

            if (i % 2 == 0) {
                alumnos[contadorAlumnos] = notasAlumnos[i];
                System.out.println(notasAlumnos[i] + " ha sacado un " + notasAlumnos[i + 1]);
                contadorAlumnos++;

            }else{
                notas[contadorNotas] = Double.valueOf(notasAlumnos[i]);
                contadorNotas++;
            }        

        }

        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(notas));




    }

}
