
package lampadina_immagine;
// LampadinaController.java

// Classe che collega il modello (Lampadina) e la vista (LampadinaView)
public class LampadinaController {
    private Lampadina lampadina;
    private LampadinaView view;

    public LampadinaController(Lampadina lampadina, LampadinaView view) {
        this.lampadina = lampadina;
        this.view = view;

        // Mostra lo stato iniziale
        aggiornaVista();
        view.show();

        // Aggiunge azioni ai bottoni
        view.getAccendiButton().addActionListener(e -> {
            lampadina.accendi();
            aggiornaVista();
        });

        view.getSpegniButton().addActionListener(e -> {
            lampadina.spegni();
            aggiornaVista();
        });
    }

    private void aggiornaVista() {
        // Aggiorna lo stato e l'immagine nella vista
        StatoLampadina stato = lampadina.getStato();
        view.setStatoLabel(stato.toString());

        switch (stato) {
            case ACCESA -> view.setImmagine("accesa");
            case SPENTA -> view.setImmagine("spenta");
            case ROTTA -> view.setImmagine("rotta");
        }
    }
}
