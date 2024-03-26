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
            pathFile = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

        try {
            
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);

            int j = 0;
            String characterCache = "";
            while((j=br.read()) != -1) {
                characterCache += (char)j;
    
                for (int i = 0; i < characterCache.length(); i++) {
                    if (characterCache.charAt(i).matches("[a-z]")) {
                        FileWriter fw = new FileWriter("resources/text.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        Character.toUpperCase(characterCache);
                        fw.write(characterCache);
                        bw.close();
                        fw.close();
    
                    }else if(characterCache.toString().matches("[A-Z]")){
                        FileWriter fw = new FileWriter("resources/text.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        Character.toLowerCase(characterCache);
                        fw.write(characterCache);
                        bw.close();
                        fw.close();
                    } else{
                        FileWriter fw = new FileWriter("resources/text.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        fw.write(characterCache);
                        bw.close();
                        fw.close();
    
    
                    }
                }
    
                
    
    
            }


        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

     
        ;








    }
}
