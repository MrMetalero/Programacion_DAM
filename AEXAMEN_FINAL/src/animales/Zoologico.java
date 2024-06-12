package animales;
// Zoologico.java
import java.util.ArrayList;
import animales.Animal;
import animales.Ave;

public class Zoologico {
    private ArrayList<Animal> animales;
    
    // Constructor
    public Zoologico() {
        animales = new ArrayList<>();
    }
    
    // Método para agregar un animal al zoológico
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    
    // Método para mostrar el comportamiento de todos los animales en el zoológico
    public void mostrarComportamientos() {
        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.mover();
            animal.getClass().getInterfaces().toString();
            //Si el animal es un AnimalSalvaje, también ha de cazar y rugir
            if (animal.getClass().getSimpleName().matches("Ave")){
               Ave aveTemporal = (Ave)animal;
                aveTemporal.cazar();
                aveTemporal.rugir();
            }


        }
        
    }
    
    // Método principal para probar el zoológico
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.agregarAnimal(new Perro("Rex", 5));
        zoo.agregarAnimal(new Gato("Miau", 3));
        zoo.agregarAnimal(new Ave("Tweety", 2));
        
        zoo.mostrarComportamientos();
    }
}
