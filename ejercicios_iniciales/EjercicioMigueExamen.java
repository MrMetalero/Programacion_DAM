package ejercicios_iniciales;
import java.util.Scanner;

public class EjercicioMigueExamen {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iteracio = 1;
        int importe = 0;
        double baseimposable = 0;
        double iva = 0;
        double total = 0;
        System.out.println("Precio");
        int precio = sc.nextInt();
        System.out.println("Cantidad");
        int cantidad = sc.nextInt();

        while(iteracio <=3){
            
            importe = precio * cantidad;

            if(importe > 200){
                importe = importe-10;

                System.out.println("importe actual ["+ iteracio + "] : " +importe);
            }
            baseimposable = baseimposable + importe;
            iteracio = iteracio+1;


        }

        iva = baseimposable *0.21;
        total = baseimposable + iva;

        System.out.println(total);








    } 



}

