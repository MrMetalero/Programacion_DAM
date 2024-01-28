package com.example;

import java.util.ArrayList;

public class IteradorLista {



    public static ArrayList<Integer> funcionBusqueda(ArrayList<Double> arrElementos, Double numeroCache){

        ArrayList<Integer> arrIndices = new ArrayList<Integer>();

        arrIndices.clear();
        Main.arrIndicesModificables.clear();


        if (arrElementos.contains(numeroCache)) {
            for (int i = 0; i < arrElementos.size();i++) {
                if (arrElementos.get(i) == numeroCache) {
                    if(i == 0){
                        System.out.println("Se ha encontrado el valor introducido en... ");
                    }
                    arrIndices.add(i);
                    Main.arrIndicesModificables.add(i);
    

                }
            }
    
    
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }


        return arrIndices;


        
    }




}
