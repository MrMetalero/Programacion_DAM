package com.example;

public class Raices {
    
    double a,b,c;
    double resultado1 = 0;
    double resultado2 = 0;
    double discriminante;




    Raices(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = getDiscriminate();



    }





    public int obtenerRaices(){
        if(getDiscriminate() > 0){

            resultado1=(-b+Math.sqrt(((Math.pow(b, 2))-(4*a*c)))/(2*a));

            resultado2=(-b-Math.sqrt(((Math.pow(b, 2))-(4*a*c)))/(2*a));

        } else if(getDiscriminate() == 0){

            resultado1=(-b+Math.sqrt(((Math.pow(b, 2))-(4*a*c)))/(2*a));

        }else{

            System.out.println("NO TIENE SOLUCIÓN");

        }
        



        return 0;
    
    } 

    



    int obtenerRaiz(){

            



        return 0;
    }




    double getDiscriminate(){
        // (b^2)-4*a*c
        

        return (Math.pow(b, 2))-(4*a*c);
    }




    boolean tieneRaices(){
        boolean resultadoTieneRaices = true;
        //discriminante mayor que 0
        if(getDiscriminate() > 0){
            resultadoTieneRaices = true;

        }else 
        if(getDiscriminate() == 0){
            resultadoTieneRaices = false;

        }else{
            resultadoTieneRaices = false;
        }


        return resultadoTieneRaices;
    }






    boolean tieneRaiz(){
   


        return getDiscriminate() > 0;
    }

    String calcular(){




        return "";
    }





}
