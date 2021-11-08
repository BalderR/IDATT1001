package Øving10.Oppg2;

/**
 * Klasse som inneholder retter
 */
public class Rett {
    private final String navn;
    private String type;
    private String oppskrift;
    private double pris;

    /**
     *
     * @param navn navn
     * @param type type
     * @param oppskrift oppskrift
     * @param pris pris
     */
    public Rett(String navn, String type, String oppskrift, double pris) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    @Override
    public String toString() {
        return "Rett: " + navn + "\n Type : " + type + "\n Pris: " + pris + "\n Oppskrift: " + oppskrift + "\n";
    }
}

