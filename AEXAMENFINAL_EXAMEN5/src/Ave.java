
// Ave es un animal que implementa animal salvaje
public class Ave extends Animal implements AnimalSalvaje {
    
    // Constructor
    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Implementación de hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Sonido de ave...");
    }
    
    // Sobrecarga del método mover para un comportamiento específico del ave
    @Override
    public void mover() {
        super.mover();
        System.out.print("y además vuelo\n");
    }
    
    // Implementación de cazar
    @Override
    public void cazar() {
        System.out.println("cazando...");
    }
    
    // Implementación de rugir
    @Override
    public void rugir() {
        System.out.println("Hace ruido de pajaro");
    }
}
