import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        File archivo1;
        File archivo2;  
        File archivoFusion;
        
    
       

  


        try {
            System.out.println("Introduce la ruta del archivo 1");
            archivo1 = new File("resources/archivo1.txt"); //Si queremos input del user usar el scanner
            
            
            System.out.println("Introduce la ruta del archivo 2");
            archivo2 = new File("resources/archivo2.txt"); //Si queremos input del user usar el scanner
            
            System.out.println("Introduce la ruta del archivo final");
           

            //comprobación de si existe el archivo
            FusionFicheros.funcionFusion(archivo1.getPath(), archivo2.getPath(),"resources/archivoFusion.txt");



            

        } catch (FileNotFoundException fnf) {
           System.out.println(fnf.getMessage());
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
         }

        



    }
}
