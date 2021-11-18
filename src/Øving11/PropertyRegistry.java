package Øving11;

import java.util.ArrayList;

/**
 * Bruker aggregering for dette prosjektet. En eiendom kan finnes utenfor kommunens register. Oppnår også lavere coupling.
 * Bruker ArrayList, da denne listen er dynamisk.
 */
public class PropertyRegistry {
    private ArrayList<Property> propertyRegistry = new ArrayList<>();

    /**
     * Konstrutør. Oppretter objekter av klassen PropertyRegistry.
     * @param propertyRegistry
     */
    public PropertyRegistry(ArrayList<Property> propertyRegistry) {
        this.propertyRegistry = propertyRegistry;
    }

    /**
     * Metode for å legge til ny Property i PropertyRegistry. Sjekker om objektet allerede finnes i PropertyRegistry,
     * og kaster IllegalArgumentException hvis den gjør det. Hvis ikke legges objektet til.
     * @param p Property objekt
     */
    public void newProperty(Property p) {
        if (propertyRegistry.contains(p)) {
            throw new IllegalArgumentException("This property already exists.");
        } else {
            propertyRegistry.add(p);
        }
    }

    /**
     * Metode for å slette Property i PropertyRegistry. Tar inn kommunenummer, bnr og gnr fra bruker. Itererer gjennom PropertyRegistry.
     * Når en Property matcher, blir dens indeks lagret i int index. Hvis ingen matcher, kastes IllegalArgumentException.
     * Objektet i riktig indeks blir så fjernet.
     * @param munNr
     * @param propNr
     * @param secNr
     */
    public void deleteProperty(int munNr, int propNr, int secNr) { // kunne ikke bruke findProperty, returnerer jo nytt objekt
        int index = 0;
        for (Property p : propertyRegistry) {
            if (p.getMunicipalityNr() == munNr && p.getPropertyNr() == propNr && p.getSectionNr() == secNr) {
                index += propertyRegistry.indexOf(p);
            } else {
                throw new IllegalArgumentException("Property doesn't exist in system");
            }
        }
        propertyRegistry.remove(index);
    }

    /**
     * metode som finner antall Property i Propertyregistry. Itererer gjennom PropertyRegistry, legger til på int amount for hver index.
     * @return int amount
     */
    public int amountOfproperties() {
        int amount = 0;
        for (Property p : propertyRegistry) {
            amount++;
        }
        return amount;
    }

    /**
     * Metode som finner property, med kommunenummer, bnr og gnr fra bruker. Itererer gjennom PropertyRegistry,
     * finner riktig Property, og oppretter en kopi.
     * @param munNr
     * @param propNr
     * @param secNr
     * @return Property. (Kopi)
     */
    public Property findProperty(int munNr, int propNr, int secNr) {
        Property property = null;
        for (Property p : propertyRegistry) {
            if (munNr == p.getMunicipalityNr() && propNr == p.getPropertyNr() && secNr == p.getSectionNr()) {
                property = new Property(p.getMunicipalityNr(), p.getMunicipalityName(), p.getPropertyNr(), p.getSectionNr(),
                        p.getName(), p.getArea(), p.getNameOfowner());
            }
        }
        return property;
    }

    /**
     * Metode som itererer gjennom hvert element i propertyRegistry, og legger til hvert elements "area" variabel
     * i "totalArea". Til slutt deles totalArea på antall eiendommer i propertyRegistry, med int amountofproperties metoden.
     * @return double gjennomsnittlig tomtareal
     */
    public double averageArea() {
        double totalArea = 0;
        for (Property p : propertyRegistry) {
            totalArea += p.getArea();
        }
        return totalArea / this.amountOfproperties();
    }

    /**
     * Metode som finner alle Property med samme gnr. Itererer gjennom PropertyRegistry, og legger hver mathende property
     * til i lokal Arraylist allproperties.
     * @param propNr
     * @return Arraylist allProperties.
     */
    public PropertyRegistry allPropertiespropNr(int propNr) { // ArrayList<Property>?
        ArrayList<Property> allProperties = new ArrayList<>();
        for (Property p : propertyRegistry) {
            if (propNr == p.getPropertyNr()) {
                allProperties.add(p);
            }
        }
        return new PropertyRegistry(allProperties);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Property p : propertyRegistry) {
            str.append(p).append("\n");
        }
        return str.toString();
    }

    /*
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Property p : propertyRegistry) {
            str.append(p.getMunicipalityNr()).append("\n").append(p.getMunicipalityName()).append("\n").append(p.getPropertyNr()).append("\n")
                    .append(p.getSectionNr()).append("\n").append(p.getName()).append("\n").append(p.getArea()).append("\n").append(p.getNameOfowner())
                    .append("\n\n");
        }
        return str.toString();
    }
    */


}
