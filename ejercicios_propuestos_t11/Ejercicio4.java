package ejercicios_propuestos_t11;
import java.util.Scanner;

public class Ejercicio4 {
    

    public static int funcionPiramideRecursiva(int filas, int columnas){
        if(columnas == 1){
            return 1;
        }

        if(columnas == filas*2-1){
            return 1;
        }

        if(filas % 2 == 0 && columnas % 2 == 0){
            return 0;



        }else if(filas % 2 == 1 && columnas % 2 == 0){
            return 0;


        } else if(columnas == filas*2-2){
            return 0;


        }else if(columnas == 2){
            return 0;

        }else{
           return funcionPiramideRecursiva(filas-1, columnas-2) + funcionPiramideRecursiva(filas-1, columnas+1) + funcionPiramideRecursiva(filas-1, columnas);


        }
        



    

      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de lineas:");
        int alturaMax = sc.nextInt();
        int valoresCache;

        for(int filasMain = 1;filasMain <= alturaMax;filasMain++){
            for(int EspaciosMain = alturaMax; EspaciosMain >= filasMain; EspaciosMain--){
                System.out.print(" ");

            }
            for(int columnasMain = 1;columnasMain <= filasMain * 2 - 1;columnasMain++){
                valoresCache = funcionPiramideRecursiva(filasMain, columnasMain);
                if (valoresCache == 0 ) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(funcionPiramideRecursiva(filasMain, columnasMain));
                }

            }

            System.out.println(" ");
        }
    }

    


}

