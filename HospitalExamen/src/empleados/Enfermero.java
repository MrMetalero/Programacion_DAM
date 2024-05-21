package empleados;

/**
 * Enfermero
 */
public class Enfermero extends EmpleadoHospital  {

    private static int numeroTotalEnfermeros = 0;
    

    public Enfermero(){
        super();

        this.categoriaProfesional = tablaCategoriaProf.get(2);
        numeroTotalEnfermeros += 1;
    }

}