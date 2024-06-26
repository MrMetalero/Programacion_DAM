package Empleados;

/**
 * Prestaciones, una interfaz para usar en Empleado y que el resto de clases necesiten implementar el método
 */
public interface Prestaciones {

    public Double calcularPrestacion();

    public void calcularVacaciones();

    public void calcularBonificaciones();
}