package proyecto1.demo.src.main.java.com.example;

class Producto {
    
    float precio;
    float precioFinal;
    static float rebaja;
    

    Producto(float precio){
        rebaja = 0;
        this.precio = precio;
    }

    public static void infoRebajaActual(){
        
        System.out.println("Rebaja actual: "+ rebaja + "%");
    }


    


    public float getPrecioFinal(){

    if (rebaja !=0) {
        precioFinal = (precio - (precio*rebaja/100)); 

    }else{
        precioFinal = precio;

    }
    return precioFinal;

    }


}
