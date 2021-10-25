package Øving9;

import java.util.Scanner;

public class Klient {

    public static void main(String[] args) {
        int antStud = 0;
        Student[] studenter = new Student[antStud];
        Scanner in = new Scanner(System.in);
        Oppgaveoversikt skole = new Oppgaveoversikt(studenter, antStud);

        while (true) {
            System.out.print("1: Registrer ny student\n");
            System.out.print("2: Vis antall godkjent oppgaver til student\n");
            System.out.print("3: Øk antall oppgaver til student\n");
            System.out.print("4: Vis antall studenter\n");
            System.out.print("0: Avslutt program\n");

            int menyvalg = in.nextInt();

            if (menyvalg == 1) {
                System.out.print("Skriv inn navn");
                String navn = in.nextLine();
                in.nextLine();
                System.out.print("Skriv inn antall oppgaver godkjent");
                int antOppg = in.nextInt();
                in.nextLine();
                skole.registrerStudent(navn, antOppg);

            } else if (menyvalg == 2) {
                System.out.print("Skriv inn studentens navn");
                String valg = in.nextLine();
                in.nextLine();
                System.out.println(skole.getAntoppgaver(valg));

            } else if (menyvalg == 3) {
                System.out.print("Skriv inn studentens navn");
                String valg = in.nextLine();
                in.nextLine();
                System.out.print("Øke med antall oppgaver: ");
                int valg2 = in.nextInt();
                in.nextLine();

                skole.okAntalloppg(valg, valg2);

            } else if (menyvalg == 4) {
                System.out.print("Antall studenter:");
                System.out.print(skole);

            } else if (menyvalg == 0) {
                System.out.println("Avslutter...");
                System.exit(0);
            } else {
                System.out.print("Du skrev inn noe feil");
            }


        }
    }
}
