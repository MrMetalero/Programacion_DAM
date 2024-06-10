package main;
import figuras.Cuadrado;
import figuras.Lienzo;
import utilidades.EntradaSalida;
import utilidades.MostrarMenu;

public class App {
    public static void main(String[] args) throws Exception {
    MostrarMenu mostrarMenuPrincipal = new MostrarMenu();
        Thread menuThread = new Thread(mostrarMenuPrincipal);
        
        Cuadrado cuadrado1 = new Cuadrado(4, new Lienzo(8, 8));
       



        System.out.println();

        



      
    
        
    }
}
