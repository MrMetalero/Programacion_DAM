package com.example;

public abstract class Producto {

    String fechaCaducidad;
    Integer numeroLote;

    String fechaEnvasado;
    String paisOrigen;

    //Constructor

    public Producto(String fCadu,Integer numLote,String fechaEnv,String paisOrig){
        fechaCaducidad = fCadu;
        numeroLote = numLote;
        fechaEnvasado = fechaEnv;
        paisOrigen = paisOrig;
        
    }








    public String getFechaCaducidad() {
        return fechaCaducidad;
    }




   public String getFechaEnvasado() {
    return fechaEnvasado;
}








public void setFechaEnvasado(String fechaEnvasado) {
    this.fechaEnvasado = fechaEnvasado;
}








public String getPaisOrigen() {
    return paisOrigen;
}








public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
}








 public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }




    public Integer getNumeroLote() {
        return numeroLote;
    }




    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }




    public String toString(){
        return"Detalles del producto:\n\n"
                +"Fecha de caducidad: " + fechaCaducidad +"\n"
                +"Número de lote: " + numeroLote + "\n"
                +"Fecha de envasado: " + fechaEnvasado + "\n"
                +"Pais de origen: " + paisOrigen + "\n";


    }




}
