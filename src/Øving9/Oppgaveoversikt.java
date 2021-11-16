package Øving9;

import java.util.ArrayList;
import java.util.List;

public class Oppgaveoversikt {
    private List<Student> studenter;
    private int antallStud;

    /**
     *
     * @param studenter ny arraylist
     */
    public Oppgaveoversikt(List<Student> studenter) {
        this.studenter = new ArrayList<>(studenter);
        antallStud=studenter.size();
    }

    /**
     *
     * @param navn1 navn på student
     * @return returnerer antall oppgaver løst
     */
    public int finnOppgLost(String navn1) {
        if (navn1 == null) {
            return -1;
        }
        Student stud = queryStudent(navn1);
        int pos = finnStudent(stud.getNavn());
        return this.studenter.get(pos).getAntOppg();
    }

    /**
     *
     * @param stud student
     * @return returnerer plasseringen i linkedlist
     */
    public int finnStudent(Student stud) {
        return this.studenter.indexOf(stud);
    }

    /**
     *
     * @param navn navn på student
     * @return returnerer plassering til student som matcher navn
     */
    private int finnStudent(String navn) {
        for(int i=0; i<this.studenter.size(); i++) {
            if(studenter.get(i).getNavn().equals(navn)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param s student
     * @return legger til student, og blir true
     */
    public boolean registrerNyStudent(Student s) {
        if (!this.studenter.contains(s)) {
            this.studenter.add(s);
            return true;
        }
        return false;
    }

    /**
     *
     * @return returnerer størrelse på studenter
     */
    public int antRegStud() {
        return this.studenter.size();
    }

    /**
     *
     * @param s student
     * @param antall øk med antall
     * @return øker antall oppgaver
     */
    public boolean okAntallOppgaver(Student s, int antall) {
        if (s == null || antall < 0) {
            return false;
        }
        this.studenter.get(finnStudent(s)).okAntOppg(antall);
        return true;
    }

    /**
     *
     * @param navn navn på student
     * @param antall øk med antall
     * @return bruker metode over for å øke antall oppgaver
     */
    public boolean okAntallOppgaver(String navn, int antall) {
        Student s = queryStudent(navn);
        return okAntallOppgaver(s, antall);
    }

    /**
     *
     * @param navn navn på student
     * @return returnerer studentobjektet som matcher navn
     */
    public Student queryStudent(String navn) {
        int pos = finnStudent(navn);
        if(pos >= 0) {
            return this.studenter.get(pos);
        }

        return null;
    }

    /**
     *
     * @return skriver ut hver student og antall utførte oppgaver
     */
    public String toString() {
        StringBuilder str = new StringBuilder(this.studenter.size());
        for (Student i : this.studenter) {
            str.append(i.getNavn()).append(", ").append(i.getAntOppg()).append("\n");
        }
        return str.toString();
    }

}
