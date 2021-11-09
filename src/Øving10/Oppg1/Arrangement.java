package Øving10.Oppg1;

/**
 * klasse som inneholder arrangementer
 */

public class Arrangement {
    private final int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt;

    /**
     *
     * @param nummer nummer på arrangement
     * @param navn navn
     * @param sted sted
     * @param arrangør arrangør av arrangement
     * @param type type arrangement
     * @param tidspunkt tidspunkt
     */
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

    //.contains bruker denne. Automatisk intelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrangement that = (Arrangement) o;
        return nummer == that.nummer;
    }




    @Override
    public String toString() {
        return "\nArrangement \n{" +
                "nummer=" + nummer +
                ", \nnavn='" + navn + '\'' +
                ", \nsted='" + sted + '\'' +
                ", \narrangor='" + arrangor + '\'' +
                ", \ntype='" + type + '\'' +
                ", \ntidspunkt=" + tidspunkt +
                '}';
    }
}
