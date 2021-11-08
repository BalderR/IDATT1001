package Øving10.Oppg2;

import java.util.ArrayList;

/**
 * klasse som inneholder menyer som består av retter
 */
public class Meny {
    private int nummer;
    private ArrayList<Rett> retter= new ArrayList<>();
    double totalpris;

    /**
     *
     * @param nummer nr på menyen
     * @param retter retter
     */
    public Meny(int nummer, ArrayList<Rett> retter) {
        this.retter = retter;
        this.nummer = nummer;
        this.totalpris = 0;
        for (Rett r : retter) {
            this.totalpris += r.getPris();
        }
    }

    /**
     *
     * @param r Rett r
     * Metoden brukes av nyRett i MenyRegister klassen
     */
    public void leggTilrett(Rett r) {
        retter.add(r);
    }

    /**
     *
     * @param navn navn fra bruker
     * @return Returnerer rett som matcher input fra bruker. Metoden brukes av finnRettnavn metoden i MenyRegister
     */
    public Rett finnRettnavn(String navn) {
        Rett rett1 = null;
        for (Rett rett : retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                rett1 = new Rett(rett.getNavn(), rett.getType(), rett.getOppskrift(), rett.getPris());
            }
        }
        return rett1;
    }

    /**
     *
     * @param type type fra bruker
     * @return Returnerer alle retter som matcher med type fra bruker. Metoden brukes av finnRettype metoden i MenyRegister
     */
    public ArrayList<Rett> finnRettype(String type) {
        ArrayList<Rett> retterType = new ArrayList<>();
        for (Rett rett : retter) {
            if (rett.getType().equalsIgnoreCase(type)) {
                retterType.add(new Rett(rett.getNavn(), rett.getType(), rett.getOppskrift(), rett.getPris()));
            }
        }
        return retterType;
    }

    /**
     *
     * @return Returnerer alle retter fra menyen. Brukes av finnAlleretter i MenyRegister.
     */
    public ArrayList<Rett> finnRett() {
        ArrayList<Rett> retter1 = new ArrayList<>();
        for (Rett r : retter) {
            retter1.add(new Rett(r.getNavn(), r.getType(), r.getOppskrift(), r.getPris()));
        }
        return retter1;
    }


    public int getNummer() {
        return nummer;
    }

    public double getTotalpris() {return totalpris;}


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.retter.size());
        for (Rett r : this.retter) {
            str.append(r.getNavn()).append("\n").append(r.getType()).append("\n").append(r.getOppskrift()).append("\n")
                    .append(r.getPris()).append("\n");
        }
        return str.toString();
    }
}
