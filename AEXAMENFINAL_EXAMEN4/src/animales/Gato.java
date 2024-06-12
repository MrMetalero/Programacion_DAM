package animales;
// Gato es un animal no salvaje
//El gato y el perro se moverán igual
public class Gato extends Animal{
    
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Implementación de hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
    
    
}
