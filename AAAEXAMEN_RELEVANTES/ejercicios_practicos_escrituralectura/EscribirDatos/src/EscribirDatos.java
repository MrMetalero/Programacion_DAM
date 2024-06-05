import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirDatos {
 
    public static void Escribir(int[] numArray, String pathFile)throws FileNotFoundException, IOException,IndexOutOfBoundsException{
        File archivo1 = new File(pathFile);
        FileOutputStream fos = new FileOutputStream(pathFile);
        DataOutputStream dos = new DataOutputStream(fos);
        

        
        int[] intArray = NumeroRandom.funcionNumeroRandom(100);
        

        for (int i : numArray) { 
            dos.writeInt(i);

        }
       
        dos.flush();
        dos.close();
        
        FileInputStream fis = new FileInputStream(pathFile);
        DataInputStream dis  = new DataInputStream(fis);
        

        System.out.println();
        int charCache;
        int contador = 0;
        while ((charCache = dis.readInt()) != -1) {
            contador++;
            System.out.println(contador + "     "+ charCache);

        }

    }




}
