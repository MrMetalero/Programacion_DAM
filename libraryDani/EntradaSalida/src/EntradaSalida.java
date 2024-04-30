import java.util.Random;
import java.util.Scanner;


/**
 * EntradaSalida
 */
public abstract class EntradaSalida {
    public static Scanner sc = new Scanner(System.in);


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
        
        return sc.nextLine().charAt(0);

    }


    /**
     * Devuelve un Character introducido por el usuario
     * @return Character
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Character getCharacter() throws Exception{
        
        return sc.nextLine().charAt(0);

    }


    /**
     * Devuelve un double introducido por el usuario
     * @return double
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static double getDouble() throws Exception{

        return Double.parseDouble(sc.nextLine());
    }


    /**
     * Devuelve un Double introducido por el usuario
     * @return Double
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Double getDoubleWrapper() throws Exception{

        return Double.parseDouble(sc.nextLine());
    }


    /**
     * Devuelve un float introducido por el usuario
     * @return float
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static float getFloat() throws Exception{

        return Float.parseFloat(sc.nextLine());
    }


    /**
     * Devuelve un Float introducido por el usuario
     * @return Float
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static Float getFloatWrapper() throws Exception{

        return Float.parseFloat(sc.nextLine());
    }


    /**
     * Devuelve un numero Random entre "min" y "max" introducidos por el usuario
     * @return int
     * 
     * @throws InvalidInputException Error por tipo de dato incorrecto
     */
    public static int getRandomInt(int min, int max) throws Exception{

        min = 1;
        max = 10;

        Random numRandom = new Random();
        

        //El número random es inclusivo en los rangos
        return numRandom.nextInt(max - min + 1) + min;
    }
    

    







}