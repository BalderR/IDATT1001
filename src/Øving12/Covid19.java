package Øving12;

import java.time.LocalDate;

public class Covid19 {
    private LocalDate date;
    private String country;
    private int infected;
    private int deaths;

    /** Konstruktør som oppretter et objekt av klassen.
     *
     * @param date
     * @param country
     * @param infected
     * @param deaths
     * @throws IllegalArgumentException hvis date er i fremtiden, hvis cou
     */
    public Covid19(LocalDate date, String country, int infected, int deaths) throws IllegalArgumentException{
        this.date = date;
            if (date.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Date can't be in the future");
            }
        this.country = country;
            if(country == null) {
                throw new IllegalArgumentException("Country can't be blank");
            }
        this.infected = infected;
            if (infected < 0) {
                throw new IllegalArgumentException("Infections can't be negative");
            }
        this.deaths = deaths;
            if (deaths < 0) {
                throw new IllegalArgumentException("Deaths can't be negative");
            }
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
