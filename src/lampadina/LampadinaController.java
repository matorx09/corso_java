/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadina;
// LampadinaController.java


// Classe che collega il modello (Lampadina) e la vista (LampadinaView)
public class LampadinaController {
    private Lampadina lampadina;
    private LampadinaView view;

    public LampadinaController(Lampadina lampadina, LampadinaView view) {
        this.lampadina = lampadina;
        this.view = view;

        // Mostra lo stato iniziale
        view.setStatoLabel(lampadina.getStato().toString());
        view.show();

        // Aggiunge azioni ai bottoni
        view.getAccendiButton().addActionListener(e -> {
            lampadina.accendi();
            view.setStatoLabel(lampadina.getStato().toString());
        });

        view.getSpegniButton().addActionListener(e -> {
            lampadina.spegni();
            view.setStatoLabel(lampadina.getStato().toString());
        });
    }
}
