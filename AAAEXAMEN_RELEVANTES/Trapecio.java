
public class Trapecio extends Figura {
    
    private int Base;       
    
    public Trapecio(int b, int a, int B){
        super(b, a);
        Base = B;
    }

    public void setBBase(int Base) {
        this.Base = Base;
    }
    
    @Override
    public String toString(){
        return "Base: " + Base + "\n" + super.toString();
    }
    
    @Override
    public double Area(){
        return (double)((getBase()+Base) * getAltura()) / 2;
    }
    
    @Override
    public double Perimetro(){ 
        double bb = (double)(Base - getBase()) / 2;
        double hipotenusa = Math.sqrt(Math.pow(getAltura(),2) + Math.pow(bb, 2));
        return Base + getBase() + (hipotenusa*2);
    }
    
    @Override
    public void Dibujo(){       
        int relleno = (int)(Math.random()*5+1);
        int b = getBase();
        int h = getAltura();
        for(int i=1; i<=h; i++){
            for(int k=1; k<=h-i; k++)
                System.out.print(" ");
            for(int j=1; j<=(b-1)+(2*i-1); j++)
                System.out.print(rellenos.get(relleno));
            System.out.println("");
        }        
    }
}
