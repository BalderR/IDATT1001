package Øving12;

import java.time.LocalDate;

public class Covid19 {
    LocalDate date;
    String country;
    int infected;
    int deaths;

    public Covid19(LocalDate date, String country, int infected, int deaths) {
        this.date = date;
        this.country = country;
        this.infected = infected;
        this.deaths = deaths;
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
