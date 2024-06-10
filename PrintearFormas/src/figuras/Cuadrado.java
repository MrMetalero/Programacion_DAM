package figuras;

import excepciones.InvalidInputException;
/**
 * Cuadrado
 */
public class Cuadrado extends FiguraGeo {
    Integer lado = 0;

    public Cuadrado(Integer ladoInput){
        lado = ladoInput;
        lienzoFondo = new Lienzo();
    }


    public Cuadrado(Integer ladoInput, Lienzo lienzoInput){
        lado = ladoInput;
        lienzoFondo = lienzoInput;
    }


    @Override
    public void pintarFiguraEnLienzo() {

        if (lado < lienzoFondo.getDimensionX() || lado < lienzoFondo.getDimensionY()) {
            for (int y = 0; y < lienzoFondo.lienzo.length-1; y++) {

                for (int x = 0; x < lienzoFondo.lienzo.length-1; x++) {
                   
                }
                
            }
        }else{ 
            try {
                throw new InvalidInputException("null");
            } catch (InvalidInputException e) {
                e.printStackTrace();
            }
        }
        

    }


  

    
    
}