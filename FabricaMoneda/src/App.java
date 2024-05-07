import objetodinero.Moneda;

public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

   
    Moneda unEuro = new Moneda(2, 3);
    unEuro.setValorMonetario(1);
    unEuro.setYearEmision(2010);
    
        System.out.println("\n"+unEuro.toString());
    
    }
}
