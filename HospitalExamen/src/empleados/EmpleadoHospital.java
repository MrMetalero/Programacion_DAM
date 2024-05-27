package empleados;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import main.EntradaSalida;

import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

/**
 * EmpleadoHospital
 * 
 * @param codigoEmpleado (String)identifica al empleado
 * @param categoriaProfesional (Character)muestra la categoría a la que pertenece 
 * @param nombreCompleto (String) nombre del empleado
 * @param servicio (String) la actividad específica que realiza el empleado
 * @param turnicidad (boolean) si realiza turnicidad 
 * @param numeroTotalEmpleadosCreados (int) numero total
 * 
 *
 */
public abstract class EmpleadoHospital implements CalcularSueldoFinal, Comparable<EmpleadoHospital>{

    /**listaEmpleados 
     * @description La lista que recopila todos los usuarios actuales en el sistema 
     */
    public static ArrayList<EmpleadoHospital> listaEmpleados = new ArrayList<EmpleadoHospital>();
    
    /**categoríaProf 
     * @description Enlaza las categorías profesionales con un dígito para el código del empleado
     */
    public static HashMap<Integer,Character> tablaCategoriaProf = new HashMap<Integer,Character>();
    
    /**tablaSueldos 
     * @description Enlaza las categorías profesionales con un dígito para el sueldo del empleado
     */
    public static HashMap<Character,Double> tablaSueldos = new HashMap<Character,Double>();
    
    /**tablaPorcentajeSuplementos 
     * @description Enlaza los servicios con un dígito para el porcentaje de suplemento
     */
    public static HashMap<String,Integer> tablaPorcentajeSuplementos = new HashMap<String,Integer>();

    /** usadasIds
     * @description Almacena las IDs que están siendo usadas en este momento
     * */    
    private static final Set<String> usadasIds = new HashSet<>();

    /** disponiblesIds
     * @description Guarda las IDs disponibles para ofrecer a los nuevos empleados
     */
    private static final Queue<String> disponiblesIds = new LinkedList<>();



