package empleados;
import main.EntradaSalida;


/**
 * Auxiliar
 */
public class Auxiliar extends EmpleadoHospital {

    
    private static int numeroTotalAuxiliares = 0;
    private boolean esDiscapacitado;
    private final double PORCENTAJE_DISCAPACIDAD = 3;

    public Auxiliar(){
        super();

        this.categoriaProfesional = tablaCategoriaProf.get(3);

        try {
            System.out.println("¿Es discapacitado?");
            esDiscapacitado = EntradaSalida.getBoolean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        numeroTotalAuxiliares += 1;


    }


    @Override
    /**Calcula el sueldo total del empleado Auxiliar */
    public double calcularSueldoFinal(){
        // Variable para simplificar la lectura de los porcentajes
        double sueldoAuxiliar = tablaSueldos.get(categoriaProfesional);
        double totalSueldo = sueldoAuxiliar;

        //Si el servicio se encuentra dentro de el HashMap de los servicios con extras
        if(tablaPorcentajeSuplementos.containsKey(servicio)){
            //Calculo del valor extra del servicio
            totalSueldo += sueldoAuxiliar*tablaPorcentajeSuplementos.get(servicio)/100;
            
            

        }

        //Calculo del valor extra por subnormal
        if (esDiscapacitado) {
            totalSueldo += sueldoAuxiliar*PORCENTAJE_DISCAPACIDAD/100;
        }

        //Calculo del valor extra por explotado
        if (turnicidad) {
            totalSueldo += sueldoAuxiliar*PORCENTAJE_TURNICIDAD/100;
        }

        return totalSueldo;
    }


}