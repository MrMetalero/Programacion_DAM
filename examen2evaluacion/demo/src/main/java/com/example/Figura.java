package com.example;

import java.util.HashMap;

public abstract class Figura {

    Double baseLado;
    Double altura;

    public static HashMap<Integer, Character> dibujoCaracter = new HashMap<>();
    
   


    public Figura(Double baseLados, Double longAltura) {
        baseLado = baseLados;
        altura = longAltura;

    }

    public Double calculoArea(){


        return baseLado*altura;
    }


    public Double calculoPerimetro(){


        return 2*(baseLado+altura);
    }


    @Override
    public String toString() {
        String clasefigura = getClass().toString();
        String stringFigura = "\nEsta figura [" + clasefigura.substring(18) + "] tiene... \nBase: " + baseLado + "\n"
                + "Altura: " + altura;

        return stringFigura;

    }


    
}
