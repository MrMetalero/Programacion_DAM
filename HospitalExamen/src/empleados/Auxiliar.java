package empleados;
import main.EntradaSalida;


/**
 * Auxiliar
 */
public class Auxiliar extends EmpleadoHospital {

    
    private static int numeroTotalAuxiliares = 0;
    private boolean esDiscapacitado;

    public Auxiliar(){
        super();

        this.categoriaProfesional = tablaCategoriaProf.get(3);

        try {
            esDiscapacitado = EntradaSalida.getBoolean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        numeroTotalAuxiliares += 1;
    }

}