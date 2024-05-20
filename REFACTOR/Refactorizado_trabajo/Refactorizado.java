package REFACTOR.Refactorizado_trabajo;


// la clase principal es mucho más limpia ahora puesto que solamente invoca la función 
// que necesitamos y está libre de sus variables 
public class Refactorizado {
    
        public static void main(String[] args) {
        boolean programaEncendido = true;

        while (programaEncendido) {
            System.out.println(LogicaNumeros.recibirNumero()); 
      
        }
    }

  

}
