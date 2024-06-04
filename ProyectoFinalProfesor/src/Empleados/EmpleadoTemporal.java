package Empleados;

import java.io.Serializable;

import BaseDatosFunciones.BDFunciones;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;

/**
 * EmpleadoTemporal
 */
public class EmpleadoTemporal extends Empleado implements Serializable {

    /**
     * Constructor de EmpleadoTemporal que pide los datos al usuario a través de EntradaSalida y utiliza BDFunciones para replicar la creación del objeto en la Base de Datos
     * @throws SalarioInvalidoException 
     * @throws Exception
     */
    public EmpleadoTemporal() throws FailedCreateEmpleado, SalarioInvalidoException{
        super();
        identificador = BDFunciones.crearEmpleadoTemporalBD(this);

        if (identificador == null) {
            throw new FailedCreateEmpleado("ERROR AL CREAR EL EMPLEADO TEMPORAL, LA ID NO SE PUDO OBTENER");
        }
    }

    /**
     * Constructor de EmpleadoTemporal que recibe argumentos
     * @param nombreEmpleado
     * @param apellidoEmpleado
     * @param salarioEmpleado
     * @throws Exception
     */
    public EmpleadoTemporal(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado) throws Exception{
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado);

        if (identificador == null) {
            throw new Exception("ERROR AL CREAR EL EMPLEADO TEMPORAL, LA ID NO SE PUDO OBTENER");
        }
    }

    /**
     * Constructor de EmpleadoTemporal PARA LA CARGA DE LA BASE DE DATOS que recibe un id
     * @param nombreEmpleado
     * @param apellidoEmpleado
     * @param salarioEmpleado
     * @param id
     * @throws SalarioInvalidoException 
     * @throws Exception
     */
    public EmpleadoTemporal(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado, Integer id) throws FailedCreateEmpleado, SalarioInvalidoException{
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado, id);

        if (identificador == null) {
            throw new FailedCreateEmpleado("ERROR AL CREAR EL EMPLEADO TEMPORAL, LA ID NO SE PUDO OBTENER");
        }
    }


    // HAGO OVERRIDE PORQUE TÉCNICAMENTE CADA MÉTODO CALCULARIA SUS COSAS DE FORMA DISTINTA (Como en "calcularPrestacion()" ) ESTO ES POR PONER UN EJEMPLO

    /**Calcula la prestación imaginaria */
    @Override
    public Double calcularPrestacion() {
        Double extraEmpleadoTemporal = 200.0;
        return salario + extraEmpleadoTemporal;
    }

    /**Calcula las vacaciones imaginarias */
    @Override
    public void calcularVacaciones() {
        System.out.println("CALCULANDO VACACIONES FICTICIAS BLABLABLA");
    }

    /**Calcula las bonificaciones imaginarias */
    @Override
    public void calcularBonificaciones() {
        System.out.println("CALCULANDO BONIFICACIONES FICTICIAS BLABLABLA");
    }

    
}