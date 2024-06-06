package main;

import BaseDatosFunciones.BDFunciones;
import utilidades.MenuPrincipal;

public class App {
    public static boolean programaEncendido = true;

    public static void main(String[] args) throws Exception {
        BDFunciones.cargarDatosDesdeBD();
        while (programaEncendido) {
            
            
            MenuPrincipal.menuPrincipal();

        }







    }
}
