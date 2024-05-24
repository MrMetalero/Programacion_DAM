package empleados;
import java.util.ArrayList;
import java.util.HashMap;
import main.EntradaSalida;
import java.util.Map.Entry;

/**
 * EmpleadoHospital
 * 
 * @param codigoEmpleado (String)identifica al empleado
 * @param categoriaProfesional (Character)muestra la categoría a la que pertenece 
 * @param nombreCompleto (String) nombre del empleado
 * @param servicio (String) la actividad específica que realiza el empleado
 * @param turnicidad (boolean) si realiza turnicidad 
 * @param numeroTotalEmpleados (int) numero total
 * 
 *
 */
public abstract class EmpleadoHospital implements CalcularSueldoFinal{

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
    

    private final String EMPLEADO_ID;
    private final static double SUELDO_BASE_A = 2000;
    private final static double SUELDO_BASE_B = 1800;
    private final static double SUELDO_BASE_C = 1500;
    protected final static double PORCENTAJE_TURNICIDAD = 5;


    private static int numeroTotalEmpleados = 0;
    protected String nombre;
    protected Character categoriaProfesional;
    protected String servicio;
    protected boolean turnicidad;
    
   
    public EmpleadoHospital(){
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
        numeroTotalEmpleados+=1;
        

    }
   


    /**
     * Genera un código basado en la letra de la categoría profesional y un número random de 5 cifras
     * @return (String) 
     */
    private String generarCodigoEmpleado(){
        String codigoEmpleadoTemp = "";
        String cerosCodigo = "";
        String numeroEmpleados;

        if (this.getCategoriaProfesional() == 'A') {
            numeroEmpleados = String.valueOf(Medico.getNumeroTotalMedicos());
        }

        if (this.getCategoriaProfesional() == 'B') {
            numeroEmpleados = String.valueOf(Enfermero.getNumeroTotalEnfermeros());
        }

        if (this.getCategoriaProfesional() == 'C') {
            numeroEmpleados = String.valueOf(Auxiliar.getNumeroTotalAuxiliares());
        }


            //añaden la letra y el número de la categoría profesional quedan 5 cifras
            codigoEmpleadoTemp += getCategoriaProfesional();
            codigoEmpleadoTemp += buscarNumeroCategoríaProf();
    





        return codigoEmpleadoTemp;
    }


    /**Calcula el sueldo total del empleado */
    public double calcularSueldoFinal(){
        // Variable para simplificar la lectura de los porcentajes
        double sueldoEnfermero = tablaSueldos.get(categoriaProfesional);
        double totalSueldo = sueldoEnfermero;

        if(tablaPorcentajeSuplementos.containsKey(servicio)){
            //Calculo del valor extra del servicio
            totalSueldo += sueldoEnfermero*tablaPorcentajeSuplementos.get(servicio)/100;
        }

        return totalSueldo;
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


        public static int getNumeroTotalEmpleados() {
            return numeroTotalEmpleados;
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
        public static void setNumeroTotalEmpleados(int numeroTotalEmpleados) {
            EmpleadoHospital.numeroTotalEmpleados = numeroTotalEmpleados;
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
        // iterate each entry of hashmap
        for(Entry<Integer, Character> entry : tablaCategoriaProf.entrySet()) {

            // si el valor que paso es igual al valor de entry
            // retornamos el valor de la Key de entry (Osea, el número asociado a nuestra categoría profesional)
            if(entry.getValue() == this.getCategoriaProfesional()) {
                numeroCategoria = entry.getKey();
            }
        }
        return numeroCategoria;
    }
  


    

}
  


/**Excepción que salta cuando no se encuentra la clave asociada en el HashMap */
class ExcepcionNoMapMatch extends Exception {

    public ExcepcionNoMapMatch(String message){
        super(message);


    }
    
}





