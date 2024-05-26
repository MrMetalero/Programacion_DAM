package empleados;

import main.EntradaSalida;

/**
 * Medico
 */
public class Medico extends EmpleadoHospital {

    private static int numeroTotalMedicosCreados = 0;
    public final static int GUARDIAS_MAXIMAS = 5;
    private int numeroGuardias;

    public Medico(){
        super();
        
        this.categoriaProfesional = tablaCategoriaProf.get(1);
        
        
        // Estableces manualmente el numero de guardias y se repite si fallas
        try {
            setNumeroGuardias();
        } catch (Exception e) {
            e.printStackTrace();
        }


        
        numeroTotalMedicosCreados += 1;
    }
    
    public static int getnumeroTotalMedicosCreados() {
        return numeroTotalMedicosCreados;
    }

    public static void setnumeroTotalMedicosCreados(int numeroTotalMedicosCreados) {
        Medico.numeroTotalMedicosCreados = numeroTotalMedicosCreados;
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

        //Calculo del valor extra por explotado       
        if (turnicidad) {
            totalSueldo += sueldoMedico*PORCENTAJE_TURNICIDAD/100;
        }

        return totalSueldo;
    }

    /**Establece el número de guardias que realiza un médico
     * 
     *  @numeroGuardiasInterno recibe un numero por EntradaSalida, si es mayor que GUARDIAS_MAXIMAS se vuelve a llamar a si mismo
     * 
     */
    public void setNumeroGuardias() throws Exception {
        int guardiasActuales = this.numeroGuardias;
        System.out.println("Introduce el número de guardias");
        this.numeroGuardias = EntradaSalida.getInt();

        if (numeroGuardias > GUARDIAS_MAXIMAS) {
            numeroGuardias = guardiasActuales;

            setNumeroGuardias();
        }
    }

    /**Devuelve el numero de guardias de un empleado */
    public int getNumeroGuardias(){
        return this.numeroGuardias;
    }
    
}