package Øving10.Oppg1;

import Øving10.Oppg1.Arrangement;
import Øving10.Oppg1.ArrangementRegister;

import java.util.ArrayList;
import java.util.Scanner;

public class Klient {
    private static Arrangement Arifkonsert = new Arrangement(001, "Arif med Unge Ferrari", "Spektrum", "Trondheim Events", "Konsert", 202111201900L);
    private static Arrangement Hamlet = new Arrangement(002, "Shakespeares 'Hamlet'", "Trøndelag teater ", "Trøndelag teater", "Teater", 202112081800L);
    private static Arrangement Metallicakonsert= new Arrangement(003, "Metallica", "Spektrum", "Trondheim Events", "Konsert", 202205121900L);
    private static ArrayList<Arrangement> arrangementer= new ArrayList<>();

    private static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {

        arrangementer.add(Arifkonsert);
        arrangementer.add(Hamlet);
        arrangementer.add(Metallicakonsert);

        ArrangementRegister Trondheimkommune = new ArrangementRegister(arrangementer);
        while(true) {
            System.out.println("Du kan velge mellom: \n" +
                    "0. Avslutt \n" +
                    "1. Finn alle arrangementer på et sted\n" +
                    "2. Finn alle arrangementer på en dato \n" +
                    "3. Registrer nytt arrangement\n" +
                    "4. Finn alle arrangementer innefor en tidsperiode\n" +
                    "5. Skriv ut alle arrangementer sortert etter sted, type eller, tidspunkt \n" +
                    "6. Print all arrangement");
            int valg = s.nextInt();
            switch(valg) {
                case 0:
                    System.out.println("Avslutter....");
                    System.exit(0);
                case 1:
                    s.nextLine();
                    System.out.println("Skriv inn sted");
                    String sted = s.nextLine();
                    System.out.println(Trondheimkommune.finnArrangementsted(sted));
                    break;
                case 2:
                    System.out.println("Skriv inn dato, format '20211030' (30. oktober 2021)");
                    long dato = s.nextLong();
                    System.out.println(Trondheimkommune.finnArrangementdato(dato));
                    break;
                case 3:
                    System.out.println("Skriv inn arrangementsnummer");
                    int nummer = s.nextInt();
                    s.nextLine();
                    System.out.println("Skriv inn navn på arrangement");
                    String navn = s.nextLine();
                    System.out.println("Skriv inn sted");
                    String sted2 = s.nextLine();
                    System.out.println("Skriv inn arrangør");
                    String arrangor = s.nextLine();
                    System.out.println("Skriv inn type arrangement");
                    String type = s.nextLine();
                    System.out.println("Skriv inn tidspunkt");
                    long tidspunkt = s.nextLong();
                    s.nextLine();
                    Arrangement nyttArrangement = new Arrangement(nummer, navn, sted2, arrangor, type, tidspunkt);
                    Trondheimkommune.nyttArrangement(nyttArrangement);
                    System.out.println("Nytt arrangement: \n" + nyttArrangement);
                    break;
                case 4:
                    System.out.println("Skriv inn startdato");
                    long startdato = s.nextLong();
                    s.nextLine();
                    System.out.println("Skriv inn sluttdato");
                    long sluttdato = s.nextLong();
                    s.nextLine();
                    System.out.println(Trondheimkommune.finnArrangement(startdato, sluttdato));
                    break;
                case 5:
                    System.out.println("Sorter etter: \n 1: Sted \n 2: Type \n 3: Tidspunkt");
                    int sorter = s.nextInt();
                    System.out.println(Trondheimkommune.sorterArrangement(sorter));
                    break;
                case 6:
                    System.out.println(Trondheimkommune);
                    break;
                default:
                    System.out.println("Du skrev noe feil, prøv på nytt. \n");
                    continue;
            }

        }
    }
}
