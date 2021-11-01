package Øving10;


import Øving9.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    public ArrangementRegister(ArrayList<Arrangement> arrangementer) {
        this.arrangementer = arrangementer;
    }

    public void nyttArrangement(Arrangement a) {
        //for (Arrangement arr : arrangementer) {
            //if (arr.getNummer() == a.getNummer()) {
              //  System.out.println("Det finnes allerede et arrangement med dette nummer");
           // } else {
               // arrangementer.add(a);
           // }
        //}
        arrangementer.add(a);
    }

    public ArrayList<Arrangement> finnArrangementsted(String sted) {
        ArrayList<Arrangement> arrSted = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getSted().equalsIgnoreCase(sted)){
                arrSted.add(arr);
            }
        }
        return  arrSted;
    }


    public ArrayList<Arrangement> finnArrangementdato(long dato) {
        ArrayList<Arrangement> arrDato = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() / 10000 == dato) {
                arrDato.add(arr);
            }
        }
        return arrDato;
    }

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

    /*
    @Override
    public String toString() {
        return "ArrangementRegister{" +
                "arrangementer=" + arrangementer +
                '}';
    }
}
*/

