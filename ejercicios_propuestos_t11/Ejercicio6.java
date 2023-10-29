package ejercicios_propuestos_t11;
import java.util.Scanner;

public class Ejercicio6 {
    


    public static int FuncionTransformarBinario(int numeroInput){

         
        if (numeroInput == 0) {
            return 0;

        }else{
            System.out.println(numeroInput % 2);
            return FuncionTransformarBinario(numeroInput/2);

        }

  
    }

    public static int FuncionTransformarOctal(int numeroInput){

        if (numeroInput == 0) {
            return 0;

        }else{
            System.out.println(numeroInput % 8);
            return FuncionTransformarOctal(numeroInput/8);

        }


       
    }

    public static int FuncionTransformarHexadecimal(int numeroInput){


    if (numeroInput == 0) {
                return 0;

            }else{

                if (numeroInput == 10) {
                    System.out.println("A");
                }
                else if(numeroInput == 11){
                    System.out.println("B");


                }
                else if(numeroInput == 12){
                    System.out.println("C");


                }
                else if(numeroInput == 13){
                    System.out.println("D");


                }
                else if(numeroInput == 14){
                    System.out.println("E");


                }
                else if(numeroInput == 15){
                    System.out.println("F");

                }else{
                System.out.println(numeroInput % 16);
                }
                

                
                return FuncionTransformarHexadecimal(numeroInput/16);

            }




    }

  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numeroInput = sc.nextInt();
        

        System.out.println("Leer los números de arribaa abajo porfa :) (Lo arregrlaré si me da tiempo)");
        System.out.println("Binario");
        FuncionTransformarBinario(numeroInput);

        System.out.println("Hexadecimal");
        FuncionTransformarHexadecimal(numeroInput);
       
        System.out.println("Octal");
        FuncionTransformarOctal(numeroInput);
        

    }

}
