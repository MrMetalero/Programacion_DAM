package ejercicios_propuestos_t5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int alturaMax = sc.nextInt();
        int nFinal = (alturaMax * 2) + 1;
        int espaciosPrimer = nFinal / 2;
        int nS = 1;


        int alturaMax2 = Integer.valueOf(alturaMax);
        
        
        //\n

        //       N
        //      NNN
        //     NNNNN
        //    NNNNNNN
        //Sumar N al igual que lineas haya +2 1->N 2->NNN 3->NNNNN
        //Añadir los espacios
        
        while(alturaMax/2 > 0){
          
            for(int x = espaciosPrimer; x > 0; x--){
            System.out.print(" ");
            }
            for(int y = nS ;y > 0; y--){
            System.out.print("N");
            }
            nS = nS + 2;
            espaciosPrimer -= 1;
            alturaMax = alturaMax - 1;
            System.out.print("\n");
        }







        //1//   "     N"      1        // PuntaEspacios = de ÚltimaColumna.Longitud /2
        //2//   "    NNN"     3  1d    // SiguienteFilaEspacios =  puntaEspacios - 1
        //3//   "   NNNNN"    5  2d    // (Cantidad N) stringN = "N" +stringN + "N"
        //4//   "  NNNNNNN"   7  3d              Xd --> resto división
        //5//   " NNNNNNNNN"  9  4d
        //6//   "NNNNNNNNNNN" 11 5d   1+ 2*número de filas  
        //7//   " NNNNNNNNN" 11 5d   1+ 2*número de filas 
        //8//   "  NNNNNNN"  9  4d
        //9//   "   NNNNN"   7  3d              Xd --> resto división
        //10//  "    NNN"    5  2d    // (Cantidad N) stringN = "N" +stringN + "N"
         //11// "     N"    5  2d    // (Cantidad N) stringN = "N" +stringN + "N"




        
        int nSMedio = (nS-2);
        int espaciosMedio = 1;
        int nFinalMedioEspacios = ( ((alturaMax2/2)) );


        while(alturaMax2/2 > 0){
            for () {
                
            }


        
            alturaMax2 -= 1;

        }




    }

}