package Øving6;

import java.util.Random;

public class TilfeldigTall{

    public static void main(String[] args){
        Random random = new Random();
        int antall[] = new int[10]; 
        
        for(int i = 0; i < 1000; i++) {
            antall[random.nextInt(10)]++; 

        }

        for(int i = 0; i < 10; i++) {
            int sum = antall[i];
            long stjerner = Math.round(sum / 10);
            String stjerne = "";
            for (long k = 0; k < stjerner; k++) {
                stjerne = stjerne + "*";
            }
            System.out.print(i + ": " + antall[i] + stjerne + "\n");

        }
    }
}
