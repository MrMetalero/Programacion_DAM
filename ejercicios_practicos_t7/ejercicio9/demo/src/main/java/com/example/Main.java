package ejercicios_practicos_t7.ejercicio9.demo.src.main.java.com.example;

class prueba {
    protected String nombre;
    protected int ID;

    public String getIdent() {
        return nombre;
    }

    public int getIdent() {
        return ID;
    }


    //No compila, sobrecarga no creo que sea porque los constructores devuelven tipos diferentes.
    //Por lo que la otra opción es sobreescritura.
    //Aunque al tener ambas funciones el mismo nombre me da un error
}

public class Main {
    public static void main(String[] args) {

    }
}