package ejercicios_iniciales;
import java.text.Collator;
import java.util.*;

import org.w3c.dom.Text;




public class ejercicio9 {
    
    public static void main(String[] args){

        String dia;
        Scanner sc = new Scanner(System.in);
       
      System.out.println("Introduce un día de la semana, SIN ACENTOS");
        dia = sc.next();
        

        if(dia.equals("lunes")|| dia.equals( "Lunes") ){
            System.out.println("psicomotricidad ");
        }


        else if (dia.equals("martes") || dia.equals("Martes")){
            System.out.println("natación ");
        }  
          

        else if (dia.equals("miercoles") || dia.equals("miércoles") || dia.equals("Miercoles") || dia.equals("Miércoles")){
            System.out.println("música ");
        }    


        else if (dia.equals("jueves") || dia.equals("Jueves")){
            System.out.println("natación ");
        }    
        
        
        else if (dia.equals("viernes") || dia.equals("Viernes")){
            System.out.println("Descanso ");
        }    
        
        
        else if (dia.equals("sabado") || dia.equals("sábado") || dia.equals("Sabado") || dia.equals("Sábado")){
            System.out.println("Día sin actividades ");
        }    
        

        else if (dia.equals("domingo") || dia.equals("Domingo")){
            System.out.println("Día sin actividades ");
        }    

        else  System.out.println("Día no válido");





    }












}
