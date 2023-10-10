package ejercicios_propuestos_t5;

import java.util.Scanner;

public class Ejercicio7 {
    
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n; 


        System.out.print("Introduce un número para pasar a romano : ");
        n = sc.nextInt();

        while (n < 0 || n > 3999) {
            System.out.println("Entrada incorrecta, por favor introduce un número entre 1 y 3999");
            n = sc.nextInt();
        }

        int miles; 
        int centenas;
        int decenas; 
        int unidades;
        int siguienteNumero = n; 
        String resultado = "";


        //va obteniendo la cantidad de cada posición para luego añadir según la cantidad
        // una letra u otra hasta el 9 en romano para cada caso

        miles = siguienteNumero / 1000; 
        siguienteNumero = siguienteNumero % 1000;  


        centenas = siguienteNumero / 100; 
        siguienteNumero = siguienteNumero % 100; 


        decenas = siguienteNumero / 10; 
        siguienteNumero = siguienteNumero % 10; 

        
        unidades = siguienteNumero;

        //hemos evitado salir del rango de 1-3999 preguntando arriba que se repita el input si es incorrecto
        for (int i = 1; i <= miles; i++) {
            resultado += "M";
        }
        switch (centenas) {
            case 1:
                resultado += "C";
                break;
            case 2:
                resultado += "CC";
                break;
            case 3:
                resultado += "CCC";
                break;
            case 4:
                resultado += "CD";
                break;
            case 5:
                resultado += "D";
                break;
            case 6:
                resultado += "DC";
                break;
            case 7:
                resultado += "DCC";
                break;
            case 8:
                resultado += "DCCC";
                break;
            case 9:
                resultado += "CM";
                break;
        }
        switch (decenas) {
            case 1:
                resultado += "X";
                break;
            case 2:
                resultado += "XX";
                break;
            case 3:
                resultado += "XXX";
                break;
            case 4:
                resultado += "XL";
                break;
            case 5:
                resultado += "L";
                break;
            case 6:
                resultado += "LX";
                break;
            case 7:
                resultado += "LXX";
                break;
            case 8:
                resultado += "LXXX";
                break;
            case 9:
                resultado += "XC";
                break;
        }
        switch (unidades) {
            case 1:
                resultado += "I";
                break;
            case 2:
                resultado += "II";
                break;
            case 3:
                resultado += "III";
                break;
            case 4:
                resultado += "IV";
                break;
            case 5:
                resultado += "V";
                break;
            case 6:
                resultado += "VI";
                break;
            case 7:
                resultado += "VII";
                break;
            case 8:
                resultado += "VIII";
                break;
            case 9:
                resultado += "IX";
                break;
        }
        
        System.out.println("El número " + n + " es en romano = " + resultado);
    }

}
