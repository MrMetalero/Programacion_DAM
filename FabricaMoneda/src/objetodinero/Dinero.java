package objetodinero;

/**
 * Dinero
 * {@inheritDoc}
 * 
 * @param valorMonetario (double)    el valor monetario de este objeto en euros
 * @param yearEmision (int)  el año de emisión de este objeto
 */
public abstract class Dinero {
    private double valorMonetario;
    private int yearEmision;

    
    
    /** 
     * Devuelve el valor monetario de este objeto
     * @return double
     */
    public double getValorMonetario() {
        return valorMonetario;
    }

    /** 
     * Establece el valor monetario de este objeto
     * @return double
     * @param valorMonetario (double)
     */
    public void setValorMonetario(double valorMonetario) {
        this.valorMonetario = valorMonetario;
    }

    /** 
     * Devuelve el año de emisión de este objeto
     * @return double
     */
    public int getYearEmision() {
        return yearEmision;
    }

    /** 
     * Establece el año de emisión de este objeto
     * @return double
     * @param yearEmision (int)
     */
    public void setYearEmision(int yearEmision) {
        this.yearEmision = yearEmision;
    }

    /**
     * Devuelve un string con los atributos comunes del objeto monetario
     */
    @Override
    public String toString() {
        return "Dinero [valorMonetario=" + valorMonetario + ", yearEmision=" + yearEmision + ", getValorMonetario()="
                + getValorMonetario() + ", getYearEmision()=" + getYearEmision() + "]";
    }






}