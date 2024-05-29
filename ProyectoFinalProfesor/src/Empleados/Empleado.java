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
    public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    protected String nombre = null;
    protected String apellido = null;
    protected String identificador = null;
    protected double salario;
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
        identificador = generarCodigoEmpleado();

    }

    public Empleado(String nombreEmpleado, String apellidoEmpleado, String identificadorEmpleado, float salarioEmpleado){
        nombre = nombreEmpleado;
        apellido = apellidoEmpleado;
        identificador = identificadorEmpleado;
        salario = salarioEmpleado;
        identificador = generarCodigoEmpleado();
        
    }

    /**Clase abstracta para implementar en las subclases y permitir calcular sus prestaciones */
    public abstract double calcularPrestacion();

    
    /**
     * Genera un código basado en la letra de la categoría profesional, que asigna al entrar y un número random de 5 cifras
     * @return (String) 
     */
    private String generarCodigoEmpleado(){
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