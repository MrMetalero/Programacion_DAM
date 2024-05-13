import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


/**
 * EntradaSalida
 * @author Mr_Metalero (Daniel Mena)
 * 
 * @Descripcion Esta es una clase custom para hacer cositas
 */
public abstract class EntradaSalida {
    public static Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> tablaBooleanos = new HashMap<String,Integer>();
 /**
     * Devuelve un boolean introducido por el usuario
     * @return boolean
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static boolean getBoolean() throws InvalidInputException{
    
        String inputInt = sc.nextLine();
        if(){

        }

        




    }


    /**
     * Devuelve un int introducido por el usuario
     * @return int
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static int getInt() throws InvalidInputException{
    
        String inputInt = sc.nextLine();

        try {
            return Integer.parseInt(inputInt);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }




    }


    /**
     * Devuelve un Integer introducido por el usuario
     * @return Integer
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Integer getInteger() throws InvalidInputException{
     
        String inputInteger = sc.nextLine();

        try {
            return Integer.parseInt(inputInteger);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }


    }
        

    /**
     * Devuelve un String introducido por el usuario
     * @return String
     * 
     * @throws Exception Error general
     */
    public static String getString() throws Exception{
        return sc.nextLine();


        
    }


    /**
     * Devuelve un char introducido por el usuario
     * @return char
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static char getChar() throws Exception{
    
        char inputChar = sc.nextLine().charAt(0);

        try {
            return inputChar;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

    }


    /**
     * Devuelve un Character introducido por el usuario
     * @return Character
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Character getCharacter() throws Exception{
        
        char inputCharacter = sc.nextLine().charAt(0);

        try {
            return inputCharacter;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

        
    }


    /**
     * Devuelve un double introducido por el usuario
     * @return double
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static double getDouble() throws Exception{


        String inputDouble = sc.nextLine();

        try {
            return Double.parseDouble(inputDouble) ;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
    }


    /**
     * Devuelve un Double introducido por el usuario
     * @return Double
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Double getDoubleWrapper() throws Exception{

        String inputDouble = sc.nextLine();

        try {
            return Double.parseDouble(inputDouble) ;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }

    }


    /**
     * Devuelve un float introducido por el usuario
     * @return float
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static float getFloat() throws Exception{

        String inputFloat = sc.nextLine();

        try {
            return Float.parseFloat(inputFloat);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
    }


    /**
     * Devuelve un Float introducido por el usuario
     * @return Float
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Float getFloatWrapper() throws Exception{

        String inputFloat = sc.nextLine();

        try {
            return Float.parseFloat(inputFloat);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: NO SE PERMITEN LETRAS O SÍMBOLOS");
        }
    }


    /**
     * Devuelve un numero Random entre "min" y "max" introducidos por el usuario
     * @return int
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static int getRandomInt(int min, int max) throws Exception{

        if (min > max){
            throw new InvalidRange("EL MIN no puede ser mayor que el MAX");


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

