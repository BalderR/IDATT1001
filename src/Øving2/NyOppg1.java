package Øving2;

import java.util.Scanner;

public class NyOppg1 {
    
    public static void main(String[]args) {
        Scanner brukerÅr = new Scanner(System.in);
        System.out.println("Skriv inn år");
        int årstall = brukerÅr.nextInt();

        if (årstall % 400 == 0) {
            System.out.println(årstall + " er et skuddår");

        } else if (årstall % 100 == 0) {
            System.out.println(årstall + " er ikke et skuddår");
        } else if (årstall % 4 == 0) {
            System.out.println(årstall + " er et skuddår");
        } else {
            System.out.println(årstall + " er ikke et skuddår");
        }
        brukerÅr.close();
    }
}
