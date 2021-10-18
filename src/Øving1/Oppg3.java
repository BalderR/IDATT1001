package Øving1;

import java.util.Scanner;

class Oppg3 {
    public static void main(String []args) {
        Scanner tidKalkulator = new Scanner(System.in);
        System.out.println("Antall sekunder:");
        int brukerSekunder = tidKalkulator.nextInt();
    
        int timer = brukerSekunder / 3600;
        int sekunderIgjen = brukerSekunder - timer * 3600; 
        int minutter = sekunderIgjen / 60;
        int sekunder = sekunderIgjen - minutter * 60;

        System.out.println(brukerSekunder + " sekunder er " + timer + " t " + minutter + " m " + sekunder + " s ");
        tidKalkulator.close();
    }

}
