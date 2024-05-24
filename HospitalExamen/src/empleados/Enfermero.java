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

    @Override
    public double calcularSueldoFinal(){
        // Variable para simplificar la lectura de los porcentajes
        double sueldoEnfermero = tablaSueldos.get(categoriaProfesional);
        double totalSueldo = sueldoEnfermero;

        if(tablaPorcentajeSuplementos.containsKey(servicio)){
            //Calculo del valor extra del servicio
            totalSueldo += sueldoEnfermero*tablaPorcentajeSuplementos.get(servicio)/100;
        }

        //Calculo del valor extra por explotado
        if (turnicidad) {
            totalSueldo += sueldoEnfermero*PORCENTAJE_TURNICIDAD/100;
        }

        return totalSueldo;
    }

    public static int getNumeroTotalEnfermeros() {
        return numeroTotalEnfermeros;
    }

    public static void setNumeroTotalEnfermeros(int numeroTotalEnfermeros) {
        Enfermero.numeroTotalEnfermeros = numeroTotalEnfermeros;
    }
}