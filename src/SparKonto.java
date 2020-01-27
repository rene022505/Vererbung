public class SparKonto extends Konto{

    private double guthabenZinsSatz = 1.5;

    SparKonto(int nr, Kunde inhaber) {
        super(nr, inhaber);
    }

    public double rechneGuthabenZinsen(int tage) {
        return Math.round((this.kontoStand * (this.guthabenZinsSatz / 100)) * tage * 100.0) / 100.0;
    }

}
