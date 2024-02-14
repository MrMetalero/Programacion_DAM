package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean programaEncendido = true;
        Integer opcionElegida = -1;

        Lavadora.rellenarLetras();

        do {
            System.out.println("Elige una opción del menú introduciendo el numero correspondiente:\n "
            +"1. Agregar una lavadora\n"
            +"2. Buscar una lavadora determinada por el modelo, si existe, y mostrarla.\n"
            +"3. Modificar el precio base de una lavadora determinada por el modelo, si existe, y mostrarla.\n"
            +"4. Eliminar una lavadora determinada por el modelo, si existe, y mostrarla.\n"
            +"5. Mostrar todas las lavadoras de la tienda.\n"
            +"6. Salir\n"
            );
            opcionElegida = sc.nextInt();


            switch (opcionElegida) {
                case 1:
                    System.out.println("Introduce los datos para una lavadora (Si no se introducen se creará con valores por defecto): ");
                    Tienda.agregarLavadora();
                break;

                case 2:
                    System.out.println("Introduce el nombre del modelo de la lavadora a buscar: ");

                break;

                case 3:
                    System.out.println("Introduce el nombre del modelo de la lavadora para modificar su precio base: ");
                    
                break;

                case 4:

                break;

                case 5:
                    System.out.println(Tienda.arrayLavadora.toString());

                break;

                case 6:
                    System.out.println("Apagando el programa...");
                    programaEncendido = false;
                break;

                default:
                   System.out.println("El numero elegido no es correcto, introduce un número válido");
          
                break;
            }

        } while (programaEncendido == true);

    }

}