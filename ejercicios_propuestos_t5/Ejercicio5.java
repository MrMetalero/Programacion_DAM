package ejercicios_propuestos_t5;

public class Ejercicio5 {
    public static void main(String[] args) {
    
        int operador1 = 1;
        int operador2 = 1;
        int controlTablas = 10;


        System.out.println("Tabla del 1\n*************");
        while(controlTablas != 0){
            System.out.println(operador1 + " x "+ operador2 + " = " + (operador1*operador2));
            

            operador2 += 1;
            controlTablas -=1;
        }

    }

}
