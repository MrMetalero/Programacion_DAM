
public class Rectangulo extends Figura{
    
    public Rectangulo(int b, int a){
        super(b, a);
    }
    
    @Override
    public double Area(){
        return getBase()*getAltura();
    }
    
    @Override
    public double Perimetro(){        
        return (getBase()*2) + (getAltura()*2);
    }
    
    @Override
    public void Dibujo(){
        int relleno = (int)(Math.random()*5+1);
        for(int i=1; i<=getAltura(); i++){            
            for(int j=1; j<=getBase(); j++)
                System.out.print(rellenos.get(relleno));
            System.out.println("");
        }
    }
}
