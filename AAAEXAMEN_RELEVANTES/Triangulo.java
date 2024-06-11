
public class Triangulo extends Figura {
    
    public Triangulo(int b, int a){
        super(b, a);
    }
    
    @Override
    public double Area(){
        return (double)(getBase()*getAltura()) / 2;
    }
    
    @Override
    public double Perimetro(){
        double hipotenusa = Math.sqrt(Math.pow(getAltura(),2) + Math.pow((double)getBase()/2, 2));
        return hipotenusa * 2 + getBase();
    }
    
    @Override
    public void Dibujo(){
        int relleno = (int)(Math.random()*5+1);
        int h = getAltura();
        for(int i=1; i<=h; i++){
            for(int k=1; k<=h-i; k++)
                System.out.print(" ");
            for(int j=1; j<=2*i-1; j++)
                System.out.print(rellenos.get(relleno));
            System.out.println("");
        }
    }
    
}
