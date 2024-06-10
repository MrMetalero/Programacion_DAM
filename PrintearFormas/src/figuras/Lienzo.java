package figuras;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Lienzo
 * compuesto por [dimensionX][dimensionY]
 */
public class Lienzo {

    Integer dimensionX = 20;
    Integer dimensionY = 20;
    String[][] lienzo;

    public Lienzo(){
    lienzo = new String[dimensionY][dimensionX];
        introducirCaracteresFondo();
    }

    /**
     * Lienzo
     * compuesto por [dimensionX][dimensionY]
     */
    public Lienzo(Integer dimX, Integer dimY){
        lienzo = new String[dimY][dimX];
        dimensionX = dimX;
        dimensionY = dimY;
        introducirCaracteresFondo();
    }
    


    public  void dibujarLienzo(){

        for (String[] e : lienzo) {     
            for (String i : e){
                System.out.print(i);
            }
           System.out.println();
        }

    }

    public  void introducirCaracteresFondo(){
        int x = 0;
        int y = 0;

        for (String[] e : lienzo) {     
            x=0;
            for (String i : e){
                lienzo[y][x]=" ";
                x++;
            }
            y++;
        }

        


    }


    public static  String[][] introducirCaracteresPrueba(String[][] arrayInput){
        
        arrayInput[1][1] = "-";
        arrayInput[2][2] = "-";
        arrayInput[3][3] = "-";
        arrayInput[4][4] = "-";
        arrayInput[5][5] = "-";

        
        return arrayInput;

    }

    public Integer getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(Integer dimensionX) {
        this.dimensionX = dimensionX;
    }

    public Integer getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(Integer dimensionY) {
        this.dimensionY = dimensionY;
    }

    public String[][] getLienzo() {
        return lienzo;
    }

    public void setLienzo(String[][] lienzo) {
        this.lienzo = lienzo;
    }

   

  


}