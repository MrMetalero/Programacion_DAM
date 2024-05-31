package utilidades;

/**
 * MenuCrearEmpleados
 */
public class MenuCrearEmpleados {
   

    public static void menuOpciones() throws Exception{
        System.out.println("[1] Crear  \n"+
                           "[2] Crear Auxiliar \n"+
                           "[3] Crear Enfermero \n"+
                           "[4] Atrás\n"
        );
        int controlMenu = EntradaSalida.getInt();


        switch (controlMenu) {
            case 1:

            break;
    
            case 2:

            break;


            case 3:
              
            break;

            case 4:
            //No hace nada para volver atrás
            break;

            default:
                throw new Exception("Esa opción no existe");
               
        }


    }


}