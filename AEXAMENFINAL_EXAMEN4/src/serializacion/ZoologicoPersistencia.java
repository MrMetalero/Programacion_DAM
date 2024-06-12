package serializacion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import animales.Animal;
import excepciones.ArchivoNoEncontradoException;

public class ZoologicoPersistencia {

    private static String rutaFichero = "animales.dat";

    // Método estático para guardar la lista de animales en un fichero
    public static void guardarAnimales(ArrayList<Animal> animales) throws IOException, ArchivoNoEncontradoException {
        File ficheroAnimales = new File(rutaFichero);
        

        FileOutputStream fos = new FileOutputStream(ficheroAnimales);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        ObjectOutputStream oos  = new ObjectOutputStream(bfos);
        
        oos.writeObject(animales);
        oos.flush();

        if (!ficheroAnimales.exists()) {
            oos.close();
            throw new ArchivoNoEncontradoException("No se ha encontrado el archivo");
            
        }
        oos.close();

    }

    // Método estático para cargar la lista de animales desde un fichero
    public static ArrayList<Animal> cargarAnimales() throws ArchivoNoEncontradoException, IOException, ClassNotFoundException  {
        ArrayList<Animal> arrayLectura = new ArrayList<>();

        File ficheroAnimales = new File(rutaFichero);
        if (!ficheroAnimales.exists()) {
            throw new ArchivoNoEncontradoException("No se ha encontrado el archivo");
        }
        FileInputStream fos = new FileInputStream(ficheroAnimales);
        
        BufferedInputStream bfos = new BufferedInputStream(fos);
        ObjectInputStream oos  = new ObjectInputStream(bfos);
        
        arrayLectura = (ArrayList<Animal>) oos.readObject();
        oos.close();

        return arrayLectura;
    }

    // Método dinámico para establecer la ruta del fichero
    public void establecerRutaFichero(String ruta) {
        rutaFichero = ruta+rutaFichero;

    }

    // Método dinámico para obtener la ruta actual del fichero
    public String obtenerRutaFichero() {

        return rutaFichero;
       
    }
}