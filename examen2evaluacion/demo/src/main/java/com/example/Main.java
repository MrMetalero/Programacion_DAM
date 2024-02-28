package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean encendidoPrograma = true;
        Integer opcionElegida = 9;

        Triangulo tri1Equilatero = new Triangulo(20.0, 10.0);
        Triangulo tri1Isosceles = new Triangulo(20.0,18.0, 10.0);

        

        Figura.dibujoCaracter.put(1, '*');
        Figura.dibujoCaracter.put(2, '$');
        Figura.dibujoCaracter.put(3, '@');
        Figura.dibujoCaracter.put(4, '&');
        Figura.dibujoCaracter.put(5, '€');


        System.out.println(tri1Equilatero.toString()); 

        System.out.println(tri1Isosceles.toString());
        // System.out.println("\nEl mapeo de los elementos del hashmap es: " + Figura.dibujoCaracter.toString());

        
        // c² = a²+b²;
        // c²-a² = b²
        // c²-b² = a²

        // Double ladoPruebaa = 5.0 * 5.0;
        // Double ladoPruebab = 6.244997998398398 * 6.244997998398398;
        // Double ladoPruebac = 8.0 * 8.0;
        // Double resultado = ladoPruebac-ladoPruebab;

        // System.out.println( resultado + "resultado entre 2 = " + Math.sqrt(resultado) );


        do {
            System.out.println("Introduce una de las opciones: "
                    + "ACCIONES\n"
                    + "[1] Agregar una figura\n"
                    + "[2] Consultar el número de figuras creadasn"
                    + "[3] Mostrar todas las figuras, indicando la información:\n"
                    + "[4] Mostrar la figura de la posición seleccionada, indicando\n"
                    + "[5] Modificar los datos de la figura de la posición seleccionada y mostrar los cambios:\n"
                    + "[6] Eliminar la figura de la posición seleccionada y mostrar un mensaje indicando el tipo de figura eliminado\n"
                    + "[7] Vaciar la colección, previa confirmación por parte del usuario de dicha operación\n"
                    + "[8] Salir\n"
                    );

            opcionElegida = sc.nextInt();
            
            switch (opcionElegida) {
                case 1:
                    
                    System.out.println("Qué figura?" +"Introduce una de las opciones: "
                    + "[1] Triángulo\n"
                    + "[2] Rectángulo\n"
                    + "[3] Trapecio\n"
                    + "[4] Hexágono\n");

                    Integer opcionesCrear = sc.nextInt();
                    
                    CrearFigura.funCrearTriangulo(opcionesCrear);



                break;

                case 2:
                    System.out.println("Num de figuras creadas: " + CrearFigura.misFiguras.size());
                    
                break;


                case 3:
                    for (int i = 0; i < CrearFigura.misFiguras.size(); i++) {
                        CrearFigura.misFiguras.get(i).toString();

                    }
                break;

                case 4:
                //Usar get  con un scanner y soutear el .toString del objeto que sea
                break;


                case 5:
                    //igual que en el caso 4 pero antes de hacer toString, se cambian los valores del objeto al que se ha accedido
                break;



                case 6:
                
                break;


                case 7:
                
                break;

                case 8:
                    encendidoPrograma = false;
                break;
            
                default:
                    encendidoPrograma = false;
                    break;
            }

        } while (encendidoPrograma == true);



    }
}