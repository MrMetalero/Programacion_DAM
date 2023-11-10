
package actividad_entornos2;


public class Ejer2_UD2 {

    
public static void main(String[] args) {
    


    /*
        ORIGINAL------------------------------------

        int i, j, k;
        for (k = 1; i <= 3; i++) {       //bucle que cuenta hasta 10  //Punto de ruptura recomendable
        for (i = 1; i <= 3-k; i++) {     //Punto de ruptura recomendable
        System.out.print(" ");
        }
        for (j = 1; j <= 2 * (j-1)+ 1; j++) {     //Punto de ruptura recomendable
        System.out.print( "*");
        }
        System.out.println( ".");
        }
        }

    */







        //he hecho que j sea la base de la pirámide que quieras hacer
        int i, j, k, columnas = 10;


        for (i = 1; i <= columnas; i++) { //bucle que cuenta hasta 10  //Punto de ruptura recomendable
            for (j = columnas-i; j >= 1; j--){   //Punto de ruptura recomendable
                    
                System.out.print(" "); //printea los espacios empieza siendo 9 y baja por cada fila
            }
          
            for (k = 1; k <= i; k++ ){     // Punto de ruptura recomendable
                       
                System.out.print("* ");  // Printea los asteriscos y unas separciones para cuadrarlos. 
                                           // los asteriscos utilizan i porque cada vez es uno más por fila
            }
            System.out.println();
        }
        
    }



}


