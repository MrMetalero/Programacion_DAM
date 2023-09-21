import java.util.*;



public class ejercicio7 {
    



public static void main(String[] args){

    double radio;
    double diametro;
    double circunferencia;
    double area;
    double pi = 3.14;


    int control;
    Scanner sc = new Scanner(System.in);



    System.out.println("Introduce un número");
    radio = sc.nextDouble();

    System.out.println("Pulsa 1 para calcular el diametro \n"
                        + "Pulsa 2 para calcular el circunferencia \n"
                        + "Pulsa 3 para calcular el area \n"
    
    );
    switch(control = sc.nextInt()){

        case 1: diametro = radio * 2; System.out.println(diametro);
        break;

        case 2: circunferencia = (radio * 2) * pi; System.out.println(circunferencia);
        break;

        case 3: area = (radio * radio) * pi ; System.out.println(area);
        break;

        default: System.out.println("Opción no válida");
        

    }







}















}
