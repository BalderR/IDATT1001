package Øving9;

import java.util.Arrays;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;

    public Oppgaveoversikt(Student[] studenter, int antStud) {
        this.studenter = new Student[antStud];
        this.antStud = antStud;
    }

    public int getAntoppgaver(String navn1) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn1)) ;
            return studenter[i].getAntOppg();
        }
        return -1;
    }

    public void registrerStudent(String navn, int antOppg) {
        //Student[] studenter1 = Arrays.copyOf(studenter, antStud + 1);
        //studenter1[antStud + 1] = new Student(navn, antOppg);
        //antStud ++;


        //Student[] studenter1 = new Student[antStud + 1];
        //for (int i = 0; i < antStud; i++) {
           // studenter1[i] = new Student(studenter[i].getNavn(), studenter[i].getAntOppg());
       // }
        //studenter1[antStud + 1] = new Student(navn, antOppg);
        //antStud++;

        if (antStud == 0) {
            studenter = new Student[1];
            studenter[0] = new Student(navn, antOppg);
            antStud++;
        } else if (antStud != 0) {
            Student[] studenter1 = new Student[antStud + 1];
            for (int i = 0; i < antStud; i++) {
                studenter1[i] = new Student(studenter[i].getNavn(), studenter[i].getAntOppg());
            }
            studenter1[antStud] = new Student(navn, antOppg);
            antStud++;
            System.out.println(antStud);
        }
    }

    public void okAntalloppg(String navn2, int antall) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn2)) {
                studenter[i].okAntOppg(antall);
            }
        }
    }

    public int getAntStud() {
        return antStud;
    }

    public String toString() {
        String name = "";
        for (int i = 0; i < studenter.length; i++) {
            name += studenter[i] + ". ";
        }
        return name;
    }
}


    /*
    @Override
    public String toString() {
        return "Oppgaveoversikt{" +
                "studenter=" + Arrays.toString(studenter) +
                ", antStud=" + antStud +
                '}';
    }

     */

