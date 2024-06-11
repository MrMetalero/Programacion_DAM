
public class Hexagono extends Figura {

    public Hexagono(int b, int a) {
        super(b, a);
    }

    @Override
    public double Area() {
        double apotema = (double) getAltura() / 2;
        return Perimetro() * apotema / 2;
    }

    @Override
    public double Perimetro() {
        return (getBase() * 6);
    }

    @Override
    public void Dibujo() {
        int relleno = (int) (Math.random() * 5 + 1);
        int b = getBase();
        int h = (int) Math.round((double) getAltura() / 2);
        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= h - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (b - 1) + (2 * i - 1); j++) {
                System.out.print(rellenos.get(relleno));
            }
            System.out.println("");
        }
        for (int i = h - 1; i > 0; i--) {
            for (int k = h - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (b - 1) + (2 * i - 1); j > 0; j--) {
                System.out.print(rellenos.get(relleno));
            }
            System.out.println("");
        }
    }

}
