package Empleados;

/**
 * EmpleadoTemporal
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(){
        super();


    }

    public EmpleadoTemporal(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado){
        super(nombreEmpleado,apellidoEmpleado,salarioEmpleado);


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