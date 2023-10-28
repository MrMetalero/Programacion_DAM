package ejercicios_propuestos_t11;
import java.util.Scanner;

public class Ejercicio3CasaPorSincro {
    


    public static int funcionNumeros(int columnas, int lineas){
        if (lineas == 1) {
           return 1;
            
        }

        if(columnas == 1){
            return 1;

        }
        else{
            return funcionNumeros(columnas-1, lineas) + funcionNumeros(columnas, lineas-1);
        }



       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero columnas");
        int maximo = sc.nextInt();

        for(int lineas = 1 ; lineas <= maximo ; lineas++){


            for (int columnas = 1; columnas <= maximo; columnas++) {
                System.out.print(funcionNumeros(columnas, lineas) + "\t");
                
            }

            System.out.println("");
        }

       

    }
}
