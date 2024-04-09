import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("resources/binario.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int byteCache;
            byte[] arrayBytes = new byte[bis.available()];
            
          
            arrayBytes = bis.readAllBytes();
                
           
            for (byte b : arrayBytes) {
                System.out.println(b);
                System.out.println((char)b);
            }
    
            bis.close();

            File archivoNuevo = new File("resources/binarioCopia.bin");
        
            FileOutputStream fos = new FileOutputStream("resources/binarioCopia.bin");
            BufferedOutputStream fbos = new BufferedOutputStream(fos);

            fbos.write(arrayBytes, 0, arrayBytes.length);
            fbos.flush();
            fbos.close();




        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        } catch (IndexOutOfBoundsException oob) {
            System.out.println(oob.getMessage());

        }


      

    }
}
