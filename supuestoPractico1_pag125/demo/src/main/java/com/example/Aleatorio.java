package com.example;
import java.util.*;

public class Aleatorio {
    
int numeroDado1;
int numeroDado2;
static Random numeroRandom1 = new Random();


public void Aleatorio(){

    getNumeroAleatorio1();
    getNumeroAleatorio2();

}


    public int getNumeroAleatorio1() {
        this.numeroDado1 = numeroRandom1.nextInt();
        return numeroDado1;
    }



    public int getNumeroAleatorio2() {
        this.numeroDado2 = numeroRandom1.nextInt();
        return numeroDado2;
    }

 
}

