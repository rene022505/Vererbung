public abstract class Konto {

    protected int kontoNummer;
    protected Kunde inhaber;
    protected double kontoStand;

    Konto(int nr, Kunde inhaber) {
        this.inhaber = inhaber;
        this.kontoNummer = nr;
    }

    public void einzahlen(double betrag) {
        this.kontoStand += betrag;
    }

    public void abheben(double betrag) {
        this.kontoStand -= betrag;
    }

    public double kontoStandAbfragen() {
        return Math.round(this.kontoStand * 100.0) / 100.0;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }
}
