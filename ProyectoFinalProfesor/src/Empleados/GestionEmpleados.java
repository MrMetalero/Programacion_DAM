package Empleados;

import java.util.Iterator;

import BaseDatosFunciones.BDFunciones;

import java.util.ArrayList;
import java.util.HashMap;

import excepciones.EmpleadoNoEncontradoException;
import excepciones.SalarioInvalidoException;
import utilidades.EntradaSalida;

/**
 * GestionEmpleados
 */
public abstract class GestionEmpleados {
    public static HashMap<Integer,Empleado> mapaEmpleadosId = new HashMap<Integer,Empleado>();

    public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

    /**Una función para cuando quiero rellenar el hashMap con la relación Empleado-ID 
     * Idealmente llamar a esta función tras cargar la base de datos en el Arraylist
     */
    public static void rellenarHashMap(){
        for (Empleado empleadoActual : listaEmpleados) {
            mapaEmpleadosId.put(empleadoActual.getIdentificador(), empleadoActual);
        }
    }




    /**
     * 
     * @param empleado
     * @return
     */
    public static void agregarEmpleadoTemporalDefault(EmpleadoTemporal empleado, int opcionEjemplo){
        switch (opcionEjemplo) {
            case 1:
                try {
                    EmpleadoTemporal empTempCreado = new EmpleadoTemporal("Empleado_1", "Apellido_1", 0.1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case 2:
                try {
                    EmpleadoTemporal empTempCreado2 = new EmpleadoTemporal("Empleado_2", "Apellido_2", 0.2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case 3:
                try {
                    EmpleadoTemporal empTempCreado3 = new EmpleadoTemporal("Empleado_3", "Apellido_3", 0.3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            break;
        
            default:
            System.out.println("Esa opción no existe Nuh huh");
            break;
        }
    }

    /**
     * Crea y agrega un nuevo EmpleadoTemporal a la base de datos y al Arraylist listaEmpleados
     * @param empleado
     */
    public static void agregarEmpleadoTemporal(){
        EmpleadoTemporal empTempCreado = null;
        try {
            empTempCreado = new EmpleadoTemporal();
        } catch (Exception e) {
    
            e.printStackTrace();
        }
        if (empTempCreado == null) {

            try {
                throw new Exception("Error al Crear el empleado. El empleado es nulo");
            } catch (Exception e) {
                e.printStackTrace();
                BDFunciones.realizarRollback(); 
            }
        }

        BDFunciones.realizarCommitBD();
        listaEmpleados.add(empTempCreado);
        
    }

    /**
     * Agrega un Gerente generalista con unos parámetros definidos (Para debug)
     * @param empleado
     * 
     */
    public static void agregarEmpleadoGerenteDefault(Gerente empleado,int opcionEjemplo){

        
        switch (opcionEjemplo) {
            case 1:
                Gerente empGerenteCreado1;
                try {
                    empGerenteCreado1 = new Gerente("Empleado_1", "Apellido_1", 0.1,"A");
                    empGerenteCreado1.identificador = 666000666;
                    listaEmpleados.add(empGerenteCreado1);
                } catch (SalarioInvalidoException e) {
                    e.printStackTrace();
                }
                
            break;

            case 2:
                try {
                    Gerente empGerenteCreado2 = new Gerente("Empleado_2", "Apellido_2", 0.2,"B");
                    empGerenteCreado2.identificador = 777000777;
                    listaEmpleados.add(empGerenteCreado2);
                } catch (SalarioInvalidoException e) {
                    e.printStackTrace();
                }
                
            break;

            case 3:
                try {
                    Gerente empGerenteCreado3 = new Gerente("Empleado_3", "Apellido_3", 0.3,"C");
                    empGerenteCreado3.identificador = 888000888;
                    listaEmpleados.add(empGerenteCreado3);
                } catch (SalarioInvalidoException e) {
                    e.printStackTrace();
                }
                
            break;
        
            default:
            System.out.println("Esa opción no existe Nuh huh");
            break;
        }

      
    }

    /**
     * Agrega un Gerente al que se le pasan por parámetro los valores a través de funciones de  EntradaSalida.java
     * @param empleado
     *
     */
    public static void agregarEmpleadoGerente(Gerente empleado){
        Gerente empTempCreado = null;

    
    }

    /**
     * Elimina empleados recogiendo una ID. Utiliza un iterador para evitar excepciones recorriendo el ArrayList
     * @param id
     */
    public static void eliminarEmpleado(){
        Iterator<Empleado> it = listaEmpleados.iterator();
        Integer idInput = EntradaSalida.getInteger();
        //Recorre el arraylist de los Empleados y busca el que coincide
       while (it.hasNext()) {
            Empleado empleadoActual = it.next();
            if (empleadoActual.identificador == idInput) {
                it.remove();
            }
        }
    }

    /**
     * Busca y lista empleados recogiendo una ID
     * @param id
     */
    public static Empleado buscarEmpleado(){
        Empleado empleadoEncontrado = null;
        System.out.println("Introduce una ID para buscar un empleado");
        Integer idInput = EntradaSalida.getInteger();

        //Recorre el arraylist de los Empleados y busca el que coincide
        for (Empleado empleadoActual : listaEmpleados) {
            Iterator<Empleado> it = listaEmpleados.iterator();
            //Recorre el arraylist de los Empleados y busca el que coincide
            while (it.hasNext()) {
                empleadoActual = it.next();
                if (empleadoActual.identificador == idInput) {
                    empleadoEncontrado = empleadoActual;
                    empleadoActual.toString(); // OPCIONAL, DESACTIVAR SI HACE FALTA
                }
            }

        }
        //Si no se encuentra el empleado lanza una excepción
        if (empleadoEncontrado == null) {

            try {
                throw new EmpleadoNoEncontradoException("No se ha encontrado el empleado con la ID "+ idInput);
            } catch (EmpleadoNoEncontradoException e) {
                e.printStackTrace();
            }
        }

        return empleadoEncontrado;
    }

    /**Lista los empleados del ArrayList 
     * @Exception Si no hay empleados en el ArrayList listaEmpleados lanza excepción
     */
    public static void listarEmpleados(){

        for (Empleado empleadoActual : listaEmpleados) {

            if (listaEmpleados.size() < 1) {
                try {
                    throw new Exception("No hay empleados en la lista");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                System.out.println(empleadoActual.toString());
        }
    }
    

 
    /**Lista los empleados del ArrayList */
    public static void listarEmpleados(Empleado empleadoEncontrado){

    }
















}