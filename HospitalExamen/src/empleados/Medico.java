package empleados;



/**
 * Medico
 */
public class Medico extends EmpleadoHospital implements CalcularSueldoFinal {

    private static int numeroTotalMedicos = 0;
    public final static int GUARDIAS_MAXIMAS = 5;
    private int numeroGuardias;

    public Medico(){
        super();
        
        this.categoriaProfesional = tablaCategoriaProf.get(1);
        numeroTotalMedicos += 1;
    }
    
    @Override
    /**Calcula el sueldo total del empleado Médico */
    public double calcularSueldoFinal(){
        // Variable para simplificar la lectura de los porcentajes
        double sueldoMedico = tablaSueldos.get(categoriaProfesional);
        double totalSueldo = sueldoMedico;

        //Si el servicio se encuentra dentro de el HashMap de los servicios con extras
        if(tablaPorcentajeSuplementos.containsKey(servicio)){
            //Calculo del valor extra del servicio
            totalSueldo += sueldoMedico*tablaPorcentajeSuplementos.get(servicio)/100;
            
            

        }

        if (turnicidad) {
            totalSueldo += sueldoMedico*PORCENTAJE_TURNICIDAD/100;
        }

        return totalSueldo;
    }



    
}