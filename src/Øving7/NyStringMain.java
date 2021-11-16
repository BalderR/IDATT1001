package Øving7;

import java.util.Scanner;

public class NyStringMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;

        while (go) {
            System.out.println(" Press 1 to start or press 2 to exit");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println(" 1: Abbreviate a text \n 2: Remove one specified letter from a text");
                int choice2 = input.nextInt();

                if (choice2 == 1) { // Abbreviate
                    System.out.println(" Enter text");
                    input.nextLine();
                    String text = input.nextLine();

                    NyString text1 = new NyString(text);

                    System.out.println(text1.abbreviate());


                }

                if (choice2 == 2) { // remove
                    System.out.println(" Enter text");
                    input.nextLine();
                    String text = input.nextLine();
                    NyString text1 = new NyString(text);

                    System.out.println(" Enter letter to be removed ");
                    String letter = input.nextLine();
                    NyString letter1 = new NyString(letter);
                    System.out.println(text1.remove(letter));
                }

            }

            if (choice == 2) {
                go = false;
                System.out.println(" Program closed ");

            }


        }


    }
}

