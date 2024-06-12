// Persona.java
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }  
    
    // Método toString
    @Override
    public String toString() {
        return getNombre()+"\t"+ getEdad();
    }

    @Override
    public int compareTo(Persona personaComparar) {
         int resultadoComparacion = -2;
        /**Compara un objeto EmpleadoHospital con otro utilizando el comparador de String en el valor de EmpleadoID */
   
            if (this.edad > personaComparar.edad) {
                resultadoComparacion = 1;
            }else 
            if (this.edad == personaComparar.edad) {
                resultadoComparacion = this.nombre.compareTo(personaComparar.nombre);
            }else 
            if (this.edad < personaComparar.edad) {
                resultadoComparacion = -1;
            }
        
            
        
         return resultadoComparacion;
        
    
    }



}
