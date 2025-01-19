package lampadina_immagine;

import javax.swing.*;
import java.awt.*;

// Classe che rappresenta la parte grafica (la finestra)
public class LampadinaView {
    private JFrame frame;
    private JButton accendiButton;
    private JButton spegniButton;
    private JLabel statoLabel;
    private JLabel immagineLabel;

    public LampadinaView() {
        // Crea la finestra principale
        frame = new JFrame("Lampadina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Crea un pannello per organizzare i componenti
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Etichetta che mostra lo stato della lampadina
        statoLabel = new JLabel("Stato: SPENTA", SwingConstants.CENTER);
        statoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(statoLabel, BorderLayout.NORTH);

        // Etichetta per mostrare l'immagine della lampadina
        immagineLabel = new JLabel();
        immagineLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setImmagine("spenta");
        panel.add(immagineLabel, BorderLayout.CENTER);

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

    public void setImmagine(String stato) {
        // Cambia l'immagine in base allo stato
        String path = "src/lampadina_immagine/files/lampadina_" + stato + ".png"; // Modifica con il percorso corretto
        ImageIcon icon = new ImageIcon(path);
                
        // Ridimensiona l'immagine per adattarla al pannello
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);

        immagineLabel.setIcon(icon);
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