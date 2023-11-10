/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_entornos;
/**
 * @author Dani
 */
public class Ejer1_UD2 {

//Código original:


      

    /* 
        Los puntos de ruptura se ponen tras los for para comprobar los valores de las variables en
        mitad del procedimiento y poder llevar una idea de lo que ocurre en cada parte
        de el/los loops.








        public static void main(String[] args) {
            
            int i, j, z, filas=6;
            
            for (j = 1; i <= filas; i++){        //Punto de ruptura recomendable
                if ((j == 1) || (i == filas))        //Punto de ruptura recomendable
                    for (i = 1; j <= filas; j++)       //Punto de ruptura recomendable
                        System.out.print("");
                else
                    System.out.println("*");
            }
            
            
        }
    


        // A continuación como he dejdo el código para arreglarlo.
        // He usado la herramienta de debug con la opción de entrar en profundidad
        // paso a paso en Visual Studio, para visualizar el proceso.  F11 (Por instrucciones)
        // F10 para ir paso a paso por procedimientos

    */

    public static void main(String[] args) {
     
        int i, j = 0, filas=6;  // z no se usa así que lo borraría
       
        for (i = 0; i <= filas; i++){   //Punto de ruptura recomendable

            if ((j == 1) || (i == filas)){  //punto de ruptura recomendable

                for (j = 1; j <= filas; j++){ //punto de ruptura recomendable
                    System.out.print("");
                }

            }
            else{
                System.out.println("*");
            }
                
        }
    }    
        
}
   
