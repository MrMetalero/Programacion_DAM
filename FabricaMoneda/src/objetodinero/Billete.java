package objetodinero;

/**
 * Billete
 * @Superclass {@link objetodinero.Dinero#Dinero() objeto_dinero.Dinero
 * @param altura (double) la dimensión de altura del billete en mm
 * @param anchura (double) la dimensión de ancho del billete en mm
 */
public class Billete extends Dinero {
    private double altura;
    private double anchura;


    public Billete(Billete copiaBillete){
        this.setAltura(copiaBillete.altura);
        this.setAnchura(copiaBillete.anchura);
        this.setValorMonetario(copiaBillete.getValorMonetario());
        this.setYearEmision(copiaBillete.getYearEmision());
        
    } 

    /** 
     * Devuelve la altura del billete
     * @return double
     */
    public double getAltura() {
        return altura;
    }


    /** 
     * Establece la altura del billete
     * @param altura (double)
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }


    /** 
     * Devuelve el ancho del billete
     * @return double
     */
    public double getAnchura() {
        return anchura;
    }


    /** 
     * Establece el ancho del billete
     * @param anchura (double)
     */
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    /**
     * Devuelve un string con los atributos propios del billete y los comunes de la superclase
     */
    @Override
    public String toString() {
        return "Billete [altura=" + altura + ", anchura=" + anchura + ", toString()=" + super.toString() + "]";
    }
    



}