public class mainClass {

    public static void main(String[] args) {
        SparKonto kontoA = new SparKonto(1007, new Kunde("Mustermann", "Max"));
        kontoA.einzahlen(560.60);

        kontoA.einzahlen(200.0);
        System.out.println("KontoA:\n\tGuthaben: " + kontoA.getKontoStand() + "€\n");

        GiroKonto kontoB = new GiroKonto(1009, new Kunde("Musterfrau", "Monika"), 1000);
        kontoB.einzahlen(1340.0);

        kontoB.abheben(2000);
        System.out.println("KontoB:\n\tGuthaben: " + kontoB.getKontoStand() + "€\n");

        System.out.println("KontoA:\n\tZinsen: " + kontoA.rechneGuthabenZinsen(360) + "€\n");
        System.out.println("KontoB:\n\tZinsen: " + kontoB.rechneKreditZinsen(30) + "€\n");
    }

}
