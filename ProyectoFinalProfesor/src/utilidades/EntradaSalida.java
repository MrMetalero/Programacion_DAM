package utilidades;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.sql.*;

/**
 * EntradaSalida
 * @author Mr_Metalero (Daniel Mena)
 * 
 * @Descripcion Esta es una clase custom para hacer cositas
 */
public abstract class EntradaSalida {


    /** Escaner de toda la clase */
    private static Scanner sc = new Scanner(System.in);
   

    public static Connection establecerConexion(String nombreBase,String userBase, String passwdBase){
        //Placeholder para una conexión entrante
        Connection connection = null;
        String nombreBaseDatos = nombreBase;
        String nombreUsuarioBaseDatos = userBase;
        String passwordUsuarioBaseDatos = passwdBase;

        try {
            Class.forName("org.postgresql.Driver");
            // Conectamos con la base de datos
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+nombreBaseDatos,nombreUsuarioBaseDatos, passwordUsuarioBaseDatos);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error al registrar el driver de PostgreSQL: ");
            e.printStackTrace();
        }
        catch(SQLException ex){
            System.out.println("Error de SQL");
            ex.printStackTrace();
        }
        return connection;

    }






    
    /**Este arrayList contiene los posibles valores de entrada para verdadero o falso (Si,no,Yes,No,N,Y etc...) 
     * que puede introduir un usuario relacionados con
     * true o false como booleanos
     */
    public static HashMap<String,Boolean> tablaBoolean = new HashMap<String,Boolean>();

    /**Esta funcion nos sirve  
     * @throws Exception */
    public static boolean getBoolean() throws Exception {

        try {
            // Valores posibles para verdadero
            tablaBoolean.put("Si", true);
            tablaBoolean.put("si", true);
            tablaBoolean.put("S", true);
            tablaBoolean.put("s", true);
            tablaBoolean.put("y", true);
            tablaBoolean.put("Y", true);
            tablaBoolean.put("Yes", true);
            tablaBoolean.put("yes", true);
            tablaBoolean.put("true", true);
            tablaBoolean.put("True", true);
            tablaBoolean.put("Verdadero", true);
            tablaBoolean.put("verdadero", true);

            // Valores posibles para falso
            tablaBoolean.put("No", false);
            tablaBoolean.put("no", false);
            tablaBoolean.put("N", false);
            tablaBoolean.put("n", false);
            tablaBoolean.put("false", false);
            tablaBoolean.put("False", false);
            tablaBoolean.put("falso", false);
            tablaBoolean.put("Falso", false);

            String inputBooleanString = sc.nextLine();

            if (tablaBoolean.containsKey(inputBooleanString)) {
                return tablaBoolean.get(inputBooleanString);
            } else {
                throw new InvalidInputException("ERROR El valor introducido es erróneo");
            }
        } catch (InvalidInputException e) {
            //Es un mareo pero es la forma que he podido usar para que no tenga que sacar de EntradaSalida la excepción custom
            // Lanzo una excepción custom, la manejo aquí y lanzo una general hacia arriba
            System.err.println(e.getMessage());
            throw new Exception(" ERROR"); 
        }
    }






    /**
     * Devuelve un int introducido por el usuario
     * @return int
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static int getInt() {
    
        String inputInt = sc.nextLine();

        try {
            return Integer.parseInt(inputInt);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }




    }


    /**
     * Devuelve un Integer introducido por el usuario
     * @return Integer
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static Integer getInteger() {
     
        String inputInteger = sc.nextLine();

        try {
            return Integer.parseInt(inputInteger);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }


    }
        

    /**
     * Devuelve un String introducido por el usuario
     * @return String
     * 
     * 
     */
    public static String getString() {
        return sc.nextLine();


        
    }


    /**
     * Devuelve un char introducido por el usuario
     * @return char
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static char getChar() {
    
        char inputChar = sc.nextLine().charAt(0);

        try {
            return inputChar;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

    }


    /**
     * Devuelve un Character introducido por el usuario
     * @return Character
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static Character getCharacter(){
        
        char inputCharacter = sc.nextLine().charAt(0);

        try {
            return inputCharacter;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

        
    }


    /**
     * Devuelve un double introducido por el usuario
     * @return double
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static double getDouble() {


        String inputDouble = sc.nextLine();

        try {
            return Double.parseDouble(inputDouble) ;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
    }


    /**
     * Devuelve un Double introducido por el usuario
     * @return Double
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static Double getDoubleWrapper(){

        String inputDouble = sc.nextLine();

        try {
            return Double.parseDouble(inputDouble) ;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

    }


    /**
     * Devuelve un float introducido por el usuario
     * @return float
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static float getFloat() {

        String inputFloat = sc.nextLine();

        try {
            return Float.parseFloat(inputFloat);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
    }


    /**
     * Devuelve un Float introducido por el usuario
     * @return Float
     * 
     * @throws NumberFormatException Error por tipo de dato incorrecto
     */
    public static Float getFloatWrapper() {

        String inputFloat = sc.nextLine();

        try {
            return Float.parseFloat(inputFloat);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
        
    }


    /**
     * Devuelve un numero Random entre "min" y "max" introducidos por el usuario
     * @return int
     * 
     * @throws InvalidRange Error por tipo de dato incorrecto
     */
    public static int getRandomInt(int min, int max){
        try {
            if (min > max){
                throw new InvalidRange("EL MIN no puede ser mayor que el MAX");
    
    
            }
        } catch (InvalidRange e) {
          e.printStackTrace();
        }

        

        Random numRandom = new Random();
        

        //El número random es inclusivo en los rangos
        return numRandom.nextInt(max - min + 1) + min;
    }
    


}


/**
 * InvalidInputException
 * Error que indica que el input es inválido
 */
class InvalidInputException extends Exception {
    
    public InvalidInputException(String message){
        super(message);

    }




}


/**
 * InvalidRangeException
 * Error que indica que el rango es inválido
 */
class InvalidRange extends Exception {
    
    public InvalidRange(String message){
        super(message);

    }


}



class Keyboard {

    private static final Map<Integer, Boolean> pressedKeys = new HashMap<>();

    static {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(event -> {
            synchronized (Keyboard.class) {
                if (event.getID() == KeyEvent.KEY_PRESSED) pressedKeys.put(event.getKeyCode(), true);
                else if (event.getID() == KeyEvent.KEY_RELEASED) pressedKeys.put(event.getKeyCode(), false);
                return false;
            }
        });
    }

    public static boolean isKeyPressed(int keyCode) { // Any key code from the KeyEvent class
        return pressedKeys.getOrDefault(keyCode, false);
    }
}

class FrameApp extends JFrame{
    public FrameApp(String name){
    super(name);
    }
    } 

