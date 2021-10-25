package Øving9;

import java.util.Scanner;

public class Klient {

    public void main(String[] args) {
        Student[] studenter = new Student[0];
        int antStud = 0;
        Scanner in = new Scanner(System.in);
        Oppgaveoversikt skole = new Oppgaveoversikt(studenter, antStud);


        while (true) {
            System.out.println("Registrer ny student");
            System.out.println("Vis antall godkjent oppgaver til student");
            System.out.println("Øk antall oppgaver til student");
            System.out.println("Vis antall studenter");

            int menyvalg = in.nextInt();

            if (menyvalg == 1) {
                System.out.println("Skriv inn navn");
                String navn = in.nextLine();
                System.out.println("Skriv inn antall oppgaver godkjent");
                int antOppg = in.nextInt();

                Student student1 = new Student(navn, antOppg);
            }


        }
    }
}
