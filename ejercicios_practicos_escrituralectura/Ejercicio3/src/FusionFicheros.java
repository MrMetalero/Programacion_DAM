import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FusionFicheros {
    static Scanner sc = new Scanner(System.in);
   


    

    public static void funcionFusion(String pathFile1, String pathFile2, String pathFileFinal) throws FileNotFoundException, IOException{
        File archivoFusion = new File(pathFileFinal);

        FileReader fr1 = new FileReader(pathFile1);
        BufferedReader br1 = new BufferedReader(fr1);

        FileReader fr2 = new FileReader(pathFile2);
        BufferedReader br2 = new BufferedReader(fr2);




        if (archivoFusion.exists()) { //Si existe

            System.out.println("El archivo ya existe, quieres sobreescribirlo?");
            Character yesNo = sc.nextLine().charAt(0);

            if (yesNo == 'Y' || yesNo == 'y') { //Si existe y quieres sobreescribir

                FileWriter fw = new FileWriter(archivoFusion);
                BufferedWriter bw = new BufferedWriter(fw);
        
               
                

                int letraCache;
                bw.write("");
                while ((letraCache=br1.read()) != -1) {
                    bw.append((char)letraCache);


                }
                bw.append('_');

                while ((letraCache=br2.read()) != -1) {
                    bw.append((char)letraCache);


                }

                bw.flush();//confirma y cierra el writer
                bw.close();
                br1.close(); //cierra el lector


            }else if (yesNo == 'N'|| yesNo == 'n') { //Si existe y NO quieres sobreescribir
                System.out.println("Operación abortada");
            }


        }else{ //Si NO existe
            FileWriter fw = new FileWriter(archivoFusion);
            BufferedWriter bw = new BufferedWriter(fw);
    
           

            int letraCache;
            bw.write("");

            while ((letraCache=br1.read()) != -1) {
                bw.append((char)letraCache);


            }
            bw.append('_');

            while ((letraCache=br2.read()) != -1) {
                bw.append((char)letraCache);


            }

            bw.flush();//confirma y cierra el writer
            bw.close();

            br1.close(); //cierra el lector

        }
       
    }




}
