package REFACTOR.Refactorizado_trabajo;
import java.util.Scanner;
public class LogicaNumeros {
    //Se ha movido a esta nueva clase
    public static Scanner sc = new Scanner(System.in);
    
    //Se ha movido a esta nueva clase para no estar activas todo el rato
    static int numeroCompararPrimero;
    static int numeroCompararSegundo;
    static int numeroCache = -1;


    //Esta función está más organizada en su propia clase y ahora la podemos llamar desde otras
    // clases o métodos con facilidad y orden
    public static int recibirNumero(){

        //La lógica del programa no ha cambiado
        if (numeroCache == -1) {
            System.out.println("Introduce el primer número para sacar el mayor");
            numeroCompararPrimero = sc.nextInt();
            System.out.println("Introduce el segundo número para sacar el mayor");
            numeroCompararSegundo = sc.nextInt();
       
            if (numeroCompararPrimero > numeroCompararSegundo) {
                numeroCache = numeroCompararPrimero;
                return numeroCompararPrimero;
            }else{
                numeroCache = numeroCompararSegundo;
                return numeroCompararSegundo;
            }
        }else{
            System.out.println("Introduce el segundo número para sacar el mayor");
            numeroCompararSegundo = sc.nextInt();
         
            if (numeroCompararSegundo > numeroCache) {
                numeroCache = numeroCompararSegundo;
                return numeroCompararSegundo;
            }else{
                return numeroCache;
            }
        }
    }



}
