package Øving2;


import java.util.Scanner;

public class Oppg1 {

    public static void main(String[]args) {
        Scanner brukerÅr = new Scanner(System.in);
        System.out.println("Skriv inn år");
        int årstall = brukerÅr.nextInt();

        int skuddårRest = årstall % 4;

        String resultat = (skuddårRest == 0) ? " er et skuddår" : " er ikke et skuddår";
        System.out.println(årstall + resultat);
        brukerÅr.close();

    }

}
