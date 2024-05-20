package empleados;
import main.EntradaSalida;

/**
 * Auxiliar
 */
public class Auxiliar extends EmpleadoHospital {

    
    private static int numeroTotalAuxiliares = 0;
    private  boolean esDiscapacitado;

    public Auxiliar()throws Exception{
        super();
        
        esDiscapacitado = EntradaSalida.getBoolean();
        numeroTotalAuxiliares += 1;
    }

}