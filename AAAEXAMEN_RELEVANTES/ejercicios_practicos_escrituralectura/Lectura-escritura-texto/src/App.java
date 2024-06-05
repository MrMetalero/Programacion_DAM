import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        String pathFile = "";

        try {
            System.out.println("Por favor introduce la ruta de el archivo de texto");

            pathFile = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

        try {
            
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);

            int j = 0;
            Character characterCache;
            String stringCache = "";
            String stringCompleto = "";

            while((j=br.read()) != -1) {
                characterCache = (char)j;
    
            
                if (characterCache.toString().matches("[a-z]")) {
                    stringCache = characterCache.toString().toUpperCase();

                }else if(characterCache.toString().matches("[A-Z]")){
                    stringCache = characterCache.toString().toLowerCase();
                } else{
                    stringCache = characterCache.toString();

                }

                stringCompleto +=stringCache;

    
                
    
    
            }
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(stringCompleto);
            bw.close();
            fw.close();


        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

     
        ;








    }
}
