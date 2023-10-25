package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        int numeroMax;  
        int controlDeLineas = 1;
        int controlNumPorFila = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número límite");
        numeroMax = sc.nextInt();


    
            
        for (int x = 1; x < numeroMax+1; x++) { //Hacer esto 15 veces por ejemplo
            System.out.print(x +" ");
            controlNumPorFila++;
            
            if(controlNumPorFila == controlDeLineas){
                System.out.print("\n");
                controlNumPorFila = 0;

                controlDeLineas++;
            }

          
        }

      






    }
}




/*

    int = input
    int = númeroAImprimir es  = i
    int = numeroHastaSalto = 1

    for(int i = 0 ; i < input; i++){


        i
        
        if(i == numeroHastaSalto && numeroHastaSalto >){
            sout(\n)
            

        }
        numeroHastaSalto +=1

    }


    








 */