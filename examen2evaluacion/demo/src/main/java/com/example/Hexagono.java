package com.example;

public class Hexagono extends Figura {

    public Hexagono(Double baseLados, Double longAltura) {
        super(baseLados, longAltura);

    }


    @Override
    public Double calculoArea(){

        //La apotema mirando el dibujo sería igual de grande que la mitad
        //de la altura
        Double apotemaHexagono = (altura/2);

        //Formula del area de hexa
        return (apotemaHexagono * calculoPerimetro())/2;
    }


    @Override
    public Double calculoPerimetro(){
        //Pitágoras para averiguar el lado que hace de apotema entre el centro
        //y la esquina del hexágono
        // c² = a²+b²;
        // c²-a² = b²
        // c²-b² = a²

        // Pitagoras para sacar el radio (del centro a la esquina del hexa)
       
        //Double radioHexa = ((altura/2)*(altura/2)) + ((baseLado/2)*(baseLado/2));

        
        Double perimetroHexa = 6 * baseLado;




        return perimetroHexa  ;
    }

}
