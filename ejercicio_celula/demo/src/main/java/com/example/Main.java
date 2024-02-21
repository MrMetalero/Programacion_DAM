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

    public HiloJuegoVida(char tablero[][], int velocidad) {
        this.tablero = tablero;
        this.velocidad = velocidad;
        estaEncendido = true;

    }

    @Override
    public void run() {
        // Muestra el tablero
        introducirCelulas();
        while (true) {

            if (estaEncendido) {
                mostrarTablero();
                decisionesTablero();
                infectar();
                movimientos++;
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
                e.getMessage();
            }

        }

    }

    public void infectar(){
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                char casillaComprobar = tablero[x][y];

                if ((int) ((Math.random() * 70) + 1) == 69) { // probabilidad 1 entre 70 de infectarse
                    tablero[x][y] = 'x'; // infecta la célula

                }
                
               try {
                if(casillaComprobar == 'x' && (int) ((Math.random() * 5) + 1) == 4){ //Se esparce a todos los cercanos, si se cambia la probabilidad se hace más o menos infeccioso

                    //Diagonales
                    tablero[x+1][y+1] = 'x';
                    tablero[x+1][y-1] = 'x';
                    tablero[x-1][y+1] = 'x';
                    tablero[x-1][y-1] = 'x';

                    //Arriba abajo izquierda derecha
                    tablero[x+1][y] = 'x';
                    tablero[x-1][y] = 'x';
                    tablero[x][y-1] = 'x';
                    tablero[x][y+1] = 'x';
                }

               } catch (ArrayIndexOutOfBoundsException e) {
                
               }

            }
        }

    }



    public void introducirCelulas() {
        tablero[4][7] = VIVO;
        tablero[4][8] = VIVO;
        tablero[4][9] = VIVO;
        tablero[5][8] = VIVO;
        tablero[5][7] = VIVO;
        tablero[3][7] = VIVO;
        tablero[3][8] = VIVO;

    }

    public void decisionesTablero() {
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                char casillaComprobar = tablero[x][y];

                if (casillaComprobar == MUERTO) { // Si está muerto
                    if (checkCasillas(x, y)) { // en caso de 3 o más alrededor
                        tablero[x][y] = VIVO;

                    } else {// en caso de que no tenga 3 cerca
                        if ((int) ((Math.random() * 10) + 1) == 5) { // probabilidad 1 entre 10 de spawnear
                            tablero[x][y] = VIVO; // spawnea
                        } else {
                            tablero[x][y] = MUERTO; // no spawnea
                        }
                    }
                } else { // si está VIVO
                    
                    if (checkCasillas(x, y)) { // en caso de 3 o más alrededor
                        tablero[x][y] = VIVO;
                        if ((int) ((Math.random() * 5) + 1) == 4) { // probabilidad 1 entre 5 de muerte súbita
                            tablero[x][y] = MUERTO; // muerte súbita aunque tenga 3 cerca
                        }

                    } else { // en caso de no tener 3 cerca

                        try {
                            if ((int) ((Math.random() * 2) + 1) == 1 && tablero[x][y] == 'x') { // probabilidad 50/50 de elegir izquierda o derecha
                                tablero[x + 1][y + 1] = MUERTO; // Spawnea una célula a der-arriba
                            }else {
                                try {
                                    tablero[x - 1][y - 1] = MUERTO; // Spawnea una célula a izq-abajo

                                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                                    
                                }

                            }                                

                        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                            
                        }

                        

                         

                    }

                }

            }

        }

    }

    


    // comprobará si hay >3 casillas en VIVO ALREDEDOR
    public boolean checkCasillas(int x, int y) {
        boolean resultadoCheck = false;
        int contadorVivas = 0;
        try {
            if (tablero[x][y - 1] == VIVO) { // debajo
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x][y + 1] == VIVO) { // encima
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x - 1][y] == VIVO) { // izquierda
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x + 1][y] == VIVO) { // derecha
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x - 1][y + 1] == VIVO) { // diagonal izq-arriba
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x + 1][y + 1] == VIVO) { // diagonal der-arriba
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x - 1][y - 1] == VIVO) { // diagonal izq-abajo
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[x + 1][y - 1] == VIVO) { // diagonal der-abajo
                contadorVivas++;
            }
        
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
   
        //si tiene 3 células vivas o más cerca, es true
        if (contadorVivas > 3) {
            resultadoCheck = true;
        }

        return resultadoCheck;
    }

    public void mostrarTablero(){
        String result = "";        
               
        for (int i = 0; i <= tablero.length - 1; i++){
            for (int j = 0; j <= tablero[i].length - 1; j++){
                result += tablero[i][j];
            }
            result += "\n";
            System.out.println(result);
        }
        System.out.print(movimientos);
    }






}





public class Main {
    public static void main(String[] args) {
        char tablero[][] = new char[50][50];

        HiloJuegoVida play = new HiloJuegoVida(tablero, 1000);
        play.start();  
        if (play.movimientos == 150){                
            play.estaEncendido = false;
            return;
        }

    }
}