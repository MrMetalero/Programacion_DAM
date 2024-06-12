
// Perro es un animal NO salvaje
//El gato y el perro se moverán igual
public class Perro extends Animal{
    
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Implementación de hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Woof");
    }
    
}
