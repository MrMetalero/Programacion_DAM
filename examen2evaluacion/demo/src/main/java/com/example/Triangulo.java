package com.example;

public class Triangulo extends Figura {

    // Solo equilateros o isosceles
    Double baseLado1 = baseLado;

    public Triangulo(Double baseLados, Double longAltura) {
        super(baseLados, longAltura);

    }
    public Triangulo(Double baseLados,Double baseLados1, Double longAltura) {
        super(baseLados, longAltura);
        baseLado1 = baseLados1;
    }

    @Override
    public Double calculoArea(){


        return (baseLado*altura)/2;
    }
  
    @Override
    public Double calculoPerimetro(){
        //Caso equilatero:
        if(baseLado == baseLado1){
            return baseLado + baseLado + baseLado;


        }else{ //En caso de que sea isosceles, porque no dejamos introducir 3 lados
            return baseLado + baseLado1 + baseLado1;

        }

        
    }

    @Override
    public String toString() {
     
        return super.toString() + "\nArea: " + calculoArea() + " \nPerímetro: " + calculoPerimetro();

    }


}
