package main.utilidades;

import empleados.Auxiliar;
import main.EntradaSalida;

/**
 * MenuCrearEmpleados
 */
public class MenuCrearEmpleados {
   

    public static void menuCrearEmpleados() throws Exception{
        System.out.println("[1] Crear Medico \n"+
                           "[2] Crear Auxiliar \n"+
                           "[3] Crear Enfermero \n"+
                           "[4] Atrás"
        
        );
        int controlMenu = EntradaSalida.getInt();


        switch (controlMenu) {
            case 1:
                crearMedico();
            break;
    
            case 2:
                crearAuxiliar();
            break;


            case 3:
                crearEnfermero();
            break;

            case 4:
            //No hace nada para volver atrás
            break;

            default:
                throw new Exception("Esa opción no existe");
               
        }


    }


    public static void crearMedico(){
        Auxiliar aux1 = new Auxiliar();
    }

    public static void crearAuxiliar(){
            
    }

    public static void crearEnfermero(){
    
    }

}