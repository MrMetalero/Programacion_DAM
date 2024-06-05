import java.util.ArrayList;

public class Vehiculo {
    
    String matricula;
    String marca;
    String modelo;
    Double deposito;

    ArrayList<Object> datosVehiculo = new ArrayList<>(); 
    

    public Vehiculo(String matricula,String marca, String modelo,Double deposito ){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;


        datosVehiculo.add(matricula);
        datosVehiculo.add(marca);
        datosVehiculo.add(modelo);
        datosVehiculo.add(deposito);

    }




    


}
