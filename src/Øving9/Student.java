package Øving9;

public class Student {
    private String navn;
    private int antOppg;

    public Student(String navn) {
       this.navn = navn;
       this.antOppg = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void okAntOppg(int okning) {
        this. antOppg += okning;
    }

    public String toString() {
        return "Navn: " + navn + "Antall godkjente oppgaver: " + antOppg;
    }

}

