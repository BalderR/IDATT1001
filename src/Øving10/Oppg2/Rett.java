package Øving10.Oppg2;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rett rett = (Rett) o;
        return Double.compare(rett.pris, pris) == 0 && Objects.equals(navn, rett.navn) && Objects.equals(type, rett.type) && Objects.equals(oppskrift, rett.oppskrift);
    }

    @Override
    public String toString() {
        return "Rett: " + navn + "\n Type : " + type + "\n Pris: " + pris + "\n Oppskrift: " + oppskrift + "\n";
    }
}

