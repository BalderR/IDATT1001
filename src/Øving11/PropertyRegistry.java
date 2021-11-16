package Øving11;

import Øving10.Oppg2.Rett;

import java.util.ArrayList;

public class PropertyRegistry {
    private ArrayList<Property> propertyRegistry = new ArrayList<>();

    public PropertyRegistry(ArrayList<Property> propertyRegistry) {
        this.propertyRegistry = propertyRegistry;
    }

    public void newProperty(Property p) {
        if (propertyRegistry.contains(p)) {
            throw new IllegalArgumentException("This property already exists.");
        } else {
            propertyRegistry.add(p);
        }
    }

    public void deleteProperty(Property p) {
        if (!propertyRegistry.contains(p)) {
            throw new IllegalArgumentException("This property doesn't exist.");
        } else {
            propertyRegistry.remove(p);
        }
    }

    public int amountOfproperties() { // ha objektvariabel int amountofproperties?
        int amount = 0;
        for (Property p : propertyRegistry) {
            amount++;
        }
        return amount;
    }

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

    public ArrayList<Property> allPropertiespropNr(int propNr) {
        ArrayList<Property> allProperties = new ArrayList<>();
        for (Property p : propertyRegistry) {
            if (propNr == p.getPropertyNr()) {
                allProperties.add(p);
            }
        }
        return allProperties;
    }

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



}
