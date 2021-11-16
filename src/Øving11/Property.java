package Øving11;

/**
 * Klassen Property lager objekter av typen Property (eiendom). Objektvariablene er vanlige attributter som en eiendom har.
 * velger set metoder for å endre eiers navn (noen kan endre navn), endre tomtens navn (noen kan få lyst til å endre det),
 * og arealet (det kan jo endres mellom naboer)
 */
public class Property {
    private int municipalityNr;
    private String municipalityName;
    private int propertyNr;
    private int sectionNr;
    private String name;
    private double area;
    private String nameOfowner;

    /**
     * Konstruktør som oppretter et objekt av klassen Property. Tar inn alle objektvariabler som parameter.
     * @param municipalityNr
     * @param municipalityName
     * @param propertyNr
     * @param sectionNr
     * @param name
     * @param area
     * @param nameOfowner
     */
    public Property(int municipalityNr, String municipalityName, int propertyNr,
                    int sectionNr, String name, double area, String nameOfowner) {
        this.municipalityNr = municipalityNr;
        this.municipalityName = municipalityName;
        this.propertyNr = propertyNr;
        this.sectionNr = sectionNr;
        this.name = name;
        this.area = area;
        this.nameOfowner = nameOfowner;
    }

    public StringBuilder getPropertyID() {
        StringBuilder str = new StringBuilder();
        str.append(this.getMunicipalityNr()).append("-").append(this.getPropertyNr()).append("/").append(this.getSectionNr());
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return municipalityNr == property.municipalityNr && propertyNr == property.propertyNr && sectionNr == property.sectionNr;
    }

    public int getMunicipalityNr() {
        return municipalityNr;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public int getPropertyNr() {
        return propertyNr;
    }

    public int getSectionNr() {
        return sectionNr;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getNameOfowner() {
        return nameOfowner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNameOfowner(String nameOfowner) {
        this.nameOfowner = nameOfowner;
    }

    @Override
    public String toString() {
        return "Municipality Nr: " + municipalityNr + "\n Municipality Name: " + municipalityName + "\n Property nr: " + propertyNr
                + "\n Section number: " + sectionNr + "\n Name: " + name + "\n Area: " + area + "\n Name of owner: " + nameOfowner + "\n";
    }
}
