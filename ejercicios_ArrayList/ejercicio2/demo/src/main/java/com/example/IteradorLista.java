package com.example;

import java.util.ArrayList;

public class IteradorLista {



    public static Integer funcionBusqueda(ArrayList<Double> arrElementos, Double numeroCache){

        Integer paraIterar = 0;
        Double paraComprobar;
        
        Main.arrIndicesModificables.clear();


        if (arrElementos.contains(numeroCache)) {
            for (paraIterar = 0; paraIterar < arrElementos.size();paraIterar++) {
                System.out.println("Elemento actual en el indice "+ paraIterar +"..."+ arrElementos.get(paraIterar));

                paraComprobar = arrElementos.get(paraIterar);

                if (paraComprobar == numeroCache) {
                    if(paraIterar == 0){
                        System.out.println("Se ha encontrado el valor introducido en... ");
                    }
                    
                    Main.arrIndicesModificables.add(paraIterar);
    

                }
            }
    
    
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }


        return 0;


        
    }




}
