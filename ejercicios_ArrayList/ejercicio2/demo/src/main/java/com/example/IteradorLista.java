package com.example;

import java.util.ArrayList;

public class IteradorLista {



    public static ArrayList<Integer> funcionBusqueda(ArrayList<Double> arrElementos, Double numeroCache){

        ArrayList<Integer> arrIndices = new ArrayList<Integer>();

        if (arrElementos.contains(numeroCache)) {
            for (int i = 0; i < arrElementos.size();i++) {
                if (arrElementos.get(i) == numeroCache) {
                    if(i == 0){
                        System.out.println("Se ha encontrado el valor introducido en... ");
                    }
                    arrIndices.add(i);
                    
    

                }
            }
    
    
        } else {

        }


        return arrIndices;


        
    }



    



}
