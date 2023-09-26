package ejerciciosresueltos2;

public class Ejercicio2 {



public static void main(){


/* 

     1 En Java generalmente un programa consta de varias clases las cuales se compilan en un
     único fichero.

        --True--

     2 El método main puede ser static o no. En caso de no ser static puede haber varios en un
     mismo programa.
        --True-- Lo acabo de comprobar

     3 Los métodos y funciones difieren en Java en que los primeros no devuelven ningún valor
        --True--

     4 Es posible hacer byte a = 200;. El único problema es que como una variable byte
     solamente almacena hasta el valor 127 la variable a valdrá solo 127
        --False--


*/ 

// Ejercicio 4 explicación
byte a = 0b010101;
byte b = 200;
byte c = 0b10000000;
byte d = 0b01111111;
byte e = 127;
// Es False porque no puedo convertir un valor int como 200
// a un valor byte, que la forma que he encontrado de expresarlo es
// usando el prefijo 0b y valores en binario y escribirlo en decimal hasta 127
// Además he puesto varias pruebas para comprobar que efectivamente
// no se puede poner más de 127 (d) en este tipo de variable,
// puesto que si nos pasamos a 128 da error y nos dice que es un int





}



    
}
