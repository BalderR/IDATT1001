package Øving4;

public class SpillerMain {

    private static int sumPoengA = 0;
    private static int sumPoengB = 0;
    private static int teller = 1;

    private static Spiller spillerA = new Spiller("A"); //Lager en spiller fra konstruktøren
    private static Spiller spillerB = new Spiller("B"); //Lager en spiller fra konstruktøren

    public static void main(String[] args) {


        while (true) {
            System.out.println("\nRunde " +teller);
            int poengA = spillerA.kastTerning(); //Lager en tilfeldig verdi mellom 1 og 6
            int poengB = spillerB.kastTerning(); //Lager en tilfeldig verdi mellom 1 og 6
            sumPoengA += poengA; //Legger til poeng i summen
            sumPoengB += poengB; //Legger til poeng i summen

            System.out.println("A triller " + poengA);

            if (poengA == 1) {  //Sjekker om spiller A trillet 1
                System.out.println("\nA trillet 1 og mister alle poengene sine");
                sumPoengA = 0; //Setter poengsum til 0
            }

            System.out.println("B triller " + poengB);

            if (poengB == 1) { //Sjekker om spiller B trillet 1
                System.out.println("\nB trillet 1 og mister alle poengene sine");
                sumPoengB = 0; //Setter poengsum til 0
            }

            System.out.println("\nA har nå poengsummen: " + sumPoengA);
            System.out.println("B har nå poengsummen: " + sumPoengB);

            if (sumPoengA > 100) { //Sjekker om poengene har overskredet 100
                sumPoengA =- poengA;
                System.out.println("A har spilt mer enn 100 og får kastet trukket fra summen");
            }
            else if (sumPoengB > 100) { //Sjekker om poengsummen har overskredet 100
                sumPoengB =- poengB;
                System.out.println("B har spilt mer enn 100 og får kastet trukket fra summen");
            }
            else if (sumPoengA == 100) {
                System.out.println("A har vunnet");
                break;
                //Bryter loop og avslutter programmet
            }
            else if (sumPoengB == 100) {
                System.out.println("B har vunnet");
                break;
                //Bryter loop og avslutter programmet
            }
            teller += 1; //Legger til en  på teller
        }
    }
    
}
