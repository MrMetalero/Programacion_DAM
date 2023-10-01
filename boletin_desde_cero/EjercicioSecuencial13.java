package boletin_desde_cero;
import java.util.Scanner;

public class EjercicioSecuencial13 {


    //funcion para separar las cifras de los números introducidos

    public static int funcionSepararDigitos(int numeroInput){
        int sumaCifras = 0;

        for(int i = numeroInput;i > 0; i--){

            sumaCifras += numeroInput%10;
            numeroInput = (numeroInput/10);

            


        }

    
        //Testing ------- System.out.println("La suma de la cifras que componen el número introducido es: "+ sumaCifras);

        return sumaCifras;
    }

    public static String StringvalueOf(int numeroConvertir){

        String numeroconvertido;




        

    }



    public static void main(String[] args) {
        
        int inputDia, inputMes, inputYear, sumaDatos = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor introduce el (día) de nacimiento");
        inputDia = sc.nextInt();

        String diaString = StringvalueOf(inputDia);
        while (inputDia > 31 || inputDia <= 0 || diaString.matches(["A-Za-z"])){ 
            
            System.out.println("Día no válido por favor introduce otro ");
            inputDia = sc.nextInt();

        }

        System.out.println("Por favor introduce el (mes) de nacimiento en número");
        inputMes = sc.nextInt();
        

        while (inputMes > 12 || inputMes <= 0 ){ 
            
            System.out.println("Mes no válido por favor introduce otro ");
            inputMes = sc.nextInt();

        }


        System.out.println("Por favor introduce el (año) de nacimiento");
        inputYear = sc.nextInt();
        while (inputYear <= 0){ 
            
            System.out.println("Año no válido por favor introduce otro ");
            inputYear = sc.nextInt();

        }

        sumaDatos = funcionSepararDigitos(inputDia) + funcionSepararDigitos(inputMes) + funcionSepararDigitos(inputYear);
        //Para evitar que si el número final es 19 por ejemplo, me de un número de 2 cifras
        //En vez de eso, realizamos el paso anterior una vez más de lo necesario para que sume 1 + 0
        sumaDatos = funcionSepararDigitos(sumaDatos);
        sumaDatos = funcionSepararDigitos(sumaDatos);
        System.out.println("Tu número de la suerte es: "+ sumaDatos);
        

    }







}
