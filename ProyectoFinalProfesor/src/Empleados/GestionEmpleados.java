package Empleados;

import java.util.Iterator;

import AplanamientoObjetos.MiObjectOutputWriter;
import BaseDatosFunciones.BDFunciones;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

import excepciones.EmpleadoNoEncontradoException;
import excepciones.FailedCreateEmpleado;
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
            if (empleadoActual.identificador != null) {
                mapaEmpleadosId.put(empleadoActual.getIdentificador(), empleadoActual);
            }
            
        }
    }




    /**
     * No está desarrollado porque se ha optado por usar la base de datos para obtener los IDs (Impredecible)
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
     * @throws SalarioInvalidoException 
     */
    public static void agregarEmpleadoTemporal() throws FailedCreateEmpleado, SalarioInvalidoException{
        EmpleadoTemporal empTempCreado = null;
        try {
            empTempCreado = new EmpleadoTemporal();
            
        } catch (FailedCreateEmpleado e) {
            throw e;
        }

        
        BDFunciones.realizarCommitBD();
        listaEmpleados.add(empTempCreado);
        
    }

    /**
     * Agrega un Gerente generalista con unos parámetros definidos (Para debug)
     * @param empleado
     * @throws FailedCreateEmpleado 
     * 
     */
    public static void agregarEmpleadoGerenteDefault(Gerente empleado,int opcionEjemplo) throws FailedCreateEmpleado{

        
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
     * @throws SalarioInvalidoException 
     *
     */
    public static void agregarEmpleadoGerente() throws FailedCreateEmpleado, SalarioInvalidoException{
        Gerente empTempCreado = null;
        try {
            empTempCreado = new Gerente();
        } catch (FailedCreateEmpleado e) {
            throw e;
        }

        BDFunciones.realizarCommitBD();
        listaEmpleados.add(empTempCreado);
        
    
    }

    /**
     * Elimina empleados recogiendo una ID. Utiliza un iterador para evitar excepciones recorriendo el ArrayList
     * @param id
     * @throws EmpleadoNoEncontradoException 
     */
    public static void eliminarEmpleado() throws EmpleadoNoEncontradoException{
        Empleado empleadoActual = null;
        Iterator<Empleado> it = listaEmpleados.iterator();
        System.out.println("Introduce la ID del empleado a eliminar:");
        Integer idInput = EntradaSalida.getInteger();
        //Recorre el arraylist de los Empleados y busca el que coincide
       while (it.hasNext()) {
            empleadoActual = it.next();
            if (empleadoActual.identificador == idInput) {
                it.remove();
                break;
            }
        }

        // Para evitar eliminar en la base de datos si no se encuentra o que de error porque el empleado está inicializado en null
        if (empleadoActual == null) {
            throw new EmpleadoNoEncontradoException("No se ha podido encontrar el empleado a borrar");
        }

        BDFunciones.eliminarEmpleadoBD(empleadoActual); //El empleado que tiene que pasar es el que coincide en el momento que encuentra el ID
        BDFunciones.realizarCommitBD();


        //FALTA QUE LO REFLEJE EN LA BASE DE DATOS
    }

    /**
     * Busca y lista empleados recogiendo una ID
     * @param idInput (Integer) Se pide un valor a través de EntradaSalida que es la ID a buscar
     * @param printearEmpleado (boolean) true para mostrar el empleado, false para no mostrarlo
     */
    public static Empleado buscarEmpleado(boolean printearEmpleado){
        Empleado empleadoEncontrado = null;
        System.out.println("Introduce una ID para buscar un empleado");
        Integer idInput = EntradaSalida.getInteger();

        //Recorre el arraylist de los Empleados y busca el que coincide
        for (Empleado empleadoActual : listaEmpleados) {
            //Recorre el arraylist de los Empleados y busca el que coincide
                if (empleadoActual.identificador == idInput) {
                    empleadoEncontrado = empleadoActual;
                    if (printearEmpleado) {
                        System.out.println(empleadoActual.toString()); // OPCIONAL EL MOSTRAR EL EMPLEADO
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

    /**
     *  Muestra la cantidad de empleados que hay en el Arraylist listaEmpleados
     * @return (Integer) el número de empleados contenidos en el Arraylist listaEmpleados
     */
    public static Integer contarEmpleados(){
        return listaEmpleados.size();
    }

    public static Integer contarEmpleadosTemporales(){
        Integer contadorTemporales = 0;
        for (Empleado empleadoTemporal : listaEmpleados) {
            if (empleadoTemporal.getClass().getSimpleName().matches("EmpleadoTemporal")) {
                contadorTemporales+=1;
            }
        }
        return contadorTemporales;
    }

    public static Integer contarEmpleadosGerentes(){
        Integer contadorGerentes = 0;
        for (Empleado empleadoGerente : listaEmpleados) {
            if (empleadoGerente.getClass().getSimpleName().matches("Gerente") ) {
                contadorGerentes+=1;
            }
        }
        return contadorGerentes;
    }
    

    /**
     * Un método que dependiendo de si existe un fichero o no en un directorio, crea un fichero con el objeto listaEmpleados
     * dentro a través de un MiObjectOutputWriter o un ObjectOutputStream para poder leer más de un objeto de dentro del fichero
     * Utiliza un BufferedOutputStream
     * @throws IOException
     */
    public static void aplanarArraylistOutput() throws IOException{

        //Usar la ruta sin "/" como root porque tomará la de la raíz de linux y ahí no tengo permisos para escribir
        // Dará IO exception
        File fichero = new File("src/OutputArchivos/empleados.ddr");
  
        
        if (fichero.exists()) {
            //El parámetro de true sirve para indicar que escribirá al final del fichero y no al inicio
            FileOutputStream fileOutputSt = new FileOutputStream(fichero, true);
            BufferedOutputStream bufferedOutputSt = new BufferedOutputStream(fileOutputSt);

            //Utiliza mi Clase custom MiObjectOutputWriter para crear el objectWriter
            MiObjectOutputWriter objectWriterStreamCustom = new MiObjectOutputWriter(bufferedOutputSt);    
            objectWriterStreamCustom.writeObject(listaEmpleados);
            objectWriterStreamCustom.close();

        }else{

    

            //El parámetro de true sirve para indicar que escribirá al final del fichero y no al inicio
            FileOutputStream fileOutputSt = new FileOutputStream(fichero, true);
            BufferedOutputStream bufferedOutputSt = new BufferedOutputStream(fileOutputSt);

            //Utiliza la clase por defecto ObjectOutputStream para crear el objectWriter
            ObjectOutputStream objectWriterStream = new MiObjectOutputWriter(bufferedOutputSt);    
            objectWriterStream.writeObject(listaEmpleados);
            objectWriterStream.flush();
            objectWriterStream.close();
        }

        

        

    }
 
    
    /**
     * Un método que dependiendo de si existe un fichero o no en un directorio, lee de este objeto un arraylist guardado como binario y sobreescribe listaEmpleados
     * por sus valores
     * Utiliza un BufferedInputStream
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void aplanarArraylistLectura() throws IOException, ClassNotFoundException{
        ArrayList<Empleado> listaEmpleadosLectura1;
        ArrayList<Empleado> listaEmpleadosLectura2;
        //Usar la ruta sin "/" como root porque tomará la de la raíz de linux y ahí no tengo permisos para escribir
        // Dará IO exception
        File ficheroLectura = new File("src/OutputArchivos/empleados.ddr");
  
        
        //El parámetro de true sirve para indicar que escribirá al final del fichero y no al inicio
        InputStream fileInputSt = new FileInputStream(ficheroLectura);
        BufferedInputStream bufferedInputSt = new BufferedInputStream(fileInputSt);

        //Utiliza mi Clase custom MiObjectOutputWriter para crear el objectWriter
        ObjectInputStream objetoInputSt = new ObjectInputStream(bufferedInputSt);  //Aquí un error
        listaEmpleadosLectura1 = (ArrayList)objetoInputSt.readObject();
        
        //listaEmpleadosLectura2 = (ArrayList)objetoInputSt.readObject();
        
        objetoInputSt.close();

        System.out.println("[ARRAYLIST 1]" + listaEmpleadosLectura1.toString());

        //System.out.println("[ARRAYLIST 2]" + listaEmpleadosLectura2.toString());

        

        

        

    }
















}