import java.util.*;




public class ejercicio11 {
    
static double Factorial_N(double numX ,double numY){
numY = 1;
double resultado = 1;


for (double i = numX; numX >= numY; numX--){
    
    resultado = resultado * numX;
    

    
}
    

return resultado;
} 






public static void main(String[]args){

double num1;
double num2 = 1;


Scanner sc = new Scanner(System.in);

System.out.println("Introduce un número para calcular los "
                    + "factoriales de los números entre ese "
                    + "número y 1"

);
num1 = sc.nextDouble();

    if (num1 >= num2){
        
        //Se ha utilizado i como varible de control porque
        //a for no le gusta que uses un externa
        for(double i = num1;i >= num2; i--){
        
        System.out.println("El factorial de "+ i +" es: " + Factorial_N(i,num2));
        
        }


    }else System.out.println("Entrada no válida");        




    




}



}
