// OrdenarPersonas.java
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarPersonas {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        // Añadir personas a la lista
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Pedro", 20));
        personas.add(new Persona("Aloe", 20));
        
        // Ordenar la lista
        //Aquí tu código
       personas.sort(null);
    

        // Imprimir la lista ordenada
        //Aquí tu código
        for (Persona personaActual : personas) {
            System.out.println(personaActual.toString());
        }
    }
}
