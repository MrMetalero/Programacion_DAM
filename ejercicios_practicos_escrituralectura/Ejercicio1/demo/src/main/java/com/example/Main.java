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
        String textoCache = "";
        try {
            FileReader fr = new FileReader("demo/src/main/resources/texto.txt");
            BufferedReader br = new BufferedReader(fr); //Lector Buffer


            
            while ((i=br.read())!= -1) {

                if ((char)i != ' '){
                textoCache  += (char)i;
                }
                
                System.out.println(textoCache);
            }
        br.close(); // necesarios para que se efectue la lectura correctamente ??
        fr.close();

        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        

        FileWriter fw;
        try {
            fw = new FileWriter("demo/src/main/resources/texto.txt");
            BufferedWriter bw = new BufferedWriter(fw); // Escritor Buffer

            bw.write(textoCache);
            bw.close(); // necesarios para que se efectue la escritura correctamente
            fw.close(); // si no se ponen no se guarda nada en el archivo
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        
        
        
        

    }
}