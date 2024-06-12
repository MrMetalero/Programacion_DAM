import java.util.ArrayList;

public class ZoologicoErroneo {

    private ArrayList<Animal> animales = new ArrayList<>();   // ESTE ARRAYLIST NO ESTÁ INICIALIZADO, SOLO DECLARADO

    // Constructor
    public ZoologicoErroneo() {
        
    }

    // Método para agregar un animal al zoológico
    public void agregarAnimal(Animal animal) {
        animales.add(animal); 
    }

    // Método para mostrar el comportamiento de todos los animales en el zoológico
    public void mostrarComportamientos() {
        for (int i = 0; i <= animales.size()-1; i++) {  //OUT OF BOUNDS, POSIBLEMENTE NECESITA -1
            Animal animal = animales.get(i);
            animal.hacerSonido();
            animal.mover();         
        }
    }

    // Método para convertir una cadena en un entero
    public Integer convertirCadenaAEntero(String cadena) {
        return Integer.parseInt(cadena); 
    }

    // Método para castear un objeto a AnimalSalvaje
    public void castearAAnimalSalvaje(Object obj) { //ANIMAL SALVAJE ES UNA INTERFAZ NO UNA SUBCLASE DE ANIMAL
        // AnimalSalvaje salvaje = (AnimalSalvaje) obj; 
        // salvaje.cazar();
    }

    // Método principal para probar el zoológico
    public static void main(String[] args) {
        ZoologicoErroneo zoo = new ZoologicoErroneo();
        Perro an = new Perro("Prueba", 10); // MODIFICADO PORQUE NO ESTABA INICIALIZADO
        // Prueba de agregar un animal
        zoo.agregarAnimal(an); 

        // Prueba de agregar un animal
        zoo.agregarAnimal(new Perro("Rex", 5)); 

        // Prueba de mostrar comportamientos
        zoo.mostrarComportamientos(); 

        // Prueba de conversión de cadena a entero
        int numero = zoo.convertirCadenaAEntero("123"); //NO SE PUEDE CONVERTIR la a MINÚSCULA A INTEGER

        // Prueba de casteo
        //Como se menciona en la linea 32, No se puede castear a esta INTERFAZ
        zoo.castearAAnimalSalvaje(new Perro("Buddy", 3)); 
    }
}
