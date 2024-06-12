package animales;
import java.io.IOException;
// Zoologico.java
import java.util.ArrayList;
import java.util.Iterator;

import excepciones.ArchivoNoEncontradoException;
import serializacion.ZoologicoPersistencia;

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
            
            //Si el animal es un AnimalSalvaje, también ha de cazar y rugir

        }
    }
    
    // Método principal para probar el zoológico
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.agregarAnimal(new Perro("Rex", 5));
        zoo.agregarAnimal(new Gato("Miau", 3));
        zoo.agregarAnimal(new Ave("Tweety", 2));
        
        ZoologicoPersistencia zooDinamico = new ZoologicoPersistencia();
        zooDinamico.establecerRutaFichero("src/");
        System.out.println(zooDinamico.obtenerRutaFichero());


        // try {
        //      ZoologicoPersistencia.guardarAnimales(zoo.animales);
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("ERROR DE ENTRADA SALIDA");
        // } catch (ArchivoNoEncontradoException arE){
        //     arE.printStackTrace();
        // }

        //Se borran los animales para comprobar que se cargan bien
        Iterator<Animal> iteradorAnimales = zoo.animales.iterator();
        while (iteradorAnimales.hasNext()) {
            iteradorAnimales.next();
            iteradorAnimales.remove();
        }

        //No se ejecuta porque los he borrado
        //zoo.mostrarComportamientos();


        try {
         zoo.animales = ZoologicoPersistencia.cargarAnimales();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ArchivoNoEncontradoException e) {
            e.printStackTrace();
            System.out.println("ARCHIVO NO ENCONTRADO");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Después de cargarlos los muestra para comprobar que funcionan
        zoo.mostrarComportamientos();
    }
}
