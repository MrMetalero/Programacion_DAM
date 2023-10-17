package ejercicios_iniciales;
import java.util.*;



public class ejercicio4 {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("Introduce el número correspondiente  a un día de la semana 1-7");
        dia = sc.nextInt();

        if( dia > 0 && dia < 8){

            switch(dia){

                case 1: System.out.println("Lunes");
                break;

                case 2: System.out.println("Martes");
                break;

                case 3: System.out.println("Miércoles");
                break;

                case 4: System.out.println("Jueves");
                break;

                case 5: System.out.println("Viernes");
                break;

                case 6: System.out.println("Sábado");
                break;

                case 7: System.out.println("Domingo");
                break;
            } 


        }else System.out.println("día no válido");









    }












}
