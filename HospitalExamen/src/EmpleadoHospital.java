import java.util.HashMap;

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
public abstract class EmpleadoHospital {
    
    /**categoríaProf 
     * @description Enlaza las categorías profesionales con un dígito para el código del empleado
     */
    public static HashMap<Character,Integer> tablaCategoriaProf = new HashMap<Character,Integer>();
    
    /**tablaSueldos 
     * @description Enlaza las categorías profesionales con un dígito para el sueldo del empleado
     */
    public static HashMap<Character,Double> tablaSueldos = new HashMap<Character,Double>();
    
    /**tablaPorcentajeSuplementos 
     * @description Enlaza los servicios con un dígito para el porcentaje de suplemento
     */
    public static HashMap<String,Integer> tablaPorcentajeSuplementos = new HashMap<String,Integer>();
    
    public final int GUARDIAS_MAXIMAS = 5;
    private final String EMPLEADO_ID;
    private static int numeroTotalEmpleados = 0;
    private String nombre;
    private Character categoriaProfesional;
    private String servicio;
    private boolean turnicidad;
    
   
    public EmpleadoHospital(){
        EMPLEADO_ID = generarCodigoEmpleado();
        try {
            this.nombre = EntradaSalida.getString();
            this.categoriaProfesional = EntradaSalida.getCharacter();
            this.servicio = EntradaSalida.getString();
            this.turnicidad = EntradaSalida.get






        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     
        

    }
   
 
    /**
     * Genera un código basado en la letra de la categoría profesional y un número random de 5 cifras
     * @return (String) 
     */
    private String generarCodigoEmpleado(){
        int numeroId = 0;
        for (int i = 0; i < 6; i++) { 
            try {
                numeroId += EntradaSalida.getRandomInt(0, 9);
            } catch (Exception e) {
                e.printStackTrace();
            }
             
        }
    

        return categoriaProfesional + String.valueOf(numeroId);
    }





}