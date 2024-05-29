package Empleados;

import utilidades.EntradaSalida;
import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * Empleado
 * Clase abstracta que envuelve a los empleados contratados de forma temporal y a los gerentes. No se puede instanciar
 */
public abstract class Empleado implements Prestaciones, Serializable{
    
    protected String nombre = null;
    protected String apellido = null;
    protected String identificador = null;
    protected Double salario;
    protected static int contadorIds = 0;  //para IDs únicas cuando no son reutilizables
    


    /** usadasIds
     * @description Almacena las IDs que están siendo usadas en este momento
     * */    
    private static final Set<String> usadasIds = new HashSet<>();

    /** disponiblesIds
     * @description Guarda las IDs disponibles para ofrecer a los nuevos empleados
     */
    private static final Queue<String> disponiblesIds = new LinkedList<>();


    public Empleado(){
        nombre = EntradaSalida.getString();
        apellido = EntradaSalida.getString();
        salario = EntradaSalida.getDouble();
        identificador = generarCodigoEmpleadoLocal();

    }

    /**
     * 
     * @param nombreEmpleado (String)
     * @param apellidoEmpleado (String)
     * @param salarioEmpleado (float)
     */
    public Empleado(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado){
        nombre = nombreEmpleado;
        apellido = apellidoEmpleado;
        salario = salarioEmpleado;
        identificador = generarCodigoEmpleadoLocal(); // CAMBIAR POR EL DE LA BASE DE DATOS
        
    }

    /**Clase abstracta para implementar en las subclases y permitir calcular sus prestaciones */
    public abstract Double calcularPrestacion();

    
    /**
     * Genera un código basado en la letra de la categoría profesional, que asigna al entrar y un número random de 5 cifras
     * @return (String) 
     */
    private String generarCodigoEmpleadoLocal(){
        String codigoEmpleadoTemp = "";


        String parteUnica;
        // Re-usa las Ids que están disponibles si es posible y si no genera una nueva
        if (!disponiblesIds.isEmpty()) {
            parteUnica = disponiblesIds.poll();
        } else {
            if (contadorIds == 999999) { //Se asegura de que no creemos más de las IDs posibles con 5 cifras
                throw new IllegalStateException("No se pueden generar más códigos, se ha alcanzado el límite");
            }
    
            do {
                parteUnica = String.format("%06d", contadorIds++ % 1000000); // Formatea rellenando con 0s una longitud de 5 cifras, asegurándose de que tiene 5 cifras usando modulo
            } while (usadasIds.contains(parteUnica));
        }


        usadasIds.add(parteUnica); // Añade al set de usadas la ID generada pero solo la parte variable
        codigoEmpleadoTemp += parteUnica; // Suma al string la parte nueva




        return codigoEmpleadoTemp;
    }
    
}