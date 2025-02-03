/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rettangolo;

/**
 *
Spiegazione del codice
Model (RettangoloModel)

Contiene i metodi per calcolare area, perimetro e diagonale.
View (RettangoloView)

Contiene i campi di input (JTextField), pulsanti (JButton) e etichette (JLabel).
Ha un metodo setRisultati() per aggiornare i risultati.
Controller (RettangoloController)

Assegna un ActionListener al pulsante per leggere i dati e aggiornare la View.
Converte i valori da String a double e gestisce gli errori.
Main (RettangoloApp)

Inizializza RettangoloView e RettangoloController.
Esempio di Esecuzione
L'utente inserisce Base: 5 e Altezza: 3.
Clicca su "Calcola".
L'app mostra:
Area: 15
Perimetro: 16
Diagonale: 5.83
Se l'utente inserisce valori non numerici, appare un messaggio di errore
* 
 */



// MAIN - Avvia il programma
public class RettangoloApp {
    public static void main(String[] args) {
        RettangoloView view = new RettangoloView();
        new RettangoloController(view);
        view.setVisible(true);
    }
}
