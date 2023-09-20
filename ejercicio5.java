import java.util.*;


public class ejercicio5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("Introduce el número correspondiente  a un día de la semana 1-7");
        dia = sc.nextInt();

        if( dia > 0 && dia < 8){

           if(dia == 1){
                System.out.println("Lunes");
           }
           else  if(dia == 2){
                    System.out.println("Martes");
                }
                else  if(dia == 3){
                        System.out.println("Miércoles");
                    }
                    else  if(dia == 4){
                            System.out.println("Jueves");
                        }
                        else  if(dia == 5){
                                System.out.println("Viernes");
                            }     
                            else  if(dia == 6){
                                    System.out.println("Sábado");
                                }
                                else  if(dia == 7){
                                        System.out.println("Domingo");
                                    }
                                    
                
               



        }else System.out.println("día no válido");





















    }







}
