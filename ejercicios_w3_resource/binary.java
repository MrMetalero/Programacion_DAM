package ejercicios_w3_resource;
import java.util.*;



public class binary {


    static int F_Comprobacion(int numero_recibido){
        int ultimo_numero = 1;
        int numero_recibido_dividido = numero_recibido;
        boolean numero_valido = true;

        // mientras el numero introducido sea mayor que 0
        // que lo vaya dividiendo entre 10 haciendo que se
        // aproxime a la cifra de antes de la coma 
        // EJ (de 126 a 12.6 a 1.2 a 1)
        // al ser de tipo int se eliminan los restos

        do{
            System.out.println("num_recibido antes de dividir entre 10 : "+ numero_recibido_dividido);
            ultimo_numero = numero_recibido_dividido % 10;
            numero_recibido_dividido = numero_recibido_dividido / 10;
            System.out.println("Control num_recibido tras dividir : "+ numero_recibido_dividido);
            System.out.println( "Control ultimo_numero : "+ ultimo_numero);
        
           if (ultimo_numero < 0 || ultimo_numero > 1 ) {
            System.out.println("numero inválido");
            numero_valido = false;
            //que devuelva 0 si el número es inválido
            return 0;

           }

        }
        while (numero_recibido_dividido > 0 && ultimo_numero > -1 && ultimo_numero < 2);
        
    
            
        System.out.println("El número es válido " );
    
        //que devuelva el número introducido inicialmente si es válido
        return numero_recibido;
    } 



    static String F_SumaBinario(int input1_comprobado, int input2_comprobado){

        int ultimo_numero_1;
        int ultimo_numero_2;
        int numero_recibido_dividido_1 = input1_comprobado;
        int numero_recibido_dividido_2 = input2_comprobado;



        int sumando_actual_1;
        int sumando_actual_2;
        int llevando = 0;

        int resultado_actual;
        String suma_total = "";

        do{
    
            //numero1
            ultimo_numero_1 = numero_recibido_dividido_1 % 10;
            numero_recibido_dividido_1 = numero_recibido_dividido_1 / 10;
            System.out.println("Control num_recibido 1 tras dividir : "+ numero_recibido_dividido_1);
            System.out.println( "Control ultimo_numero 1 : "+ ultimo_numero_1);
        
            //añadir a sumando 1 la cifra actual
            sumando_actual_1 = ultimo_numero_1;
            System.out.println(sumando_actual_1);
        
        



            //numero2
            ultimo_numero_2 = numero_recibido_dividido_2 % 10;
            numero_recibido_dividido_2 = numero_recibido_dividido_2 / 10;
            System.out.println("Control num_recibido 2 tras dividir : "+ numero_recibido_dividido_2);
            System.out.println( "Control ultimo_numero 2 : "+ ultimo_numero_2);
        
            //añadir a sumando 2 la cifra actual
            sumando_actual_2 = ultimo_numero_2;
            System.out.println(sumando_actual_2);



            if (sumando_actual_1 == 0 && sumando_actual_2 == 0 && llevando == 0){
                resultado_actual = 0;

                           

                char a = '0';
                suma_total = a + suma_total;

            }else if (sumando_actual_1 == 0 && sumando_actual_2 == 1 && llevando == 0) {
                    resultado_actual = 1;

                    char a = '1';
                    suma_total = a + suma_total;
                
                }else if (sumando_actual_1 == 1 && sumando_actual_2 == 0 && llevando == 0) {
                        resultado_actual = 1;
                        
                        char a = '1';
                        suma_total = a + suma_total;
                    }else if (sumando_actual_1 == 1 && sumando_actual_2 == 1 && llevando == 0) {
                            resultado_actual = 0;
                            llevando = 1;

                            char a = '0';
                            suma_total = a + suma_total;



                            
                
                        }else if (sumando_actual_1 == 0 && sumando_actual_2 == 0 && llevando == 1) {
                                resultado_actual = 1;

                                char a = '1';
                                suma_total = a + suma_total;
                                llevando = 0;


                            }else if (sumando_actual_1 == 0 && sumando_actual_2 == 1 && llevando == 1) {
                                resultado_actual = 0;
                                char a = '0';
                                suma_total = a + suma_total;
                                llevando = 1;

                                
                                }else if (sumando_actual_1 == 1 && sumando_actual_2 == 0 && llevando == 1) {
                                    resultado_actual = 0;
                                    char a = '0';
                                    suma_total = a + suma_total;
                                    llevando = 1;

                                
                                }else if (sumando_actual_1 == 1 && sumando_actual_2 == 1 && llevando == 1) {
                                    resultado_actual = 1;
                                    char a = '1';
                                    suma_total = a + suma_total;
                                    llevando = 1;
                                
                                }


        }
        while (numero_recibido_dividido_1 > 0 && numero_recibido_dividido_2 > 0 );

        System.out.println(suma_total);


        return suma_total;
    }



public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int input1;
int input2;

int input1_comprobado;
int input2_comprobado;

System.out.println("Introduce el primer sumando en binario");
input1 = sc.nextInt();

System.out.println("Introduce el segundo sumando en binario");
input2 = sc.nextInt();


input1_comprobado = F_Comprobacion(input1);
input2_comprobado = F_Comprobacion(input2);

    if(input1_comprobado == 0 || input2_comprobado == 0){

        System.out.println("Alguno de los inputs no es válido, por favor introduce solo binario");


    }else{
        
        F_SumaBinario(input1_comprobado, input2_comprobado);





    }



}

   
}
