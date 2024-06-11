
import java.text.DecimalFormat;
import java.util.HashMap;

public abstract class Figura {
    private int base;
    private int altura;
    
    public static HashMap<Integer, Character> rellenos;
    
    public Figura (int b, int a){
        base = b;
        altura = a;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }  
    
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###.##");
        return "base: " + base + 
                "\naltura: " + altura+
                "\nÁrea: " + df.format(Area()) + 
                "\nPerímetro: " + df.format(Perimetro());
    }
    
    public static void Rellenos(){
        rellenos = new HashMap<>();
        rellenos.put(1, '*');
        rellenos.put(2, '$');
        rellenos.put(3, '@');
        rellenos.put(4, '&');
        rellenos.put(5, '€');
    }
    
    public abstract double Area();
    public abstract double Perimetro();
    public abstract void Dibujo();
}
