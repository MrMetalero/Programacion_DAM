package objetodinero;

/**
 * Moneda
 * @Superclass {@link objetodinero.Dinero#Dinero() objeto_dinero.Dinero
 * @param diametro double
 * @param peso double
 */
public class Moneda extends Dinero {
    private double diametro;
    private double peso;
    


    
    public Moneda(Moneda copiaMoneda){
        this.diametro = copiaMoneda.diametro;
        this.peso = copiaMoneda.diametro;
        this.setDiametro(copiaMoneda.getDiametro());
        this.setPeso(copiaMoneda.getPeso());
        this.setValorMonetario(copiaMoneda.getValorMonetario());
        this.setYearEmision(copiaMoneda.getYearEmision());

    }   
   

    public Moneda(double diametro, double peso) {
        super();
        this.diametro = diametro;
        this.peso = peso;
    }

    /** 
     * Devuelve el diametro de la moneda
     * @return double
     */
    public double getDiametro() {
        return diametro;
    }

    /** 
     * Establece el diametro de la moneda
     * @param diametro (double)
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    /**
     * Devuelve el peso de la moneda 
     * @return double
     */
    public double getPeso() {
        return peso;
    }

     /**
     * Establece el peso de la moneda 
     * @param peso (double)
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Devuelve un string con los atributos propios de la moneda y los comunes de la superclase
     */
    @Override
    public String toString() {
        return "Moneda [diametro=" + diametro + ", peso=" + peso + ", toString()=" + super.toString() + "]";
    }
    
   
    
}