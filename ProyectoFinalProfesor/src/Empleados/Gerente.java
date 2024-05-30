package Empleados;

import excepciones.SalarioInvalidoException;
import utilidades.EntradaSalida;

/**
 * Gerente
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente() throws SalarioInvalidoException{
        super();
        departamento = EntradaSalida.getString();
        
    }

    public Gerente(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado, String departamentoEmpleado) throws SalarioInvalidoException{
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado);
        departamento = departamentoEmpleado;

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

    
}