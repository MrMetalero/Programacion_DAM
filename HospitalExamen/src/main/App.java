package main;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;

import empleados.EmpleadoHospital;
import main.utilidades.Menu;


public class App {
    public static void main(String[] args){
        boolean encendidoPrograma = true;
        int programaControl = -1;

        //Se rellenan los HashMap con los datos de inicio
        EmpleadoHospital.rellenarHashMaps();
        

        while (encendidoPrograma) {
            
        
            Menu.menuPrincipal();
   

            
        }

        
        



    }
}
