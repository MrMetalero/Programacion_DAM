package com.example;

public class Trapecio extends Figura {
    Double baseLado2;

    public Trapecio(Double baseLados, Double baseLado2, Double longAltura) {
        super(baseLados, longAltura);
        this.baseLado2 = baseLado2;
    }


    @Override
    public Double calculoArea(){


        return ((baseLado + baseLado2)*altura)/2;
    }


    @Override
    public Double calculoPerimetro(){
        //Pitágoras para averiguar el lado a del Trapecio
        // c² = a²+b²;
        // c²-a² = b²
        // c²-b² = a²

        // Baselado tiene que ser la base grande siempre
        Double restoBase = baseLado - baseLado2;

        Double ladoOblicuo = Math.sqrt((altura*altura) + (restoBase*restoBase));

         //     Las bases desiguales +  La suma de ambos lados iguales
        return baseLado + baseLado2 + (ladoOblicuo + ladoOblicuo) ;
    }

}
