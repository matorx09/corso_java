/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadina;

/**
 *
 * @author mdt
 */
// LampadinaView.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe che rappresenta la parte grafica (la finestra)
public class LampadinaView {
    private JFrame frame;
    private JButton accendiButton;
    private JButton spegniButton;
    private JLabel statoLabel;

    public LampadinaView() {
        // Crea la finestra principale
        frame = new JFrame("Lampadina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crea un pannello per organizzare i componenti
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Etichetta che mostra lo stato della lampadina
        statoLabel = new JLabel("Stato: SPENTA", SwingConstants.CENTER);
        statoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(statoLabel, BorderLayout.CENTER);

        // Bottoni per accendere e spegnere la lampadina
        accendiButton = new JButton("Accendi");
        spegniButton = new JButton("Spegni");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(accendiButton);
        buttonPanel.add(spegniButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
    }

    public void setStatoLabel(String stato) {
        // Cambia il testo dell'etichetta
        statoLabel.setText("Stato: " + stato);
    }

    public JButton getAccendiButton() {
        return accendiButton;
    }

    public JButton getSpegniButton() {
        return spegniButton;
    }

    public void show() {
        // Mostra la finestra
        frame.setVisible(true);
    }
}