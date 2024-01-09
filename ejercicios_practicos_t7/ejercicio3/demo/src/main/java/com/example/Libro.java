package com.example;

public class Libro extends Publicacion implements Prestable {
    
    boolean prestado = false;



    public Libro(int codigo,String titulo, int yearPublicacion){
        super(codigo,titulo,yearPublicacion);
        

    }



    public boolean isPrestado() {
        return prestado;
    }



    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    public String toString(){
        return super.toString() + "Prestado: " + prestado + "\n"; 


    }






    //Implementación de la interfaz.


    @Override
    public void prestado() {
        if (prestado == true){

            System.out.println("El libro está prestado");
        }else {
            System.out.println("El libro no está prestado");
        }
        
    }


    @Override
    public void prestar() {
        // TODO Auto-generated method stub
        prestado = true;


        
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        prestado = false;
    }


}
