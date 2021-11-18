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
        if (municipalityNr < 101 || municipalityNr > 5054) {
            throw new IllegalArgumentException("Municipality nr must be between 101 and 5054");
        }
        this.municipalityName = municipalityName;
        this.propertyNr = propertyNr;
        this.sectionNr = sectionNr;
        this.name = name;
        this.area = area;
        if (area < 0) {
            throw new IllegalArgumentException("Area must be positive");
        }
        this.nameOfowner = nameOfowner;
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
        StringBuilder str = new StringBuilder();
        str.append(this.getMunicipalityNr()).append("-").append(this.getPropertyNr()).append("/").append(this.getSectionNr());
        return str.toString();
    }

    /*
    @Override
    public String toString() {
        return "Municipality Nr: " + municipalityNr + "\n Municipality Name: " + municipalityName + "\n Property nr: " + propertyNr
                + "\n Section number: " + sectionNr + "\n Name: " + name + "\n Area: " + area + "\n Name of owner: " + nameOfowner + "\n";
    }
     */
}
