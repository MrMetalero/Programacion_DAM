package ejercicios_adicionales_t5;
import java.util.Scanner;

public class Ejercicio12 {

    




    
    public static void main(String[] args) {
        int mensualidades;
        int numMensualidades;     
        int totalAPagar = 0;
        int controlMensualidadesDinero;
        Scanner sc = new Scanner(System.in);



      




            
        
      
            System.out.println("Introduce lo que se pagó el primer mes:");
            mensualidades = sc.nextInt();
            System.out.println("Introduce mensualidades:");
            numMensualidades = sc.nextInt();
            

            for (int i = 0; i < numMensualidades; i++) {
                totalAPagar += mensualidades;
                System.out.println("Mes "+ i +": "+ mensualidades);
                mensualidades = mensualidades + mensualidades;

            }

            System.out.println("El total pagado en todas las mensualidades es: " + totalAPagar);





    }


}
