package Øving8;

public class Person {
    private final String firstName;
    private final String surName;
    private final int bYear;

    /**
     *
     * @param firstName fornavn
     * @param surName etternavn
     * @param bYear fødseslår
     */
    public Person(String firstName, String surName, int bYear) {
        this.firstName = firstName;
        this.surName = surName;
        this.bYear = bYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getbYear() {
        return bYear;
    }

    public String toString() {
        return "Navn: " + firstName + " " + surName + "Fødeselsdato: " + bYear;
    }
}
