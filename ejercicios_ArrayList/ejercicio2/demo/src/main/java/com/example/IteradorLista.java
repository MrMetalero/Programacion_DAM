package com.example;

import java.util.ArrayList;

public class IteradorLista {


    public static void funcionBusqueda(ArrayList<Double> arrElementos, Double numeroCache){

        Integer paraIterar = 0;
       
        
        Main.arrIndicesModificables.clear();


        if (arrElementos.contains(numeroCache)) {
            for (paraIterar = 0; paraIterar < arrElementos.size();paraIterar++) {

                if (Double.compare(arrElementos.get(paraIterar), numeroCache) == 0) {
                    System.out.println("Elemento actual en el indice "+ paraIterar +"..."+ arrElementos.get(paraIterar));

                }
            }
    
    
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }
        
    }




    public static void funcionModificar(ArrayList<Double> arrElementos, Double numeroCache){

        Integer paraIterar = 0;
        Double paraComprobar;
        
        Main.arrIndicesModificables.clear();


        if (arrElementos.contains(numeroCache)) {
            for (paraIterar = 0; paraIterar < arrElementos.size();paraIterar++) {
                System.out.println("Elemento actual en el indice "+ paraIterar +"..."+ arrElementos.get(paraIterar));

                paraComprobar = arrElementos.get(paraIterar);

                if ( Double.compare(paraComprobar, numeroCache) == 0 ) { /*paraComprobar == numeroCache no funcionaba*/
                    if(paraIterar == 0){
                        System.out.println("Se ha encontrado el valor introducido en... [" + paraIterar + "]");
                    }
                    
                    Main.arrIndicesModificables.add(paraIterar);
    

                }
            }
    
    
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }


        
    }


    public static void funcionBorrar(ArrayList<Double> arrElementos, Double numeroCache){

        Integer paraIterar = 0;
        Double paraComprobar;
        
        Main.arrIndicesModificables.clear();


        if (arrElementos.contains(numeroCache)) {
            for (paraIterar = 0; paraIterar < arrElementos.size();paraIterar++) {
                System.out.println("Elemento actual en el indice "+ paraIterar +"..."+ arrElementos.get(paraIterar));

                paraComprobar = arrElementos.get(paraIterar);

                if ( Double.compare(paraComprobar, numeroCache) == 0 ) { /*paraComprobar == numeroCache no funcionaba*/
                    if(paraIterar == 0){
                        System.out.println("Se ha encontrado el valor introducido en... [" + paraIterar + "] BORRANDO...");
                    }
                    
                    Main.arrIndicesModificables.add(paraIterar);
    

                }
            }
    
    
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }


        
    }













    




}
