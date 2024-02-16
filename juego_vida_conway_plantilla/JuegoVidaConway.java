import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JuegoVidaConway extends Thread {

    public static final char VIVO = '*';
    public static final char MUERTO = ' ';
    public char tablero[][];
    public int velocidad;    
    public ArrayList<HashMap<String, Integer>> coordenadas;
    public boolean isRunning = false;
    public int movimientos = 0;

    private static Scanner sc = new Scanner(System.in);


    public JuegoVidaConway(char tablero[][], int velocidad, ArrayList<HashMap<String, Integer>> coordenadas) {
        this.tablero = tablero;
        this.velocidad = velocidad;
        this.coordenadas = coordenadas;
        isRunning = true;
    }

    public JuegoVidaConway(char tablero[][], int velocidad) {
        this.tablero = tablero;
        this.velocidad = velocidad;
        this.coordenadas = null;
        isRunning = true;
    } 
    public JuegoVidaConway(char tablero[][]) {
        this.tablero = tablero;
    }

    @Override

    public void run() {
        //rellenamos el tablero
        fillTablero();        
        //Si se mandaron coordenadas:
        if (coordenadas != null) {
            addCoordenadas(coordenadas);
        } else {
            test();
        }

        while (true) {
            //mostrar el tablero
            showTablero();
            //ajustar según reglas y sumar un movimiento
            if (isRunning) {
                checkTablero();
                movimientos++;
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
    }

    public void setRunning(boolean b) {
        isRunning = b;
    }

    public void addCoordenadas(ArrayList<HashMap<String, Integer>> coordenadas) {
        //Recorremos todos los hashmap
        for (HashMap<String, Integer> map : coordenadas) {
            try {
                //para todas las posiciones establecidas
                int x = map.get("x");
                int y = map.get("y");
                //activamos sus coordenadas
                tablero[x][y] = VIVO;
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.err.println("test()>ArrayIndexOutOfBoundsException");
            }
        }
    }

       /**
     * Colocar unos valores de prueba
     */
    public void test() {
        try {
            tablero[5][5] = VIVO;
            tablero[5][4] = VIVO;
            tablero[5][6] = VIVO;
            tablero[6][5] = VIVO;
            tablero[6][6] = VIVO;
            tablero[6][7] = VIVO;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.err.println("test()>ArrayIndexOutOfBoundsException");
        }
    } 
    /**
     * Recorre el tablero comprobando en todas las casillas sus alrededores.
     * Comprobamos su estado. Si está 0: si tiene 3 activos entonces 1. Si está
     * 1: si tiene 2 o 3 activos entonces 1. Si está 1: si tiene menos de 2
     * activos entonces 0
     */
    public void checkTablero() {
        boolean flag;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                char casilla = tablero[i][j];
                //Si la célula está muerta
                if (casilla == MUERTO) {
                    //puede nacer o seguir muerta
                    flag = checkCasilla(false, i, j);
                } //Si la célula está viva
                else {
                    //puede sobrevivir o morir
                    flag = checkCasilla(true, i, j);
                }
                if (flag) {
                    tablero[i][j] = VIVO;
                } else {
                    tablero[i][j] = MUERTO;
                }
            }
        }
    }

    /**
     * Comprobar la célula
     *
     * @param flag muestra el estado actual de la célula
     * @param i coordenada en el eje x de la matriz
     * @param j coordenada en el eje y de la matriz
     * @return si debe vivir, sobrevivir o morir
     */
    public boolean checkCasilla(boolean flag, int i, int j) {
        int count = 0;
        try {
            if (tablero[i - 1][j - 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i - 1][j] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i - 1][j + 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i][j - 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        //if(tablero[i][j] == '1')count++;//la casilla en cuestión
        try {
            if (tablero[i][j + 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i + 1][j - 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i + 1][j] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (tablero[i + 1][j + 1] == VIVO) {
                count++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        //Si está muerta y tiene 3 o más vivas 
        if (!flag && count == 3) {
            return true;
        }
        //si está viva y tiene 2 o 3 vivas sigue viva
        if (flag && (count == 2 || count == 3)) {
            return true;
        }
        //de lo contrario muere
        return false;
    }

    public void fillTablero() {
        for (int i = 0; i <= tablero.length - 1; i++) {
            for (int j = 0; j <= tablero[i].length - 1; j++) {
                tablero[i][j] = MUERTO;
                //tablero[i][j] = VIVO;
                //System.out.print(tablero[i][j]);
                
            }
            //System.out.print("\n");
        }        
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void showTablero(){
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




    public static void main(String[] args){
        char tablero[][] = new char[30][30];
        

        JuegoVidaConway play = new JuegoVidaConway(tablero,1000);
        play.start();  
        play.isRunning = true; 
        while (true){
            if (sc.next().charAt(0) == 'e'){                
                play.isRunning = false;
                return;
            }
        }
       
    }

    
    
    

}

