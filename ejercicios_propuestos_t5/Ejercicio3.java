package ejercicios_propuestos_t5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int alturaSeg1 = 4;
        
        int espacios = 3;
        int Ns = 1;
        //Filas
        while(alturaSeg1 > 0){
            
            //espacios
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");

            }
            
            //Ns
            for(int x = 0; x < Ns ; x++){
                System.out.print("*");

            }


            System.out.print("\n");
            Ns += 2;
            espacios -= 1;
            alturaSeg1 -= 1;
        }

        //variables para segmento 2 modificadas para cuadrar
        //se ajustan con el doble de lo que se modifica al final del
        //while contrario dado que en la última pasada las modifica
        //aunque no las acabe de usar en un siguiente while
        int alturaSeg2 = 3;
        Ns = Ns-4;
        espacios +=2;

        //Segmento2
        while(alturaSeg2 > 0){

            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < Ns; i++) {
                System.out.print("*");
            }

            System.out.print("\n");
            espacios +=1;
            alturaSeg2 -= 1;
            Ns -=2;
        }








    }

}