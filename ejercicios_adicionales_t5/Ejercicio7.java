package ejercicios_adicionales_t5;
import java.util.Scanner;
public class Ejercicio7 {
    
    //Mejorable usando un filtro por longitud de caracteres y un loop que pida repetir
    //el proceso en caso de que se introduzca un dato que no coincide con uno de los casos
    //en vez de terminar el progrema
    public static void main(String[] args) {
        int numInput1;
        int numInput2;
        String simboloAritmerico;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer número");
        numInput1 = sc.nextInt();

        System.out.println("Introduce el valor del segundo número");
        numInput2 = sc.nextInt();

        System.out.println("Indica con un símbolo la operación a realizar \n Los signos aritméticos disponibles son:\r\n" + //
                "+: suma los operandos.\r\n" + //
                "-: resta los operandos.\r\n" + //
                "*: multiplica los operandos.\r\n" + //
                "/: divide los operandos, resultado con decimales (double)\r\n" + //
                "^: 1er operando como base y 2º como exponente.\r\n" + //
                " %: módulo, resto de la división entre operando1 y operando2"
        );

        sc.nextLine(); //Limpiar el escáner

        simboloAritmerico = sc.nextLine();


        if (simboloAritmerico.equals("+")) {
            System.out.println(numInput1 + numInput2);
        } 
        else 
        {
            if (simboloAritmerico.equals("-")) {
            System.out.println(numInput1 - numInput2);
            }
            else 
            {
                if (simboloAritmerico.equals("*")) {
                System.out.println(numInput1 * numInput2);
                }
                else 
                {
                    if (simboloAritmerico.equals("/")) {
                    System.out.println((double)((double)numInput1 / (double)numInput2));
                    }
                    else 
                    {
                        if (simboloAritmerico.equals("^")) {
                        System.out.println(numInput1 ^ numInput2);
                        }
                        else 
                        {
                            if (simboloAritmerico.equals("%")) {
                            System.out.println(numInput1 % numInput2);
                            } 
                        } 
                    } 
                } 
            }

        }

    }

}
