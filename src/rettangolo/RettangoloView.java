/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rettangolo;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mdt
 */
// VIEW - Interfaccia Grafica
class RettangoloView extends JFrame {
    private JTextField txtBase, txtAltezza;
    private JLabel lblArea, lblPerimetro, lblDiagonale;
    private JButton btnCalcola;
    private JButton btnReset;
    

    public RettangoloView() {
        setTitle("Calcolatore Rettangolo");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Componenti UI
        add(new JLabel("Base:"));
        txtBase = new JTextField();
        add(txtBase);

        add(new JLabel("Altezza:"));
        txtAltezza = new JTextField();
        add(txtAltezza);

        btnCalcola = new JButton("Calcola");
        add(btnCalcola);
        
        btnReset = new JButton("Reset");
        add(btnReset);

        lblArea = new JLabel("Area: ");
        add(lblArea);

        lblPerimetro = new JLabel("Perimetro: ");
        add(lblPerimetro);

        lblDiagonale = new JLabel("Diagonale: ");
        add(lblDiagonale);
    }

    public String getBase() {
        return txtBase.getText();
    }

    public String getAltezza() {
        return txtAltezza.getText();
    }

    public void setRisultati(double area, double perimetro, double diagonale) {
        lblArea.setText("Area: " + area);
        lblPerimetro.setText("Perimetro: " + perimetro);
        lblDiagonale.setText("Diagonale: " + diagonale);
    }

    public void resetCampi() {
        txtBase.setText("");
        txtAltezza.setText("");
        lblArea.setText("Area: ");
        lblPerimetro.setText("Perimetro: ");
        lblDiagonale.setText("Diagonale: ");
    }
        
    public void addCalcolaListener(ActionListener listener) {
        btnCalcola.addActionListener(listener);
    }
        
    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }



}

