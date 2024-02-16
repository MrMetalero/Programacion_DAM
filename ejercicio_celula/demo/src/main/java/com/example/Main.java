package com.example;

import java.util.Scanner;

//Thread sirve ahora para usar play, sleep etc...
class HiloJuegoVida extends Thread {
    static Scanner sc = new Scanner(System.in);
    public static final char VIVO = '*';
    public static final char MUERTO = ' ';
    public char tablero[][];
    public int velocidad;    

    public boolean estaEncendido = false;
    public int movimientos = 0;

    public HiloJuegoVida(char tablero[][], int velocidad){
        this.tablero = tablero;
        this.velocidad = velocidad;
        estaEncendido = true;

    }


    @Override
    public void run(){

        


    }

    public void introducirCelulas(){
        tablero[4][7] = VIVO;
        tablero[4][8] = VIVO;
        tablero[4][9] = VIVO;
        tablero[5][8] = VIVO;
        tablero[5][7] = VIVO;
        tablero[3][7] = VIVO;
        tablero[3][8] = VIVO;


    }




    public void mostrarTablero(){
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                char casillaComprobar = tablero[x][y];

                if(casillaComprobar == MUERTO){ //Si está muerto
                    if(checkCasillas(x, y)){ // en caso de 3 o más alrededor
                        tablero[x][y] = VIVO;

                    }else{//en caso de que no tenga 3 cerca
                        if((int)((Math.random()*10)+1) == 5 ){ //probabilidad 1 entre 10 de spawnear
                            tablero[x][y] = VIVO; //spawnea
                        }else{
                            tablero[x][y] = MUERTO; //no spawnea
                        }
                    }
                }else{ // si está VIVO
                    if(checkCasillas(x, y)){ // en caso de 3 o más alrededor
                        tablero[x][y] = VIVO;
                        if((int)((Math.random()*20)+1) == 10 ){ //probabilidad 1 entre 20 de muerte súbita
                            tablero[x][y] = MUERTO; //muerte súbita aunque tenga 3 cerca
                        }

                    }else{ // en caso de no tener 3 cerca
                        

                    }

                }
                



            }



        }


    }

    //comprobará si hay >3 casillas en VIVO ALREDEDOR
    public boolean checkCasillas(int x, int y){
        boolean resultadoCheck = false;
        int contadorVivas = 0;
        if(tablero[x][y-1] == VIVO){ // debajo
            contadorVivas++;
        }else if(tablero[x][y+1] == VIVO){ // encima
            contadorVivas++;
        }else if(tablero[x-1][y] == VIVO){ // izquierda
            contadorVivas++;
        }else if(tablero[x+1][y] == VIVO){ // derecha
            contadorVivas++;
        }else if(tablero[x-1][y+1] == VIVO){ // diagonal izq-arriba
            contadorVivas++;
        }else if(tablero[x+1][y+1] == VIVO){ // diagonal der-arriba
            contadorVivas++;
        }else if(tablero[x-1][y-1] == VIVO){ // diagonal izq-abajo
            contadorVivas++;
        }else if(tablero[x+1][y-1] == VIVO){ // diagonal der-abajo
            contadorVivas++;
        }

        if(contadorVivas > 3){
            resultadoCheck = true;
        }

        return resultadoCheck;
    }




}


public class Main {
    public static void main(String[] args) {
        char tablero[][] = new char[30][30];







    }
}