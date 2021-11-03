package Øving10.Oppg2;

import java.util.ArrayList;

public class MenyRegister {
    ArrayList<Meny> menyer = new ArrayList<>();

    public MenyRegister(ArrayList<Meny> menyer) {
        this.menyer = menyer;
    }

    public void nyRett(Rett r, int valg) {
        for (Meny m : menyer) {
            if (m.getNummer() == valg) {
                m.leggTilrett(r);
            }else{
                System.out.println("Menyen finnes ikke");
            }
        }
    }

    public Rett finnRett(String navn) {
        Rett rett = null;
        for (Meny m : menyer) {
            rett = m.finnRettnavn(navn);
        }
        return rett;
    }






}
