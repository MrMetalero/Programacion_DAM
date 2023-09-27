package java_ventanas;
import java.util.*;
import java.awt.*;
import javax.swing.*;


public class TopLevelWindow{
    


    public static void createWindow(){
        int control = 1;


        JFrame frame = new JFrame("Ventana");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));

        Panel panel1 = new Panel(); 
        panel1.setMinimumSize(new Dimension(500,500));


        frame.getContentPane().add(textLabel,BorderLayout.CENTER);

        frame.add(panel1);



        frame.setMinimumSize(new Dimension(700,700));
        frame.setLocation(20, 29);
        
        




        //Muestra la pantalla:
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


    
    

    }



        
    public static void main(String[]args){

        createWindow();




    }




}
