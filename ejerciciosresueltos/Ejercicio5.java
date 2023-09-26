package ejerciciosresueltos;

public class Ejercicio5 {
    
    public static void main(String[]args){
    
        int i = 0x100;
        i >>>= 1;
        System.out.println( i );


        
    }
    /* 

    El programa me da 128

    Explicación de por qué me da 128:

    
    bloques de 4  binarios para representar hexadecimales  

                0001 0000 0000    = 0x100 en hexa
                                  = 256 en decimal

   " >>>= 1 " desplazamos el 1 que esté más a la izquierda dos 
    puestos de izquierda a derecha ignorando
    los 1 de la derecha y dejándolos en 0  
      

        >>>= 1  0000 1000 0000   = 128 en decimal

        R= si leemos el número binario en decimal sabremos que
        128 se debe al cambio de posición del bit que había inicialmente

    */  


}




