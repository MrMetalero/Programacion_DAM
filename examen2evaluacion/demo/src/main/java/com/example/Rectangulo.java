package com.example;

public class Rectangulo extends Figura {

    public Rectangulo(Double baseLados, Double longAltura) {
        super(baseLados, longAltura);





    }

    @Override
    public String toString() {
     
        return super.toString() + "\nArea: " + calculoArea() + " \nPerímetro: " + calculoPerimetro();

    }

}
