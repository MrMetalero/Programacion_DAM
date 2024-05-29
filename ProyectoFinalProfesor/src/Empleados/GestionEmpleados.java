package Empleados;

import java.util.Iterator;
import java.util.ArrayList;

import excepciones.EmpleadoNoEncontradoException;

/**
 * GestionEmpleados
 */
public abstract class GestionEmpleados {

    public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    /**
     * 
     * @param empleado
     * @return
     */
    public static void agregarEmpleadoTemporalDefault(EmpleadoTemporal empleado, int opcionEjemplo){
        switch (opcionEjemplo) {
            case 1:
            EmpleadoTemporal empTempCreado = new EmpleadoTemporal("Empleado_1", "Apellido_1", 0.1);

            break;

            case 2:
            EmpleadoTemporal empTempCreado2 = new EmpleadoTemporal("Empleado_2", "Apellido_2", 0.2);

            break;

            case 3:
            EmpleadoTemporal empTempCreado3 = new EmpleadoTemporal("Empleado_3", "Apellido_3", 0.3);
            break;
        
            default:
            System.out.println("Esa opción no existe Nuh huh");
            break;
        }
    }

    /**
     * 
     * @param empleado
     * @return
     */
    public static EmpleadoTemporal agregarEmpleadoTemporal(EmpleadoTemporal empleado){
        EmpleadoTemporal empTempCreado = new EmpleadoTemporal();
        return empTempCreado;
    }

    /**
     * Agrega un Gerente generalista con unos parámetros definidos (Para debug)
     * @param empleado
     * 
     */
    public static void agregarEmpleadoGerenteDefault(Gerente empleado,int opcionEjemplo){

        
        switch (opcionEjemplo) {
            case 1:
                Gerente empGerenteCreado1 = new Gerente("Empleado_1", "Apellido_1", 0.1,"A");
                empGerenteCreado1.identificador = "identificadorEspecial1";
                listaEmpleados.add(empGerenteCreado1);
            break;

            case 2:
                Gerente empGerenteCreado2 = new Gerente("Empleado_2", "Apellido_2", 0.2,"B");
                empGerenteCreado2.identificador = "identificadorEspecial1";
                listaEmpleados.add(empGerenteCreado2);
            break;

            case 3:
                Gerente empGerenteCreado3 = new Gerente("Empleado_3", "Apellido_3", 0.3,"C");
                empGerenteCreado3.identificador = "identificadorEspecial1";
                listaEmpleados.add(empGerenteCreado3);
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
        Gerente empTempCreado = new Gerente();

    
    }

    /**
     * Elimina empleados recogiendo una ID. Utiliza un iterador para evitar excepciones recorriendo el ArrayList
     * @param id
     */
    public static void eliminarEmpleado(String idInput){
        Iterator<Empleado> it = listaEmpleados.iterator();
        //Recorre el arraylist de los Empleados y busca el que coincide
       while (it.hasNext()) {
            Empleado empleadoActual = it.next();
            if (empleadoActual.identificador.equals(idInput)) {
                it.remove();
            }
        }
    }

    /**
     * Busca y lista empleados recogiendo una ID
     * @param id
     */
    public static Empleado buscarEmpleado(String idInput){
        Empleado empleadoEncontrado = null;

        //Recorre el arraylist de los Empleados y busca el que coincide
        for (Empleado empleadoActual : listaEmpleados) {
            Iterator<Empleado> it = listaEmpleados.iterator();
            //Recorre el arraylist de los Empleados y busca el que coincide
            while (it.hasNext()) {
                empleadoActual = it.next();
                if (empleadoActual.identificador.equals(idInput)) {
                    empleadoEncontrado = empleadoActual;
                }
            }

        }
        //Si no se encuentra el empleado lanza una excepción
        if (empleadoEncontrado == null) {

            try {
                throw new Exception("No se ha encontrado el empleado con la ID "+ idInput);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            
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