package org.lessons.bonus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

//    void calcoloPrezzoGiovani() {
//        Ticket ticket = new Ticket(100, 17);
//        double prezzoBase = 100 * 0.21;
//        double sconto = prezzoBase * 0.20; // 20% di sconto per i giovani
//        double prezzoAtteso = prezzoBase - sconto;
//        assertEquals(prezzoAtteso, ticket.calcolaPrezzo(), 0.01, "Prezzo scontato per giovani non corretto");
//    }
//@Test
//void calcoloPrezzoAnziani() {
//    Ticket ticket = new Ticket(100, 66);
//    double prezzoBase = 100 * 0.21;
//    double sconto = prezzoBase * 0.40; // 40% di sconto per gli anziani
//    double prezzoAtteso = prezzoBase - sconto;
//    assertEquals(prezzoAtteso, ticket.calcolaPrezzo(), 0.01, "Prezzo scontato per anziani non corretto");
//}
//
//    @Test
//    void calcoloPrezzoStandard() {
//        Ticket ticket = new Ticket(100, 30);
//        double prezzoBase = 100 * 0.21; // Nessuno sconto applicato
//        assertEquals(prezzoBase, ticket.calcolaPrezzo(), 0.01, "Prezzo standard non corretto");
//    }
    @Test
    @DisplayName("controllo prezzo giovani")
    void calcoloPrezzoGiovani() {
        Ticket ticket = new Ticket(100, 15);
        assertEquals(16.8, ticket.calcolaPrezzo(), 0.01, "Prezzo scontato per giovani non corretto");
    }

    @Test
    @DisplayName("controllo prezzo anziani")
    void calcoloPrezzoAnziani() {
        Ticket ticket = new Ticket(100, 66);
        assertEquals(12.6, ticket.calcolaPrezzo(), 0.01, "Prezzo scontato per anziani non corretto");
    }

    @Test
    @DisplayName("controllo prezzo standard")
    void calcoloPrezzoStandard() {
        Ticket ticket = new Ticket(100, 30);
        assertEquals(21.0, ticket.calcolaPrezzo(), 0.01, "Prezzo standard non corretto");
    }

    @Test
    @DisplayName("solleva un'eccezione se la distanza è negativa")
    void getChilometri() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-10, 30), "Dovrebbe lanciare un'eccezione per chilometri negativi");
    }

    @Test
    @DisplayName("solleva un'eccezione se l'età è negativa")
    void getEta() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(10, -30), "Dovrebbe lanciare un'eccezione per età negativa");
    }
}