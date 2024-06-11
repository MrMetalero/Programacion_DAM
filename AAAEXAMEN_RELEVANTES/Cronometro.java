import java.util.Scanner;


public class Cronometro {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer numHoras = 0;
        Integer numMinutos = 0;
        Integer numSegundos = 0;
        int cronoEncendido;
       



        do {
            
            System.out.println("Pulsa 1 para iniciar el cronómetro y 0 para salir");
            cronoEncendido = sc.nextInt();

        } while (cronoEncendido != 1 && cronoEncendido != 0);

    
 

        while(cronoEncendido == 1){


            

            for (int i = 0; i < 60; i++) {

                //Espera un segundo ----------------
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //-----------------------------------

                //Esta siguiente línea límpia la consola aunque es un poco snappy
                System.out.print("\033[2J");     
                //Printea en el formato que quierola hora con los valores obtenidos a lo largo del loop       
                System.out.println(numHoras+":"+ numMinutos +":"+ numSegundos);
                
                numSegundos += 1;




                
            }

            //Como ya tenemos una unidad base, solo tenemos que ir comprobando que se llegan  los valores
            //equivalentes  en segundos a un minuto y a una hora para que se vayan cambiando según pasan los
            //segundos necesarios
            numSegundos = 0;
            numMinutos +=1;
            
            if (numMinutos == 60) {
                numMinutos = 0;
                numHoras +=1;

            }
            if(numHoras == 24){
                numHoras = 0;
                numMinutos = 0;
                numSegundos = 0;

            }



        }

        


        



    }
}



