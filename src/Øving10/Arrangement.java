package Øving10;

//entydig nummer, navn, sted, arrangør, type (konsert, barneteater, foredrag osv)
//og tidspunkt (dato og klokkeslett)

public class Arrangement {
    private final int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangør, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangor() {
        return arrangor;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }
}
