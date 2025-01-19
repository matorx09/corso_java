// Lampadina.java
package lampadina;

// Classe che rappresenta il modello della lampadina
public class Lampadina {
    private StatoLampadina stato;

    public Lampadina() {
        // All'inizio la lampadina è spenta
        this.stato = StatoLampadina.SPENTA;
    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void accendi() {
        // Accende la lampadina solo se non è rotta
        if (stato != StatoLampadina.ROTTA) {
            stato = StatoLampadina.ACCESA;
        }
    }

    public void spegni() {
        // Spegne la lampadina solo se non è rotta
        if (stato != StatoLampadina.ROTTA) {
            stato = StatoLampadina.SPENTA;
        }
    }

    public void rompi() {
        // Rompe la lampadina
        stato = StatoLampadina.ROTTA;
    }
}   