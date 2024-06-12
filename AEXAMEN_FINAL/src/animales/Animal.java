package animales;
// Animal.java
public abstract class Animal {
    private String nombre;
    private int edad;
    
    // Constructor
    protected Animal(String nombre, int edad) {
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Método abstracto para que el animal haga su sonido característico
    protected abstract void hacerSonido();
    
    // Método para que el animal se mueva. El gato y el perro se moverán igual
    protected  void mover() {
        System.out.println("Soy un animal que se mueve");
    }
}

