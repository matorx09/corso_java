/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampadina_immagine;

import lampadina.*;

/**
 *
 * @author mdt
 */
public class Main {
// Classe principale per avviare l'applicazione

    public static void main(String[] args) {
        // Crea il modello (lampadina)
        Lampadina lampadina = new Lampadina();
        
        // Crea la vista (finestra)
        LampadinaView view = new LampadinaView();
        
        // Collega il modello e la vista con il controller
        new LampadinaController(lampadina, view);
    }
}

