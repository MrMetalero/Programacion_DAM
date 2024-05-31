package Empleados;

import BaseDatosFunciones.BDFunciones;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;
import utilidades.EntradaSalida;

/**
 * Gerente
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente() throws SalarioInvalidoException, FailedCreateEmpleado{
        super();
        System.out.println("Introduce el departamento del gerente");
        departamento = EntradaSalida.getString();
        identificador = BDFunciones.crearGerenteBD(this);
        
        if (identificador == null) {
            throw new FailedCreateEmpleado("ERROR AL CREAR EL EMPLEADO TEMPORAL, LA ID NO SE PUDO OBTENER");
        }

        
    }

    public Gerente(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado, String departamentoEmpleado) throws SalarioInvalidoException, FailedCreateEmpleado{
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado);
        departamento = departamentoEmpleado;

        if (identificador == null) {
            throw new FailedCreateEmpleado("ERROR AL CREAR EL EMPLEADO TEMPORAL, LA ID NO SE PUDO OBTENER");
        }
    }

   


    @Override
    public Double calcularPrestacion() {
        Double extraGerente = 2000.0;
        return salario + extraGerente;
    }

    @Override
    public void calcularVacaciones() {
        System.out.println("CALCULANDO VACACIONES FICTICIAS BLABLABLA");
    }

    @Override
    public void calcularBonificaciones() {
        System.out.println("CALCULANDO BONIFICACIONES FICTICIAS BLABLABLA");
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " Gerente [departamento= " + departamento + "]";
    }

    
}