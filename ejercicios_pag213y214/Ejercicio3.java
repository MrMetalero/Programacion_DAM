package ejercicios_pag213y214;

public class Ejercicio3 {
    

    public static String funcionReducirCadena(String cadenaReducir, int contador){

        if (contador <= 1) {
            //Cuando llegue al final nos quedará una cifra por eliminar, así que lo hacemos en este caso base
            System.out.println(cadenaReducir.substring(0, contador));
        }
        else{
            
                //utilizo substring para indicar una porcion del String e igualarla al string original
                //esencialmente cortando un trozo del String original puesto que nuestro contador
                //está relacionado con la longitud del string original y se va reduciendo en 1
                cadenaReducir = cadenaReducir.substring(0, contador); 
                System.out.println(cadenaReducir.substring(0, contador));
            
                //Se va reducienddo contador (la longitud del string) para saber cuantos caracteres vamos a cortar
            return funcionReducirCadena(cadenaReducir, contador-1);

        }


        return "";
    }




    public static void main(String[] args) {
        String cadenaReducir = "Recursivo";
        int contador = cadenaReducir.length();

    
        funcionReducirCadena(cadenaReducir, contador);

    }

}
