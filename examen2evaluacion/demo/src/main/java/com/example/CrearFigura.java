package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearFigura {


    public static ArrayList<Figura> misFiguras = new ArrayList<>();
 
    public static void funCrearTriangulo(Integer opcionesCrear){
    Scanner sc = new Scanner(System.in);

        switch (opcionesCrear) {
            case 1:
                Integer controlTriangulo = 2;
                System.out.println("[1] Isosceles o [2] equilatero?");
                  if (controlTriangulo == 1) {
                    System.out.println("Introduce en orden: Base, lado y luego altura  ");
                    Triangulo isosceles = new Triangulo(sc.nextDouble(),sc.nextDouble(), sc.nextDouble());
                    misFiguras.add(isosceles);
                  }else{
                    System.out.println("Introduce en orden: Base y luego altura  ");
                    Triangulo isosceles = new Triangulo(sc.nextDouble(), sc.nextDouble());
                    misFiguras.add(isosceles);

                  }
                

            break;
            
            case 2:
                System.out.println("Introduce en orden: Base y luego altura  ");
                Rectangulo rectangulo = new Rectangulo(sc.nextDouble(), sc.nextDouble());
                misFiguras.add(rectangulo);
            break;

            case 3:
                System.out.println("Introduce en orden: Base grande, base pequeña y luego altura  ");
                Trapecio trapecio = new Trapecio(sc.nextDouble(),sc.nextDouble(), sc.nextDouble());
                misFiguras.add(trapecio);
            break;

            case 4:
                System.out.println("Introduce en orden: Base y luego altura  ");
                Hexagono hexagono = new Hexagono(sc.nextDouble(), sc.nextDouble());
                misFiguras.add(hexagono);

            break;
        
            default:
                 System.out.println("No se ha creado ni añadido nada");
                break;
        }

    }

}
