package supuestos_practicos_T5;
import java.util.Scanner;

public class SupuestoPracticoCadenaFin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strTexto = "";


        while(!strTexto.contains("FIN")){
            strTexto = strTexto + "\n" + sc.nextLine();




        }



        System.out.println("\nEl texto final es el siguiente:\n" + strTexto);




        /* 
        INTENTO DE USAR STRINGBUILDER Y OBTENER EL VALOR DE SU STRING PARA USARLO EN UN IF

        StringBuilder cadenaBuffer = new StringBuilder(" ");
        Scanner sc = new Scanner(System.in);
        StringBuilder acabarFin = new StringBuilder("FIN");

        while (!cadenaBuffer.equals("FIN")  || cadenaBuffer.toString().equals(acabarFin.toString())) {
     
            cadenaBuffer.replace(0, cadenaBuffer.length(), sc.nextLine() );
            System.out.println("cadenaBuffer es ahora ---- "+ cadenaBuffer );

        }

        */

    }


}
 