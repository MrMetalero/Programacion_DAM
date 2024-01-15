package com.example;

class TestForma {
    
 


}

class Forma  {
    public Forma(){

    };    
    
    public void identidad() {
        System.out.println("Forma");
    }
}

class Circulo extends Forma{

   
    @Override
    public void identidad() {
        System.out.println("Circulo");

    }





}

class Cuadrado extends Forma{

    @Override
    public void identidad() {
        System.out.println("Cuadrado");

    }


    
}

class Triangulo  extends Forma{


    @Override
    public void identidad() {
        System.out.println("Triangulo");

    }

    
}

class Rombo  extends Forma{

    @Override
    public void identidad() {
        System.out.println("Rombo");

    }


    
}



    
    


    