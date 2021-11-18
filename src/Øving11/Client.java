package Øving11;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static Property test = new Property(1445, "Gloppen", 77, 631,
            "", 1017.6, "Jens Olsen");
    static Property test2 = new Property(1445, "Gloppen", 77, 131,
            "Syningom", 661.3, "Nicolay Madsen");
    static Property test3 = new Property(1445, "Gloppen", 75, 19,
            "Fugletun", 650.6, "Evilyn Jensen");
    private static ArrayList<Property> properties = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        properties.add(test);
        properties.add(test2);
        properties.add(test3);
        PropertyRegistry propertyRegistry = new PropertyRegistry(properties);

        try {
            while (true) {
                System.out.println("Choose between: \n" +
                        "0. Exit \n" +
                        "1. Register new property \n" +
                        "2. Print all registered properties \n" +
                        "3. Find property by municiplaity nr, property nr and section nr \n" +
                        "4. Calculate average property area of all registered properties \n" +
                        "5. Find all properties with the same property nr \n" +
                        "6. Delete a property");
                int valg = s.nextInt();
                switch (valg) {
                    case 0:
                        System.out.println("Exiting....");
                        System.exit(0);
                    case 1:
                        s.nextLine();
                        System.out.println("Type in municiplaity nr");
                        int municiplaityNr = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in municipality name");
                        String municipalityName = s.nextLine();
                        System.out.println("Type in property nr");
                        int propertyNr = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in section nr");
                        int sectionNr = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in property name, if it has one");
                        String name = s.nextLine();
                        System.out.println("Type in area of property");
                        double area = s.nextDouble();
                        s.nextLine();
                        System.out.println("Type in name of owner");
                        String nameOfowner = s.nextLine();
                        Property property1 = new Property(municiplaityNr, municipalityName, propertyNr, sectionNr, name, area, nameOfowner);
                        propertyRegistry.newProperty(property1);
                        System.out.println("Property registered successfully");
                        break;
                    case 2:
                        System.out.println(propertyRegistry);
                        break;
                    case 3:
                        System.out.println("Type in municipality nr");
                        int munNr = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in property nr");
                        int propNr = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in section nr");
                        int secNr = s.nextInt();
                        s.nextLine();
                        System.out.println(propertyRegistry.findProperty(munNr, propNr, secNr));

                        break;
                    case 4:
                        System.out.println(propertyRegistry.averageArea() + " square meters");
                        break;
                    case 5:
                        System.out.println("Type in property nr");
                        int propNr2 = s.nextInt();
                        s.nextLine();
                        System.out.println(propertyRegistry.allPropertiespropNr(propNr2));
                        break;
                    case 6:
                        System.out.println("Type in municipality nr");
                        int munNr1 = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in property nr");
                        int propNr1 = s.nextInt();
                        s.nextLine();
                        System.out.println("Type in section nr");
                        int secNr1 = s.nextInt();
                        s.nextLine();
                        propertyRegistry.deleteProperty(munNr1, propNr1, secNr1);
                        System.out.println("Property deleted");
                        break;

                    default:
                        System.out.println("You entered something wrong \n");
                        continue;
                }

            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
    }
}


}