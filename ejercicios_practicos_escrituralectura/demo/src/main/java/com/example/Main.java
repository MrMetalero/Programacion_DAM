package com.example;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
       

            File fichero = new File("/resources/texto.txt");

            try {
                FileReader lector = new FileReader(fichero);
            } catch (FileNotFoundException e) {
            
                e.printStackTrace(); //Error archivo no encontrado
            }

            FileInputStream fileInStr;
            try {
                fileInStr = new FileInputStream(fichero);
            } catch (FileNotFoundException e) {
                
                e.printStackTrace(); //Error archivo no encontrado
            }
            BufferedInputStream bInputStr = new BufferedInputStream(fileInStr);
            
            int i;

            try {
                while ((i=bInputStr.read()) != -1) {
                    System.out.println((char)i);
                }
            } catch (IOException e) {
            
                e.printStackTrace();
            }

            try {
                bInputStr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                fileInStr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }



    }
}