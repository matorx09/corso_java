/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rettangolo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mdt
 */
// CONTROLLER - Gestione eventi
class RettangoloController {
    private RettangoloView view;

    public RettangoloController(RettangoloView view) {
        this.view = view;
        this.view.addCalcolaListener(new CalcolaListener());
        this.view.addResetListener(new ResetListener());
    }


    class CalcolaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double base = Double.parseDouble(view.getBase());
                double altezza = Double.parseDouble(view.getAltezza());
                RettangoloModel model = new RettangoloModel(base, altezza);

                //view.setRisultati(model.getArea(), model.getPerimetro(), model.getDiagonale());
                
                //arrotondamento a due cifre decimali
                view.setRisultati(
                Math.round(model.getArea() * 100.0) / 100.0,
                Math.round(model.getPerimetro() * 100.0) / 100.0,
                Math.round(model.getDiagonale() * 100.0) / 100.0
                );
                                
                                        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Inserisci numeri validi!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.resetCampi();
        }
    }
}
/**
 * metodi di arrotondamento a due cifre decimali
 * 
 * Metodo con String.format() (Semplice e consigliato per la visualizzazione)

double numero = 5.8367;
String risultato = String.format("%.2f", numero);
System.out.println(risultato); // Output: 5.84
* 
* 
* Metodo con Math.round() (Arrotondamento matematico)

double numero = 5.8367;
double risultato = Math.round(numero * 100.0) / 100.0;
System.out.println(risultato); // Output: 5.84
* 
* 
* 
* Metodo con DecimalFormat (Utile per formattare in JLabel o JTextField)

import java.text.DecimalFormat;

double numero = 5.8367;
DecimalFormat df = new DecimalFormat("#.##"); 
String risultato = df.format(numero);
System.out.println(risultato); // Output: 5.84
* 
* 
* 
* Metodo con BigDecimal (Preciso per calcoli finanziari)

import java.math.BigDecimal;
import java.math.RoundingMode;

double numero = 5.8367;
BigDecimal bd = new BigDecimal(numero).setScale(2, RoundingMode.HALF_UP);
System.out.println(bd.doubleValue()); // Output: 5.84
* 
 */
