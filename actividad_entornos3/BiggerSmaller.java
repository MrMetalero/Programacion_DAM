/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_entornos3; // package va arriba del todo (cambiado)

import java.util.Scanner;

/**
 *
 * @author administrador
 */
public class BiggerSmaller {

    /**
     * @param args the command line arguments
     */
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author admin
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();
        int small = 0; // inicializado small
        int big; // declarado big

        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;
            if (variable_2 > variable_3) {

                small = variable_3;
            } else {

                small = variable_2;// en algunas de estas asignaciones no estaba el nombre de la variable correcta,
                                   // los he cambiado en todos los casos donde estaba mal
            }
            System.out.println("The biggest number is " + big + " The smallest number is:" + small);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2; // había que declarar la variable big más arriba (si no en este bloque en el de
                              // arriba que no me acuerdo en cual estaba mal)
            if (variable_1 > variable_3) {

            } else {
                small = variable_1; // había variables innecesarias y repetidas en esta parte, se han eliminado

            }
            System.out.println("The biggest number is " + big + "The smallest number is:" + small); // small salía con
                                                                                                    // necesidad de
                                                                                                    // inicializar

        }

        if (variable_3 > variable_1 && variable_3 > variable_2) { // los símbolos estaban mal
            big = variable_3;
            if (variable_2 > variable_1) {

                small = variable_1;
            } else {

                small = variable_2;
            }

            System.out.println("The biggest number is " + big + "The smallest number is:" + small);

        }

    }
}
