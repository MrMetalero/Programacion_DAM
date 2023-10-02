package ejercicios_propuestos_t4;
import java.util.*;
import java.math.*;



/*8. Ejercicio: (ejercicio de dificultad alta) 
Realiza un programa que genere letras aleatoriamente
y determine si son vocales o consonantes.
 */

public class Ejercicio8 {

    //Se encarga de generar un número aleatorio del 0 al 25
    public static int funcionNumeroRandom(){
        int numeroRandom;
        
        
        numeroRandom = (int) (Math.random() * (25-0)+0);




        return numeroRandom;
    }

   
    //Asigna un número del 0 al 25 a cada letra posible
    public static Character funcionRelacionLetras(int numRecibido){
        Character letraGenerada;
        HashMap<Integer, Character> relacionLetras = new HashMap <Integer,Character>();
        
        

        relacionLetras.put(0,'a');
        relacionLetras.put(1,'b');
        relacionLetras.put(2,'c');
        relacionLetras.put(3,'d');
        relacionLetras.put(4,'e');
        relacionLetras.put(5,'f');
        relacionLetras.put(6,'g');
        relacionLetras.put(7,'h');
        relacionLetras.put(8,'i');
        relacionLetras.put(9,'j');
        relacionLetras.put(10,'k');
        relacionLetras.put(11,'l');
        relacionLetras.put(12,'m');                                  
        relacionLetras.put(13,'n');
        relacionLetras.put(14,'o');
        relacionLetras.put(15,'p');
        relacionLetras.put(16,'q');
        relacionLetras.put(17,'r');
        relacionLetras.put(18,'s');
        relacionLetras.put(19,'t');
        relacionLetras.put(20,'u');
        relacionLetras.put(21,'v');
        relacionLetras.put(22,'w');
        relacionLetras.put(23,'x');
        relacionLetras.put(24,'y');
        relacionLetras.put(25,'z');

        letraGenerada = relacionLetras.get(numRecibido);


        return letraGenerada;
    }

    
    //Se encarga de comprobar si la letra generada es una vocal o no y de llamar a las funciones
    public static void main(String[] args) {
        Character comprobarVocal;
        comprobarVocal = funcionRelacionLetras(funcionNumeroRandom());

        if (comprobarVocal == 'a'|| comprobarVocal == 'e' || comprobarVocal == 'i' || comprobarVocal == 'o' || comprobarVocal == 'u' ){

            System.out.println("La letra obtenida ("+ comprobarVocal+ ") es una vocal");




        } else System.out.println("La letra obtenida (" + comprobarVocal + ") no es una vocal");

    }


}
