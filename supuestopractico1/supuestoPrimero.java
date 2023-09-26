package supuestopractico1;

public class supuestoPrimero {
 
public static final int CONSTANTE_AMPLIACION_1 = 1;
public static final String CONSTANTE_AMPLIACION_2 = "Hola soy una cadena";

public static void main(String[]args){

final int CONS_SUPUESTO_1 = 1008;

final String CONS_SUPUESTO_2 = "Saludos";


Integer variableWrapper1 = CONS_SUPUESTO_1;

Integer variableWrapper2 = variableWrapper1;

System.out.println(variableWrapper1 + " " + variableWrapper2 + " " + CONS_SUPUESTO_2);


// Actividad de ampliación 1

System.out.println("Actividad de ampliación 1: "+ CONSTANTE_AMPLIACION_1 + " " + CONSTANTE_AMPLIACION_2);



//Actividad de ampliación 2  | El resultado es d

int b = 9 <<2;
System.out.println("Actividad ampliación 2: "+ b);


//Actividad ampliación 3 | d Todas son incorrectas porque me da 0

b = 16 & 8;
System.out.println("Actividad ampliación 3: "+ b);


//Actividad ampliación 4  | esto da error de compilación


int a = b++ + 13;
System.out.println("Actividad ampliación 4: "+ a);


//Actividad ampliación 5
/* 
 *  $hora no se puede utilizar porque está reservado
 *  1LoveYou  no se puede usar porque empieza por un número
 *  
 * 
 * 
 * 
 * 
*/


int calcula_fecha;






}



}

