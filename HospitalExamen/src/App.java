import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;


public class App {
    public static void main(String[] args){
       EmpleadoHospital.tablaCategoriaProf.put('A', 1);
       EmpleadoHospital.tablaCategoriaProf.put('B', 2);
       EmpleadoHospital.tablaCategoriaProf.put('C', 3);
        
       boolean encendidoPrograma = true;

        FrameApp frame = new FrameApp("NombreVentana");
        frame.setTitle("VentanaEjemplo");
        frame.setSize(300, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        while (encendidoPrograma) {
            if (Keyboard.isKeyPressed(KeyEvent.VK_W)) {
                System.out.println("ARRIBA");
            }

            if (Keyboard.isKeyPressed(KeyEvent.VK_D)) {
                System.out.println("DERECHA");
            }

            if (Keyboard.isKeyPressed(KeyEvent.VK_A)) {
                System.out.println("IZQUIERDA");
            }
        

            if (Keyboard.isKeyPressed(KeyEvent.VK_S)) {
                System.out.println("ABAJO");
            }
        }
       

         

       
            
        



    }
}
