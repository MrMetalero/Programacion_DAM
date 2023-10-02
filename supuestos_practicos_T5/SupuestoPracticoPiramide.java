package supuestos_practicos_T5;
import java.util.*;
public class SupuestoPracticoPiramide {

   

    
    public static String funcionPiramide(Integer cantidadFilas){
        Scanner sc = new Scanner(System.in);
      
        int numeroNUltimaFila;
        int cantidadEspaciosFila1;
        int cantidadEspaciosFilaSiguiente = 0;
        String piramide = "";
        StringBuilder piramidestr = new StringBuilder();



       

        //fila1
        //Lo siguiente representa la relación encontrada en el dibujo del comentario de más 
        //abajo, donde podemos ver que el resto de la división de el número de Ns
        //que contiene la última fila es igual a el número de espacios que necesitará
        //la cúspide de la pirámide antes de representar el carácter.
        //además, el número de Ns que tendrá última fila será igual a 
        // una N de la fila 1 + dos Ns por la cantidad de filas
        //Esta primera fila la he puesto aparte para evitar problemas
        numeroNUltimaFila = 1 + 2 * cantidadFilas;
        cantidadEspaciosFila1 = numeroNUltimaFila/2;
        //Se imprimen los espacios necesarios
        for (int x = cantidadEspaciosFila1; x > 0; x--) {
            piramide =  "c" + piramide;
             
            //piramidestr.insert(0,"c");

        }
        piramide = piramide + "N"
;       System.out.println(piramide);


        piramide = piramide +"\n";
        System.out.print(piramide);
        System.out.print("salto");





     //1//   "     N"      1        // PuntaEspacios = de ÚltimaColumna.Longitud /2
     //2//   "    NNN"     3  1d    // SiguienteFilaEspacios =  puntaEspacios - 1
     //3//   "   NNNNN"    5  2d    // (Cantidad N) stringN = "N" +stringN + "N"
     //4//   "  NNNNNNN"   7  3d              Xd --> resto división
     //5//   " NNNNNNNNN"  9  4d
     //6//   "NNNNNNNNNNN" 11 5d   1+ 2*número de filas  
        return "";
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        System.out.println("Introduce la cantidad de filas");
        N = sc.nextInt();
        System.out.println(funcionPiramide(N));
        





    }



}
