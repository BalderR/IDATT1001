package Øving6;

import java.util.Scanner;

class AnalyseMain {

    private static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        String tekstfrabruker;
        Analyse tekstfrabrukeren;
        String bokstav;


       
        do {
            System.out.println("Skriv inn en tekst");
            tekstfrabruker = s.nextLine();
            tekstfrabrukeren = new Analyse(tekstfrabruker);
            System.out.println("Teksten har en lengde paa " + tekstfrabrukeren.lengde() + " symboler");
            System.out.println("Det er " + tekstfrabrukeren.ulike() + " ulike bokstaver"); 
            System.out.println("Det er " + tekstfrabrukeren.bokstaver() + " antall bokstaver");
            System.out.println("Det er " + tekstfrabrukeren.symboler() + "%  symboler"); 
            System.out.println("Velg en bokstav");
            bokstav = s.nextLine();
            System.out.println("Det er " + tekstfrabrukeren.antallGanger(bokstav) + " av bokstaven '" + bokstav + "'"); 
            tekstfrabrukeren.flestGanger();
        }
        while(tekstfrabruker !=null);

    }
}
