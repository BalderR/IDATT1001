package Øving10.Oppg2;

import java.util.ArrayList;

public class Meny {
    private int nummer;
    private ArrayList<Rett> retter= new ArrayList<>();
    int totalpris;

    public Meny(int nummer, ArrayList<Rett> retter, int totalpris) {
        this.retter = retter;
        this.nummer = nummer;
        this.totalpris = 0;
        for (Rett rett : retter)
            this.totalpris += rett.getPris();
    }

    public void leggTilrett(Rett r) {
        retter.add(r);
    }

    public Rett finnRettnavn(String navn) {
        Rett rett1 = null;
        for (Rett rett : retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                rett1 = new Rett(rett.getNavn(), rett.getType(), rett.getOppskrift(), rett.getPris());
            }
        }
        return rett1;
    }

    public Rett finnRettype1(String type) {
        for (Rett rett : retter) {
            if (rett.getType().equalsIgnoreCase(type)) {
                return new Rett(rett.getNavn(), rett.getType(), rett.getOppskrift(), rett.getPris());
            }
        }
        return null;
    }

    public Meny getMeny() {
        //this.retter= new ArrayList<>(retter);
        return new Meny(nummer, retter, totalpris);
    }

    public int getNummer() {
        return nummer;
    }

    public int getTotalpris() {return totalpris;}
}
