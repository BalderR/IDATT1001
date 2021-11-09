package Øving3;

import java.util.Scanner;

class Primtall {
    public static void main(String[] args) {
        check();

    }
    public static void check() {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn positivt tall");
        int tall = in.nextInt();

        boolean primtall = true;

        for (int i = 2; i <= tall /2; i++) {
            int mod = tall % i;
            if (mod == 0) {
                primtall = false;
                break;
            }
        }

        if (tall == 0 || tall == 1) {
            primtall = false;
        }

        if (primtall) {
            System.out.println(tall + " er et primtall");
        
        } else {
            System.out.println(tall + " er ikke et primtall");
        }
    
        System.out.println("---");
        check();

    in.close();
    }
}
    