package figuras;

/**
 * FiguraGeo
 */
public abstract class FiguraGeo {
    
    Lienzo lienzoFondo;

    public FiguraGeo(){

    }

    public Lienzo dibujarGeo (){

        for (String[] e : lienzoFondo.lienzo) {     
            for (String i : e){
                System.out.print(i);
            }
           System.out.println();
        }
        return lienzoFondo;
    }

    public abstract void pintarFiguraEnLienzo();
        
    

}
    

    
