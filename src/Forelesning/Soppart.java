package Forelesning;

import java.util.Objects;

public class Soppart {
    private String navn;
    private String beskrivelse;
    private String spiselig;

    public Soppart(String navn, String beskrivelse, String spiselig) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.spiselig = spiselig;
    }

    public Soppart(Soppart s) {
        navn = s.getNavn();
        beskrivelse = s.getBeskrivelse();
        spiselig = s.getSpiselig();
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public String getSpiselig() {
        return spiselig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soppart soppart = (Soppart) o;
        return Objects.equals(navn, soppart.navn);
    }

    public boolean sjekkBeskrivelse(String sokestreng) {
        if (this.getBeskrivelse().contains(sokestreng)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\n Beskrivelse: " + beskrivelse + "\n Spiselig: " + spiselig + "\n";
    }
}
