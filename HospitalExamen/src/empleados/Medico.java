package empleados;
/**
 * Medico
 */
public class Medico extends EmpleadoHospital {

    private static int numeroTotalMedicos = 0;
    public final static int GUARDIAS_MAXIMAS = 5;
    private int numeroGuardias;

    public Medico(){
        super();
        
        this.categoriaProfesional = tablaCategoriaProf.get(1);
        numeroTotalMedicos += 1;
    }
    

  

    
}