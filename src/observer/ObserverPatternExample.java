package observer;

/**
* Observer: L'interfaccia definisce il metodo update(int width, int height), 
* che gli Observer (come la classe Display) implementano per ricevere aggiornamenti 
* sulle dimensioni del rettangolo.
* Rettangolo: È la classe "subject" (soggetto) che ha un Observer registrato. 
* Quando la larghezza o l'altezza cambia, il metodo notifyObserver() chiama 
* il metodo update() sugli Observer per informarli del cambiamento.
* Display: Questa è una classe concreta che implementa l'interfaccia Observer e 
* visualizza le dimensioni del rettangolo ogni volta che vengono aggiornate.
* Nel metodo main(), creiamo un oggetto Rettangolo e un Display, impostiamo il 
* Display come osservatore del Rettangolo e poi cambiamo le dimensioni del rettangolo.
* @author mdt
*/

// Interfaccia per l'Observer (chi osserva)
interface Observer {
    void update(int width, int height);
}

// La classe Rettangolo (che genera gli eventi)
class Rettangolo {
    private int width;
    private int height;
    private Observer observer;

    public Rettangolo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Imposta l'Observer
    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    // Modifica la larghezza del rettangolo
    public void setWidth(int width) {
        this.width = width;
        notifyObserver();  // Notifica quando la larghezza cambia
    }

    // Modifica l'altezza del rettangolo
    public void setHeight(int height) {
        this.height = height;
        notifyObserver();  // Notifica quando l'altezza cambia
    }

    // Notifica l'Observer
    private void notifyObserver() {
        if (observer != null) {
            observer.update(width, height);
        }
    }
}

// Un Observer concreto che visualizza le dimensioni del rettangolo
class Display implements Observer {
    @Override
    public void update(int width, int height) {
        System.out.println("Le dimensioni del rettangolo sono: " + width + "x" + height);
    }
}

// Classe principale per testare il pattern
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Crea un rettangolo
        Rettangolo rettangolo = new Rettangolo(10, 5);
        
        // Crea un Observer che visualizzerà le dimensioni
        Display display = new Display();
        
        // Imposta l'Observer sul Rettangolo
        rettangolo.setObserver(display);
        
        // Modifica la larghezza e l'altezza
        rettangolo.setWidth(15);
        rettangolo.setHeight(10);
    }
}
