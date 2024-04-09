import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {

        
        Vehiculo vehiculo1 = new Vehiculo("13121", "Seat", "Leon", 123.0)

        FileInputStream fis = new FileInputStream("resources/vehiculos.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        FileOutputStream fos = new FileOutputStream("resources/vehiculos.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        


    }
}
