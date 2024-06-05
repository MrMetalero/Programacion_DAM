import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        
        int numeroRandom;
        String pathFile = "resources/archivo.bin";
        System.out.println("Introduce un número:");

        try {
            
            EscribirDatos.Escribir(NumeroRandom.funcionNumeroRandom(100), pathFile);


        } catch (FileNotFoundException e) { 
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }
        






    }
}
