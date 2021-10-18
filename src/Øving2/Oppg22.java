package Øving2;

public class Oppg22 {
    
    public static void main(String[]args) {
        double prisTypeA = 35.9;
        double prisTypeB = 39.5;
        double vektTypeA = 450;
        double vektTypeB = 500;

        double kgprisTypeA = prisTypeA * (1000 / vektTypeA);
        double kgprisTypeB = prisTypeB * (1000 / vektTypeB);

        if (kgprisTypeA>kgprisTypeB) {
            System.out.println("Type B er billigere enn type A per Kg");
        } else if(kgprisTypeA<kgprisTypeB) {
            System.out.println("Type A er billigere enn type B per Kg");
        
        } else {
            System.out.println("De koster like mye per Kg");

        }
    }
}

