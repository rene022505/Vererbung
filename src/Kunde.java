public class Kunde {

    private String name, vorname;

    Kunde(String pName, String pVorname) {
        this.name = pName;
        this.vorname = pVorname;
    }

    public String toString() {
        return name + ", " + vorname + "\n";
    }

}
