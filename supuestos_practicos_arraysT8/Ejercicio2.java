package supuestos_practicos_arraysT8;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static String funcionComprobarString(String[] stringInput, String numeroDNI){
        String resultado = "";
        System.out.println(numeroDNI.length());
        String numeroArrayEntero = "";
        int restoDivision = 0;

        

        
        if(numeroDNI.length() != 10){
            resultado += " |DNI no válido por longitud";
        }
        else if(String.valueOf(numeroDNI.charAt(numeroDNI.length()))  != "[TRWAGMYFPDXBNJZSQVHLCKE]" ){

            resultado += " |DNI No Valido por letra no existe";
        }
        
        for(int i = 0; i < numeroDNI.length()-1; i++){ //Pasa por los valores de numeroDNI y los suma a numeroArrayEntero
            numeroArrayEntero = numeroArrayEntero + numeroDNI.charAt(i);
            
            

           
        }
        


        //Este paso de división se hace así porque el algoritmo de asignación del gobierno asigna la letra dependiendo del resto de
        //la división del número del DNI entre 23
        restoDivision = Integer.valueOf(numeroArrayEntero) % 23; //divide entre 23 el valor de numeroArrayEntero sin la letra, guarda el resto
        
      
        //Para limpiar un poco la condición de debajo y hacerla más legible he usado estas variables para guardar

        // en la primera el valor de la letra correspondiente al array con índice en la posicion restoDivision
        String valorIndice = String.valueOf(stringInput[restoDivision]);
        //en este segundo se guarda el valor de la letra contenida en el DNI que hemos pasado como input
        String valorDNILetra = String.valueOf(numeroDNI.charAt(numeroDNI.length()-1));



        //Si el valor de la letra asignada al (índice del array correspondiente al resto) NO es igual a la letra del DNI que aportamos
        
        if(valorIndice.equals(valorDNILetra)){
            resultado += " |Valido";

        }else{
            resultado += " |Letra incorrecta";
        }

        
        return resultado;

        
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayLetras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String dniValidar;


        System.out.println("Introduce un DNI para validar: ");
        dniValidar = sc.nextLine();
        
        System.out.println(funcionComprobarString(arrayLetras, dniValidar));


    }



}
