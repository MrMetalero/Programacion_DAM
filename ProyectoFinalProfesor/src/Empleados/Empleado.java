package Empleados;

import utilidades.EntradaSalida;
import java.util.HashSet;
import java.util.Set;

import BaseDatosFunciones.BDFunciones;
import excepciones.FailedCreateEmpleado;
import excepciones.SalarioInvalidoException;

import java.util.Queue;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * Empleado
 * Clase abstracta que envuelve a los empleados contratados de forma temporal y a los gerentes. No se puede instanciar
 */
public abstract class Empleado implements Prestaciones, Serializable{
    
    protected Integer identificador = null;
    protected String nombre = null;
    protected String apellido = null;
    protected Double salario;
    protected static int contadorIds = 0;  //para IDs únicas cuando no son reutilizables (Si construyo IDs locales)
    


    /** usadasIds
     * @description Almacena las IDs que están siendo usadas en este momento LOCAL
     * */    
    private static final Set<String> usadasIds = new HashSet<>();

    /** disponiblesIds
     * @description Guarda las IDs disponibles para ofrecer a los nuevos empleados LOCAL
     */
    private static final Queue<String> disponiblesIds = new LinkedList<>();


    
    /**El constructor para construir un objeto Empleado en sus atributos comunes */
    public Empleado() throws SalarioInvalidoException, FailedCreateEmpleado{
        System.out.println("Introduce un nombre");
        nombre = EntradaSalida.getString();
        System.out.println("Introduce un apellido");
        apellido = EntradaSalida.getString();
        System.out.println("Introduce un salario");
        salario = EntradaSalida.getDouble();
        
        //400 como número arbitrario de salario mínimo hehe
        if (salario < 400) {
            throw new SalarioInvalidoException(apellido);
        }
    }

    /**
     * Constructor de objetos Empleado con los atributos comunes pasados como argumentos
     * @param nombreEmpleado (String)
     * @param apellidoEmpleado (String)
     * @param salarioEmpleado (float)
     * @throws SalarioInvalidoException 
     */
    public Empleado(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado) throws SalarioInvalidoException{
        nombre = nombreEmpleado;
        apellido = apellidoEmpleado;
        salario = salarioEmpleado;

        //400 como número arbitrario de salario mínimo hehe
        if (salario < 400) {
            throw new SalarioInvalidoException(apellido);
        }
    }

        /**
     * Constructor de objetos Empleado PARA LA CARGA DE LA BASE DE DATOS con los atributos comunes pasados como argumentos
     * @param nombreEmpleado (String)
     * @param apellidoEmpleado (String)
     * @param salarioEmpleado (float)
     * @throws SalarioInvalidoException 
     */
    public Empleado(String nombreEmpleado, String apellidoEmpleado, Double salarioEmpleado, Integer id) throws SalarioInvalidoException{
        nombre = nombreEmpleado;
        apellido = apellidoEmpleado;
        salario = salarioEmpleado;
        identificador = id;

        //400 como número arbitrario de salario mínimo hehe
        if (salario < 400) {
            throw new SalarioInvalidoException(apellido);
        }
    }
    

    /**Clase abstracta para implementar en las subclases y permitir calcular sus Prestacion */
    public abstract Double calcularPrestacion();

    /**Clase abstracta para implementar en las subclases y permitir calcular sus Vacaciones */
    public abstract void calcularVacaciones();

    /**Clase abstracta para implementar en las subclases y permitir calcular sus Bonificaciones */
    public abstract void calcularBonificaciones();

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
    

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static int getContadorIds() {
        return contadorIds;
    }

    public static void setContadorIds(int contadorIds) {
        Empleado.contadorIds = contadorIds;
    }

    public static Set<String> getUsadasids() {
        return usadasIds;
    }

    public static Queue<String> getDisponiblesids() {
        return disponiblesIds;
    }

    @Override
    public String toString() {
        return "Empleado [identificador= " + identificador + ", nombre= " + nombre + ", apellido= " + apellido
                + ", salario= " + salario + ", calcularPrestacion()= " + calcularPrestacion() + "]";
    }

}