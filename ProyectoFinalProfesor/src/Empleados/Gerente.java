package Empleados;

import utilidades.EntradaSalida;

/**
 * Gerente
 */
public class Gerente extends Empleado {
    private static String departamento;

    public Gerente(){
        super();
        departamento = EntradaSalida.getString();
        
    }

    public Gerente(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado, String departamentoEmpleado){
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado);
        departamento = departamentoEmpleado;

    }


    @Override
    public Double calcularPrestacion() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrestacion'");
    }

    @Override
    public Double calcularVacaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularVacaciones'");
    }

    @Override
    public Double calcularBonificaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularBonificaciones'");
    }

    
}