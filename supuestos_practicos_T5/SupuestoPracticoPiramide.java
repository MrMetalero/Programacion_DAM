package supuestos_practicos_T5;
import java.util.*;
public class SupuestoPracticoPiramide {

   

    
    public static String funcionPiramide(Integer cantidadFilas){
        Scanner sc = new Scanner(System.in);
      
        int numeroNUltimaFila;
        int cantidadEspaciosFila1;
        int cantidadEspaciosFilaSiguiente = 0;
        int numeroNs = 3; //la relación es que a cada fila tiene dos Ns más, la segunda fila empieza con 3 Ns
        String piramide = "";



                //1//   "     N"      1        // PuntaEspacios = de ÚltimaColumna.Longitud /2
        //2//   "    NNN"     3  1d    // SiguienteFilaEspacios =  puntaEspacios - 1
        //3//   "   NNNNN"    5  2d    // (Cantidad N) stringN = "N" +stringN + "N"
        //4//   "  NNNNNNN"   7  3d              Xd --> resto división
        //5//   " NNNNNNNNN"  9  4d
        //6//   "NNNNNNNNNNN" 11 5d   1+ 2*número de filas  
        

        //fila1
        //Lo siguiente representa la relación encontrada en el dibujo del comentario de más 
        //abajo, donde podemos ver que el resto de la división de el número de Ns
        //que contiene la última fila es igual a el número de espacios que necesitará
        //la cúspide de la pirámide antes de representar el carácter.
        //además, el número de Ns que tendrá última fila será igual a 
        // una N de la fila 1 + dos Ns por la cantidad de filas

        //Esta primera fila la he puesto aparte para evitar problemas
        //relación entre el número de la última fila y la cantidad de Ns que contiene
        numeroNUltimaFila = 1 + 2 * cantidadFilas;
        //Relación entre la mitad de Ns que tiene la fila final, (porque el hacer esta división nos da la mitad de la pirámide)
        //y la cantidad de espacios que requiere fila 1 antes de poner la N
        cantidadEspaciosFila1 = numeroNUltimaFila/2;
        //Se imprimen los espacios necesarios
        for (int x = cantidadEspaciosFila1; x > 0; x--) {
            //añade espacios
            piramide =  " " + piramide;
             
          

        }
        //Añade la N de la cúspide
        piramide = piramide + "N";
        //Imprime la cúspide
        System.out.println(piramide);


        piramide = piramide +"\n";
        piramide = ""; //reset piramide
        cantidadEspaciosFilaSiguiente = cantidadEspaciosFila1-1;


        //Loop que va rotando entre todas las filas posibles
        while(cantidadFilas != 0){

            //Loop que va rotando entre  0 y la cantidad de espacios que requiere la siguiente fila
            //calculada arriba como cantidadEspaciosFilaSiguiente = cantidadEspaciosFila1-1;
            //Y va imprimiendo esa cantidad de espacios necesarios en el string Pirámide
            for (int y = 0; y < cantidadEspaciosFilaSiguiente; y++) {

                piramide = piramide +" ";
                
            }


            //Imprime la cantidad necesaria de Ns para cada fila, basándose en que si la primera tiene 1 N,
            //y la relación es que a cada fila tiene dos Ns más, la segunda fila empieza con 3 Ns
            for (int i =  numeroNs; i > 0; i--) {
                piramide = piramide + "N";
                
                
            }
            numeroNs = numeroNs + 2;

            piramide = piramide +"\n";

            cantidadEspaciosFilaSiguiente -=1;
            cantidadFilas -=1;

        }

        System.out.print(piramide);

        return "";
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        System.out.println("Introduce la cantidad de filas");
        //La variable que define las filas pasada por argumentos
        N = Integer.parseInt(args[0]);
        System.out.println(funcionPiramide(N));
        





    }



}
