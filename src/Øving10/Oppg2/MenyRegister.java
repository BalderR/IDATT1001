package Øving10.Oppg2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenyRegister {
    ArrayList<Meny> menyer = new ArrayList<>();

    public MenyRegister(ArrayList<Meny> menyer) {
        this.menyer = menyer;
    }

    public void nyRett(Rett r, int nummer) {
        for (Meny m : menyer) {
            if (m.getNummer() == nummer) {
                m.leggTilrett(r);
            }else{
                System.out.println("Menyen finnes ikke");
            }
        }
    }

    public Rett finnRettnavn(String navn) {
        Rett rett = null;
        for (Meny m : menyer) {
            rett = m.finnRettnavn(navn);
        }
        return rett;
    }

    public ArrayList<Rett> finnRettype(String type) {
        ArrayList<Rett> rettype = new ArrayList<>();
        for (Meny m : menyer) {
            rettype.add(m.finnRettype(type));
        }
        return rettype;
    }

    public void nyMeny(Meny m) { //sjekk olros main, det meste gjøres der
        this.menyer.add(m);

    }

    public Meny finnAlleretter() {
        ArrayList<Rett> alleRetter = new ArrayList<>();
        for (Meny m : menyer) {
            alleRetter.add(m.finnRett());
        }
        return new Meny(alleRetter);
    }
    public MenyRegister finnMenyerpris(int start, int slutt) {
        ArrayList<Meny> menyPris= new ArrayList<>();
        for (Meny m : menyer) {
            if (m.getTotalpris() >= start && m.getTotalpris() <= slutt) {
                menyPris.add(m);
            }
        }
        return new MenyRegister(menyPris);
    }








}
