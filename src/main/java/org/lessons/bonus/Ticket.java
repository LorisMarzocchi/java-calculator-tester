package org.lessons.bonus;

public class Ticket {
    private static final double COSTO_PER_KM = 0.21;
    private static final double SCONTO_GIOVANI = 0.20; // 20%
    private static final double SCONTO_ANZIANI = 0.40; // 40%

    private int chilometri;
    private int eta;

    public Ticket(int chilometri, int eta) throws IllegalArgumentException {
        if (chilometri <= 0) {
            throw new IllegalArgumentException("I chilometri devono essere un numero positivo superiore a 0.");
        }
        if (eta <= 0) {
            throw new IllegalArgumentException("L'età deve essere un numero positivo superiore a 0.");
        }
        this.chilometri = chilometri;
        this.eta = eta;
    }

    public double calcolaPrezzo() {
        double prezzoBase = chilometri * COSTO_PER_KM;
        if (eta < 18) {
            return prezzoBase - (prezzoBase * SCONTO_GIOVANI);
        } else if (eta > 65) {
            return prezzoBase - (prezzoBase * SCONTO_ANZIANI);
        }
        return prezzoBase;
    }

    public int getChilometri() {
        return chilometri;
    }

    public int getEta() {
        return eta;
    }
}
