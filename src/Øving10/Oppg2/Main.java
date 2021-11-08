package Øving10.Oppg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Rett> retter1 = new ArrayList<>();
    private static ArrayList<Meny> menyer = new ArrayList<>();
    private static Rett hamburger = new Rett("Hamburger", "Hovedrett", "Vet ikke", 120.0);
    private static Rett iskrem = new Rett("Iskrem", "Dessert", "Vet ikke", 70.0);
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        retter1.add(hamburger);
        retter1.add(iskrem);
        Meny meny1 = new Meny(1, retter1);

        menyer.add(meny1);
        MenyRegister menyRegister = new MenyRegister(menyer);

        while (true) {
            System.out.println("Du kan velge mellom: \n" +
                    "0. Avslutt \n" +
                    "1. Registrere ny rett\n" +
                    "2. Finn rett, gitt navn\n" +
                    "3. Finn alle retter av type\n" +
                    "4. Registrere ny meny med retter\n" +
                    "5. Finn alle menyer gitt totalpris intervall \n" +
                    "6. Print alle menyer");
            int valg = s.nextInt();
            switch (valg) {
                case 0:
                    System.out.println("Avslutter....");
                    System.exit(0);
                case 1:
                    s.nextLine();
                    System.out.println("Navn på retten:");
                    String navn = s.nextLine();
                    System.out.println("Type rett:");
                    String type = s.nextLine();
                    System.out.println("Oppskrift: ");
                    String oppskrift = s.nextLine();
                    System.out.println("Pris: ");
                    double pris = s.nextDouble();
                    s.nextLine();
                    System.out.println("Rett skal i meny (menynr): ");
                    int nummer = s.nextInt();
                    Rett rett1 = new Rett(navn, type, oppskrift, pris);
                    menyRegister.nyRett(rett1, nummer);
                    break;
                case 2:
                    s.nextLine();
                    System.out.println("Skriv inn navnet på retten: ");
                    String navn1 = s.nextLine();
                    System.out.println(menyRegister.finnRettnavn(navn1));
                    break;
                case 3:
                    s.nextLine();
                    System.out.println("Skriv inn type: ");
                    String type1 = s.nextLine();
                    System.out.println(menyRegister.finnRettype(type1).toString());
                    break;
                case 4:
                    boolean ferdig = false;
                    ArrayList<Rett> retter2 = new ArrayList<>();
                    System.out.println("Skriv inn nytt menynr: ");
                    int nr = s.nextInt();
                    s.nextLine();
                    System.out.println("Tilgjengelige retter: ");
                    System.out.println(menyRegister.finnAlleretter());

                    while (!ferdig) {
                        if (retter2.size() < 1) {
                            System.out.print("Skriv inn navn på rett som skal være med i menyen: ");
                        } else {
                            System.out.print("Tast 1 for å registere menyen eller skriv inn navn på rett som skal være med i menyen: ");
                        }
                        String navn3 = s.nextLine();
                        if (navn3.equals("1")) {
                            ferdig = true;
                        } else {
                            retter2.add(menyRegister.finnRettnavn(navn3));
                        }
                    }
                    Meny meny2 = new Meny(nr, retter2);
                    System.out.println("Menyen ble registrert");
                    menyRegister.nyMeny(meny2);
                    break;
                case 5:
                    System.out.println("Skriv inn laveste totalpris");
                    double startpris = s.nextDouble();
                    s.nextLine();
                    System.out.println("Skriv inn høyeste totalpris");
                    double sluttpris = s.nextDouble();
                    s.nextLine();
                    System.out.println(menyRegister.finnMenyerpris(startpris, sluttpris));
                    break;
                case 6:
                    System.out.println(menyRegister);
                    break;
                default:
                    System.out.println("Du skrev noe feil, prøv på nytt. \n");
                    continue;
            }

        }
    }
}




