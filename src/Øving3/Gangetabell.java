package Øving3;

import java.util.Scanner;

class Gangetabell {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fra hvilken tabell?");
        int start = in.nextInt();
        System.out.println("Til hvilken tabell");
        int slutt = in.nextInt();
        System.out.println("Hvor mange gangestykker?");
        int antallStykker = in.nextInt();
        

        for(int i = start; i <= slutt; i++) {
            for(int a = 1; a <= antallStykker; a++) {
                int sum = a * i;
                System.out.println(i + "x" + a + " er lik " + sum);
            }
        }
            
        in.close();
    }
}



