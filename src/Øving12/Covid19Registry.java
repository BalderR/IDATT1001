package Øving12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Covid19Registry {
    private ArrayList<Covid19> covid19Registry;

    /**
     * Konstruktør for å opprette et nytt covid19 register.
     */
    public Covid19Registry() {
        this.covid19Registry = new ArrayList<Covid19>();
    }

    /**
     * Konstruktør for å gjøre ArrayList til instans av klassen. Brukes i metoder som returnerer en arraylist med
     * Covid19, slik at toString metoden til Covid19registry klassen brukes.
     * @param covid19Registry
     */
    public Covid19Registry(ArrayList<Covid19> covid19Registry) {
        this.covid19Registry= covid19Registry;
    }

    public boolean registerCovid19(LocalDate date, String country, int infected, int deaths) {
        covid19Registry.add(new Covid19(date, country, infected, deaths));
        return true;
    }

    public Iterator<Covid19> getIterator() {
        return covid19Registry.iterator();
    }

    public Covid19 firstRegdate() {
        Covid19 firstReg = covid19Registry.get(0);
        //Iterator<Covid19> it = getIterator();
        while (getIterator().hasNext()) {
            if (getIterator().next().getDate().isBefore(firstReg.getDate())) {
                firstReg = new Covid19(getIterator().next().getDate(), getIterator().next().getCountry(),
                        getIterator().next().getInfected(), getIterator().next().getDeaths());
            }
        }
        return firstReg;
    }

    public Covid19Registry regsAfterdate(String date) {
        ArrayList<Covid19> afterDatelist = new ArrayList<Covid19>();
        LocalDate afterDate = LocalDate.parse(date);
        while (getIterator().hasNext()) {
            if (getIterator().next().getDate().isAfter(afterDate)) {
                afterDatelist.add(getIterator().next());
            }
        }
        return new Covid19Registry(afterDatelist);
    }
}
