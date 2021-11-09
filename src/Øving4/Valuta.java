package Øving4;

public class Valuta {

    private double kurs; //Nytt objekt
    private String valuta; //Nytt objekt

    public Valuta(double kurs, String valuta) { //Ny konstruktør
        this.kurs = kurs;
        this.valuta = valuta;
    }

    public double ValutaTilNok(double AntallValgt) { //Metode som regner til NOK
        return kurs * AntallValgt;
    }

    public double NokTilValuta(double AntallValgt) { //Metode som regner fra NOK
        return kurs / AntallValgt;

    }

}


