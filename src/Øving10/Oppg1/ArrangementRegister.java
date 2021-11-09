package Øving10.Oppg1;


import Øving10.Oppg1.Arrangement;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Klasse som består av et register av arrangementer
 */
public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    /**
     *
     * @param arrangementer arraylist av arrangementer
     */
    public ArrangementRegister(ArrayList<Arrangement> arrangementer) {
        this.arrangementer = arrangementer;
    }

    /**
     *
     * @param a arrangement a
     */
    public void nyttArrangement(Arrangement a) {
        //for (Arrangement arr : arrangementer) {
            //if (arr.getNummer() == a.getNummer()) {
              //  System.out.println("Det finnes allerede et arrangement med dette nummer");
           // } else {
               // arrangementer.add(a);
           // }
        //}
        if(arrangementer.contains(a)) {
            throw new IllegalArgumentException("Arrangement finnes allerede");
        }
        arrangementer.add(a);
    }

    /**
     *
     * @param sted sted fra bruker
     * @return returnerer arraylist med arrangementene som matcher sted
     */
    public ArrayList<Arrangement> finnArrangementsted(String sted) {
        ArrayList<Arrangement> arrSted = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getSted().equalsIgnoreCase(sted)){
                arrSted.add(arr);
            }
        }
        return  arrSted;
    }


    /**
     *
     * @param dato dato fra bruker
     * @return returnerer arraylist av arrangement som matcher dato
     */
    public ArrayList<Arrangement> finnArrangementdato(long dato) {
        ArrayList<Arrangement> arrDato = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() / 10000 == dato) {
                arrDato.add(arr);
            }
        }
        return arrDato;
    }

    /**
     *
     * @param startDato tidligste dato fra bruker
     * @param sluttDato seneste dato fra bruker
     * @return returnerer arraylist av arrangementer som matcher med dato
     */
    public ArrayList<Arrangement> finnArrangement(long startDato, long sluttDato) {
        ArrayList<Arrangement> arrIntervall = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() >= startDato && arr.getTidspunkt() <= sluttDato) {
                arrIntervall.add(arr);
            }
        }

        arrIntervall.sort(Comparator.comparing(Arrangement::getTidspunkt));

        return arrIntervall;
    }


    /**
     *
     * @param a valg av sortering fra bruker
     * @return Returnerer arraylist sortert på det som bruker valgte
     */
    public ArrayList<Arrangement> sorterArrangement(int a) {
        ArrayList<Arrangement> arrKopi = new ArrayList<>(arrangementer);
        if (a == 1) {
            arrKopi.sort(Comparator.comparing(Arrangement::getSted));
        } else if (a == 2) {
            arrKopi.sort(Comparator.comparing(Arrangement::getType));
        } else if (a == 3) {
            arrKopi.sort(Comparator.comparing(Arrangement::getTidspunkt));
        } else {
            System.out.println("Du skrev noe feil");
        }
        //Kunne brukt arrKopi.sort(Comparator.comparing(Arrangement::getSted.thenComparing(getType).thenComparing(getTidspunkt)))
        return arrKopi;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(arrangementer.size());
        for (Arrangement arr : arrangementer) {
            str.append(arr.getNummer()).append("\n").append(arr.getNavn()).append("\n").append(arr.getSted()).append("\n")
                    .append(arr.getTidspunkt()).append("\n").append(arr.getType()).append("\n").append(arr.getArrangor()).append("\n");
        }
        return str.toString();
    }
}

