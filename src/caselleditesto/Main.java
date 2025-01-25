package caselleditesto;

import javax.swing.*;
import java.awt.*; 
public class Main { 

    private static Container contentPane;
    public static void main(String[] args) {
       
     JFrame f = new JFrame("Area di testo");
   
     JPanel p = new JPanel(); 

     JTextArea messaggi = new JTextArea(10, 30); 

     p.add(messaggi);

     contentPane = f.getContentPane(); 
     contentPane.add(p); 
     f.setSize(500, 300);
     f.setLocation(100, 0);
     f.setVisible(true); }
     }