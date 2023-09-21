import java.util.*;



public class ejercicio8 {
    
        

    static double funcion_X(double radio){

        Scanner scf = new Scanner(System.in);
        double diametro;
        double circunferencia;
        double area;
        double pi = 3.14;
        int control;

        System.out.println("Pulsa 1 para calcular el diametro \n"
                        + "Pulsa 2 para calcular el circunferencia \n"
                        + "Pulsa 3 para calcular el area \n"
    
        );
        switch(control = scf.nextInt()){

            case 1: diametro = radio * 2; System.out.println(diametro);
            break;

            case 2: circunferencia = (radio * 2) * pi; System.out.println(circunferencia);
            break;

            case 3: area = (radio * radio) * pi ; System.out.println(area);
            break;


            default: System.out.println("Opción no válida");
        

        }
        System.out.println("Pulsa 4 para volver al menú");
        control = 0;
        
        while(control != 4){
            control = scf.nextInt();
           
        } 
            


        return 0;
    }



public static void main(String[] args){

    double radio;
    int encendido = 1 ;
    Scanner sc = new Scanner(System.in);

    while(encendido == 1){
        System.out.println("Introduce un número para el radio");
        radio = sc.nextDouble();
        funcion_X(radio);
    }





}















}
