public class GiroKonto extends Konto {

    private double kreditLimit;
    private double kreditZinsSatz = 10.0;

    GiroKonto(int nr, Kunde inhaber, double limit) {
        super(nr, inhaber);
        this.kreditLimit = limit;
    }

    public double rechneKreditZinsen(int tage) {
        if (this.kontoStand < this.kreditLimit) {
            return Math.round(((this.kontoStand * (this.kreditZinsSatz / 100)) * tage) * 100.0) / 100.0 < 0 ?
                    (Math.round(((this.kontoStand * (this.kreditZinsSatz / 100)) * tage) * 100.0) / 100.0) * -1 :
                    Math.round(((this.kontoStand * (this.kreditZinsSatz / 100)) * tage) * 100.0) / 100.0;
        }
        return 0.0;
    }

}
