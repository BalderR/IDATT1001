package Øving10.Oppg2;

public class Rett {
    private final String navn;
    private String type;
    private String oppskrift;
    private int pris;

    public Rett(String navn, String type, String oppskrift, int pris) {
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

    public int getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    @Override
    public String toString() {
        return "Rett: " + navn + "Type : " + type + "Pris: " + pris + "Oppskrift: " + oppskrift;
    }
}

