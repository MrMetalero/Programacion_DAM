package empleados;
import main.EntradaSalida;


/**
 * Auxiliar
 */
public class Auxiliar extends EmpleadoHospital {

    
    private static int numeroTotalAuxiliaresCreados = 0;
    private boolean esDiscapacitado;
    private final double PORCENTAJE_DISCAPACIDAD = 3;
    

    public Auxiliar(){
        super(tablaCategoriaProf.get(3));

        try {
            System.out.println("¿Es discapacitado?");
            esDiscapacitado = EntradaSalida.getBoolean();
        } catch (Exception e) {
            e.printStackTrace();
        }

        numeroTotalAuxiliaresCreados += 1;


    }


    public static int getnumeroTotalAuxiliaresCreados() {
        return numeroTotalAuxiliaresCreados;
    }


    public static void setnumeroTotalAuxiliaresCreados(int numeroTotalAuxiliaresCreados) {
        Auxiliar.numeroTotalAuxiliaresCreados = numeroTotalAuxiliaresCreados;
    }


    public boolean isEsDiscapacitado() {
        return esDiscapacitado;
    }


    public void setEsDiscapacitado(boolean esDiscapacitado) {
        this.esDiscapacitado = esDiscapacitado;
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