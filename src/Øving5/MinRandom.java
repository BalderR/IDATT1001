package Øving5;

import java.util.Random;
import java.util.Scanner;

public class MinRandom {
    private static Random randomGenerator = new Random();
    private  static MinRandom minRandom = new MinRandom();
    private static Scanner in = new Scanner(System.in);

    public MinRandom() {
    }

    public int nesteHeltall(int ovre, int nedre) { // intervallet (nedre, ovre)
        int max = ovre - nedre -1;
        int tilfeldigInt = randomGenerator.nextInt(max) +1;
        tilfeldigInt = tilfeldigInt + nedre;
        return tilfeldigInt;
    }
        
    public double nesteDesimaltall(double ovre, double nedre) { // intervallet >nedre, ovre>15
        double differanse = ovre - nedre;
        double tilfeldigDouble = randomGenerator.nextDouble();
        double resultat = nedre + (differanse * tilfeldigDouble);
        return resultat;
    }

    public static void main(String []args) {
        visMeny();
    }

    public static void visMeny() {

        System.out.println("Øvre grense:");
        int ovre = in.nextInt();
        System.out.println("Nedre grense:");
        int nedre = in.nextInt();
        if (nedre > ovre) {
            System.out.println("Øvre grense må være høyere enn nedre grense");
            visMeny();
        }

        System.out.println("Tast 1 for tilfeldig heltall\n" + 
        "Tast 2 for tilfeldig desimaltall\n" +
        "Tast 3 for å avslutte programmet");
        int valg = in.nextInt();

        if (valg == 1) {

            System.out.println(minRandom.nesteHeltall(ovre, nedre));

        } else if (valg == 2) {
            System.out.println(minRandom.nesteDesimaltall(ovre, nedre));

        } else if (valg == 3) {
            System.exit(0);
        } else {
            System.out.println("Du skrev inn noe feil");
        }

        System.out.println("Tast 1 for å kjøre på nytt\n" +
        "Tast 2 for å avslutte");
        int påNytt = in.nextInt();
        if (påNytt == 1) {
            visMeny();

        } else if (påNytt == 2) {
            System.exit(0);

        } else {
            System.out.println("Du skrev inn noe feil");
        }

    }


}
