/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finestre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Prima_finestra extends JFrame{
    
    //si porta il codice della finestra creata in main in questa classe
    //per eliminare il codice della finestra dal main e gestire la finestra
    //in un classe separata
    
    private JTextArea area_di_testo; //più linee di testo
    //private JTextField area_linea_di_testo; //per una singola linea di testo
    
    private JButton bottone;
    private JTextField campo_testo;
    
    
    
    public Prima_finestra(){
        super("titolo della finestra");
        
        setLayout(new BorderLayout());
        //si rimuoverà riferimento a freame, non necessario in questa classe
        
        area_di_testo = new JTextArea();
        JTextField campo_testo = new JTextField("inserisci qui il tuo testo");
        bottone = new JButton("cliccami");
        
        //non aggiungiamo ora i componenti al jframe ma 
        // li aggiungiamo al content pane che è all'interno del jframe
        
        add(area_di_testo, BorderLayout.CENTER);
        add(bottone, BorderLayout.PAGE_START);
        
        bottone.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                area_di_testo.append("testo aggiunto con bottone \n");
                
            }
        }); //actionlistener non è una classe ma un interfaccia

        setSize(800,400);//dimensioni
        setResizable(false);//disabilita ridimensionamento
        setLocationRelativeTo(null);//centrata nello schermo
        //finestra.setLocation(200,200);//punto di apertura in alto a sx
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);//renderla visibile sopo tutto il codice di tutta la finestra
    }
    
}
