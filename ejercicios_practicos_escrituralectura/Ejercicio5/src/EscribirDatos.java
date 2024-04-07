import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirDatos {
 
    public static void Escribir(int[] numArray, String pahtFile)throws FileNotFoundException, IOException,IndexOutOfBoundsException{
        File archivo1 = new File(pahtFile);
        FileOutputStream fos = new FileOutputStream(pahtFile);
        DataOutputStream dos = new DataOutputStream(fos);
        BufferedOutputStream bdos = new BufferedOutputStream(dos);

        
        int[] intArray = NumeroRandom.funcionNumeroRandom(100);
        byte[] byteArray = new byte[intArray.length];

        for (int i : numArray) { // convierte el array de numeros a array de bytes
            byteArray[i] = (byte)numArray[i]; 

        }


    
        bdos.write(byteArray,(int)archivo1.length(),byteArray.length);
     
        
    
        
        bdos.flush();
        bdos.close();
        
        FileInputStream fis  = new FileInputStream(pahtFile);
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println();
        int charCache;
        while ((charCache = bis.read()) != -1) {
            System.out.println((char)charCache);
        }

    }




}