    private final String EMPLEADO_ID;
    private final static double SUELDO_BASE_A = 2000;
    private final static double SUELDO_BASE_B = 1800;
    private final static double SUELDO_BASE_C = 1500;
    protected final static double PORCENTAJE_TURNICIDAD = 5;
    
    
    private static int numeroTotalEmpleadosCreados = 0;
    protected static int contadorIds = 0;  //para IDs únicas cuando no son reutilizables
    protected String nombre;
     Character categoriaProfesional;
    protected String servicio;
    protected boolean turnicidad;
    
   
    public EmpleadoHospital(Character categoriaProf){
        //Asigna la categoría profesional recibida a través de el constructor de la clase hija
        this.categoriaProfesional = categoriaProf;
        //Se genera el código del empleado
        EMPLEADO_ID = generarCodigoEmpleado();        

        //Se inicializan los atributos comunes a los valores pasados por el usuario con sus posibles Exceptions
        try {
           
            System.out.println("Introduce el nombre del empleado");
            this.nombre = EntradaSalida.getString();
            System.out.println("Introduce el servicio del empleado");
            this.servicio = EntradaSalida.getString();
            
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Agrega un empleado al contador
        numeroTotalEmpleadosCreados+=1;
        
       
    }
   


    /**
     * Genera un código basado en la letra de la categoría profesional, que asigna al entrar y un número random de 5 cifras
     * @return (String) 
     */
    private String generarCodigoEmpleado(){
        String codigoEmpleadoTemp = "";




        //añaden la letra y el número de la categoría profesional quedan 5 cifras
        codigoEmpleadoTemp += getCategoriaProfesional();
        codigoEmpleadoTemp += buscarNumeroCategoríaProf();



        String parteUnica;
        // Re-usa las Ids que están disponibles si es posible y si no genera una nueva
        if (!disponiblesIds.isEmpty()) {
            parteUnica = disponiblesIds.poll();
        } else {
            if (contadorIds == 99999) { //Se asegura de que no creemos más de las IDs posibles con 5 cifras
                throw new IllegalStateException("No se pueden generar más códigos, se ha alcanzado el límite");
            }
    
            do {
                parteUnica = String.format("%05d", contadorIds++ % 100000); // Formatea rellenando con 0s una longitud de 5 cifras, asegurándose de que tiene 5 cifras usando modulo
            } while (usadasIds.contains(parteUnica));
        }


        usadasIds.add(parteUnica); // Añade al set de usadas la ID generada pero solo la parte variable
        codigoEmpleadoTemp += parteUnica; // Suma al string la parte nueva




        return codigoEmpleadoTemp;
    }

    /**Busca el empleado identificado por ID pasada por el usuario
     * @return (int) Retorna el índice del objeto encontrado para otras funciones
     * @throws Exception Si no se encuentra el ID asociado a ningún miembro de listaEmpleados
     */
    public static int buscarEmpleadoPorId() throws Exception{
        Iterator<EmpleadoHospital> iteradorEmpleados = listaEmpleados.iterator();

        boolean empleadoEncontrado = false;
        String inputUsuarioId = "";
        int encontradoEn = -1;
        
        System.out.println("Introduce el ID del empleado:");

        try {
            inputUsuarioId = EntradaSalida.getString();
        } catch (Exception e) {
            
            e.printStackTrace();
        }


        while (iteradorEmpleados.hasNext()) {
            EmpleadoHospital empleadoActual = iteradorEmpleados.next();

            //Si la ID pasada por parámetro es igual a la del objeto en el iterador
            if (empleadoActual.EMPLEADO_ID.equals(inputUsuarioId)) {
                empleadoEncontrado = true; //para controlar si has introducido un ID erroneo
                encontradoEn = listaEmpleados.lastIndexOf(empleadoActual);
                
                    
                

                
            }
        }

        if (empleadoEncontrado) {
            return encontradoEn;
        }else{
            throw new Exception("Nuh uh! No hay empleado con esa ID");

        }

       

    }

    /**Utiliza buscarEmpleadoporId para encontrar un empleado y muestra sus detalles por pantalla usando .toString del objeto encontrado */
    public static void listarEmpleadoBuscado(){
        try {
            System.out.println(listaEmpleados.get(buscarEmpleadoPorId()).toString()); //Printea los detalles del objeto encontrado por ID
        } catch (Exception e) {
           
            e.printStackTrace();
        }


    }


    /**
     * Elimina un usuario con la ID proporcionado por el usuario y añade a disponiblesIds la ID recién liberada además de quitar de usadasIds la misma ID
     */
    public static void eliminarEmpleado(){
        boolean empleadoEncontrado = false;
        String inputUsuarioId = "";
        System.out.println("Introduce el ID del empleado a eliminar:");
        Iterator<EmpleadoHospital> iteradorEmpleados = listaEmpleados.iterator();

        try {
            inputUsuarioId = EntradaSalida.getString();
        } catch (Exception e) {
            
            e.printStackTrace();
        }


        // Usa el iterador para atravesar el arraylist y que no de error al borrar
        // compara la ID que tiene el objeto y borra el objeto del arraylist si coincide con la ID introducida
        // Además pone en disponible la id borrada y la saca de la lista de IDs usadas
        while (iteradorEmpleados.hasNext()) {
            EmpleadoHospital empleadoActual = iteradorEmpleados.next();
            String posibleIdDisponible;

            if (empleadoActual.EMPLEADO_ID.equals(inputUsuarioId)) {
                empleadoEncontrado = true; //para controlar si has introducido un ID erroneo
                posibleIdDisponible = empleadoActual.EMPLEADO_ID; 
                iteradorEmpleados.remove();
                
                //Añade a las ID disponibles el trozo variable de el empleado eliminado
                disponiblesIds.add(posibleIdDisponible.substring(2)); 

                //Elimina a las ID usadas del trozo variable de el empleado eliminado
                usadasIds.remove(posibleIdDisponible.substring(2));


                
            }
        }


        if (!empleadoEncontrado) {
            System.out.println("Empleado con ID " + inputUsuarioId + " no encontrado");

        }

    }


    /**Calcula el sueldo total del empleado */
    public double calcularSueldoFinal(){
        // para hacer override en los demás
        double totalSueldo= 0;

        return totalSueldo;
    }



    








    /**Rellena los HashMap con los datos iniciales correspondientes de forma que tengamos
     * todos los valores disponibles al iniciar el programa para 
     */
    public static void rellenarHashMaps(){

        //Categorías provisionales
        tablaCategoriaProf.put(1, 'A');
        tablaCategoriaProf.put(2, 'B');
        tablaCategoriaProf.put(3, 'C');

        //Sueldos
        tablaSueldos.put('A', SUELDO_BASE_A);
        tablaSueldos.put('B', SUELDO_BASE_B);
        tablaSueldos.put('C', SUELDO_BASE_C);

        tablaPorcentajeSuplementos.put("Trasplantes", 15);
        tablaPorcentajeSuplementos.put("Cirugia", 10);
        tablaPorcentajeSuplementos.put("Quemados", 5);




    }


    public int buscarNumeroCategoríaProf(){
        int numeroCategoria = -1;
        // comprueba si el HashMap contiene nuestra categoría profesional
        // itera todo el HashMap
        for(Entry<Integer, Character> entry : tablaCategoriaProf.entrySet()) {

            // si el valor que paso es igual al valor de entry
            // retornamos el valor de la Key de entry (Osea, el número asociado a nuestra categoría profesional)
            if(entry.getValue() == this.getCategoriaProfesional()) {
                numeroCategoria = entry.getKey();
            }
        }
        return numeroCategoria;
    }
  

    /**cuenta los empleados dentro del arraylist
     * @return (int) numero de empleados
     */
    public static int getNumeroTotalEmpleadosActuales(){


        return listaEmpleados.size();
    }

    /**
     * 
     * @param tipoEmpleado La letra de la categoría profesional para contar cuantos hay de X tipo.
     * @return contadorEmpleadosEncontrados (int) el número de empleados encontrados con esa categoría profesional
     * @throws Exception 
     */
    public static int getNumeroTotalEmpleadosTipoX() throws Exception{

        Character tipoEmpleado = EntradaSalida.getCharacter();

        // Si la categoría a buscar no está dentro de las contempladas en tablaCategoriaProf da error
        if (!tablaCategoriaProf.containsValue(tipoEmpleado) ) {
            throw new Exception("Esa categoría no existe");
        }
       
        int contadorEmpleadosEncontrados = 0; // variable para contar los encontrados de X tipo
        Iterator<EmpleadoHospital> iteradorEmpleadosGetMedicos = listaEmpleados.iterator();

        while (iteradorEmpleadosGetMedicos.hasNext()) {
            EmpleadoHospital empleadoActual = iteradorEmpleadosGetMedicos.next();

            if (empleadoActual.categoriaProfesional.equals(tipoEmpleado)) {
                contadorEmpleadosEncontrados++;
            }
        }

        return contadorEmpleadosEncontrados;

    }


    /**Compara un objeto EmpleadoHospital con otro utilizando el comparador de String en el valor de EmpleadoID */
    @Override
    public int compareTo(EmpleadoHospital empeladoComparar){
        return this.getEMPLEADO_ID().compareTo(empeladoComparar.getEMPLEADO_ID());
        
    }

    /**Lista los empleados del ArrayList listaEmpleados y te pide que elijas uno. Comprueba si existe, si es un medico y ejecuta setNumeroGuardias() sobre el objeto Médico elegido */
    public static void modificarGuardiasMedicoSeleccionado(){

        mostrarEmpleados(); //muestra los empleados para que elijas uno de los médicos
        System.out.println("Introduce el inidce del médico a modificar:\n");     
        try {
            int posicionSeleccionada = EntradaSalida.getInt();

            if (posicionSeleccionada > listaEmpleados.size() || posicionSeleccionada < 0) {
                throw new Exception("Error, Esa posición no existe");
            }

            // Si es un médico te deja cambiar su número de guardias (Se usa un objeto temporal)
            if (listaEmpleados.get(posicionSeleccionada).categoriaProfesional == 'A') {
                Medico empleadoActual = (Medico)listaEmpleados.get(posicionSeleccionada);
                empleadoActual.setNumeroGuardias();
    

                listaEmpleados.set(posicionSeleccionada, empleadoActual); 
                
            }else{
                System.out.println("El empleado elegido no es un médico");
            }
    
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    








    }

    /**Lista los empleados de listaEmpleados usando sus toString() */
    public static void mostrarEmpleados(){

        for (EmpleadoHospital empleadoi : listaEmpleados) {
            System.out.println(empleadoi.toString());
        }


    }


    @Override
    public String toString(){
        return listaEmpleados.indexOf(this) + "\t" + this.getEMPLEADO_ID() + "\t" + this.nombre;


    }


    //<Getters>
    
    public String getEMPLEADO_ID() {
        return EMPLEADO_ID;
    }


    public static double getSueldoBaseA() {
        return SUELDO_BASE_A;
    }


    public static double getSueldoBaseB() {
        return SUELDO_BASE_B;
    }


    public static double getSueldoBaseC() {
        return SUELDO_BASE_C;
    }


    public static double getPorcentajeTurnicidad() {
        return PORCENTAJE_TURNICIDAD;
    }


    public static int getnumeroTotalEmpleadosCreados() {
        return numeroTotalEmpleadosCreados;
    }


    public String getNombre() {
        return nombre;
    }


    public Character getCategoriaProfesional() {
        return categoriaProfesional;
    }


    public String getServicio() {
        return servicio;
    }


    public boolean isTurnicidad() {
        return turnicidad;
    }

//</Getters>

//<Setters>
    public static void setnumeroTotalEmpleadosCreados(int numeroTotalEmpleadosCreados) {
        EmpleadoHospital.numeroTotalEmpleadosCreados = numeroTotalEmpleadosCreados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoriaProfesional(Character categoriaProfesional) {
        this.categoriaProfesional = categoriaProfesional;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setTurnicidad(boolean turnicidad) {
        this.turnicidad = turnicidad;
    }
//</Setters>




}
  







