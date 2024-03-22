package com.example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
       
        int i;
        String textoCache = null;
        try {
            FileReader fr = new FileReader("demo/src/main/resources/texto.txt");
            BufferedReader br = new BufferedReader(fr); //Lector Buffer


            FileWriter fw = new FileWriter("demo/src/main/resources/texto.txt");
            BufferedWriter bw = new BufferedWriter(fw); // Escritor Buffer

            Lector.modificarFichero(fr);
            while (br.ready()) {
                if ((char) br.read() == ' ') {
                    
                }
            
            }


        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
        

    }
}