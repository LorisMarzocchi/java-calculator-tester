package org.lessons.bonus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci i chilometri:");
        int chilometri = scan.nextInt();
        System.out.println("Inserisci l'età:");
        int eta = scan.nextInt();

        try {
            Ticket ticket = new Ticket(chilometri, eta);
            double prezzoFinale = ticket.calcolaPrezzo();
            System.out.println("Il prezzo totale del biglietto è: " + df.format(prezzoFinale) + " €");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
