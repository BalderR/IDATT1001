package Øving10.Oppg2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * klasse som består av et register av menyer som består av retter
 */
public class MenyRegister {
    ArrayList<Meny> menyer = new ArrayList<>();

    /**
     *
     * @param menyer menyer
     */
    public MenyRegister(ArrayList<Meny> menyer) {
        this.menyer = menyer;
    }

    /**
     *
     * @param r Rett r
     * @param nummer nummer på menyen retten skal bli lagt til i
     */
    public void nyRett(Rett r, int nummer) {
        for (Meny m : menyer) {
            if (m.getNummer() == nummer) {
                m.leggTilrett(r);
            }else{
                System.out.println("Menyen finnes ikke");
            }
        }
    }

    /**
     *
     * @param navn navn fra bruker
     * @return returnerer rett som matcher navn fra bruker
     */
    public Rett finnRettnavn(String navn) {
        Rett rett = null;
        for (Meny m : menyer) {
            rett = m.finnRettnavn(navn);
        }
        return rett;
    }

    /**
     *
     * @param type type fra bruker
     * @return Returnerer retter som matcher type fra bruker
     */
    public ArrayList<ArrayList<Rett>> finnRettype(String type) {
        ArrayList<ArrayList<Rett>> rettype = new ArrayList<>();
        for (Meny m : menyer) {
            rettype.add(m.finnRettype(type));
        }
        return rettype;
    }

    /**
     *
     * @param m meny
     */
    public void nyMeny(Meny m) {
        this.menyer.add(m);

    }

    /**
     *
     * @return returnerer alle retter fra alle menyer som menyregisteret består av
     */
    public ArrayList<ArrayList<Rett>> finnAlleretter() {
        ArrayList<ArrayList<Rett>> alleRetter = new ArrayList<>();
        for (Meny m : menyer) {
            alleRetter.add(m.finnRett());
        }
        return alleRetter;
    }

    /**
     *
     * @param start startpris fra bruker
     * @param slutt Sluttpris fra bruker
     * @return returnerer menyene innenfor prisintervallet
     */
    public MenyRegister finnMenyerpris(double start, double slutt) {
        ArrayList<Meny> menyPris= new ArrayList<>();
        for (Meny m : menyer) {
            if (m.getTotalpris() >= start && m.getTotalpris() <= slutt) {
                menyPris.add(m);
            }
        }
        return new MenyRegister(menyPris);
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Menyer: \n");
        for (Meny m : this.menyer) {
            str.append("Menynr: " + m.getNummer() + "\n" + m + "\n" );
        }
        return str.toString();
    }
}
