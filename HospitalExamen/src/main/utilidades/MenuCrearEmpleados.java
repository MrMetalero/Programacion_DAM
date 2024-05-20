package main.utilidades;

import empleados.Auxiliar;
import empleados.EmpleadoHospital;
import empleados.Enfermero;
import empleados.Medico;
import main.EntradaSalida;

/**
 * MenuCrearEmpleados
 */
public class MenuCrearEmpleados {
   

    public static void menuCrearEmpleados() throws Exception{
        System.out.println("[1] Crear Medico \n"+
                           "[2] Crear Auxiliar \n"+
                           "[3] Crear Enfermero \n"+
                           "[4] Atrás\n"
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
        try {
            Medico medicoNuevo = new Medico();
            EmpleadoHospital.listaEmpleados.add(medicoNuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearAuxiliar(){
        try {
            Auxiliar auxiliarNuevo = new Auxiliar();
            EmpleadoHospital.listaEmpleados.add(auxiliarNuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearEnfermero(){
        try {
            Enfermero enfermeroNuevo = new Enfermero();
            EmpleadoHospital.listaEmpleados.add(enfermeroNuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}