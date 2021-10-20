package Øving8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    private final Person personalDetails;
    private final int employeeNr;
    private final int yearOfemployment;
    private double monthlySalary;
    private double taxFactor;


    public Employee(Person personalDetails, int employeeNr,
                    int yearOfemployment, double monthlySalary, double taxFactor) {
        this.personalDetails = new Person(personalDetails.getFirstName(), personalDetails.getSurName(),
        personalDetails.getbYear());
        this.employeeNr = employeeNr;
        this.yearOfemployment = yearOfemployment;
        this.monthlySalary = monthlySalary;
        this.taxFactor = taxFactor;
    }

    public double monthlyTaxation() {
        double extra = monthlySalary * taxFactor;
        return monthlySalary - extra;
    }

    public double grossYearlysalary() {
        return monthlySalary * 12;
    }

    public double yearlyTaxation() {
        double tenMonths = monthlySalary * 10 * taxFactor;
        double december = monthlySalary * (taxFactor / 2);
        double nonTax = monthlySalary * 12;
        return nonTax - (tenMonths + december);
    }

    public String swithcedNames() {
        String firstName = personalDetails.getFirstName();
        String surName = personalDetails.getSurName();
        return surName + ", " + firstName;

    }

    public int employeeAge() {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int employeeYear = personalDetails.getbYear();
        return year - employeeYear;
    }

    public int yearsEmployed() {
        GregorianCalendar calendar= new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        return year - yearOfemployment;
    }

    public boolean employedLongerthan(int years) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int yearsEmployed = year - yearOfemployment;
        boolean moreThan = yearsEmployed >= years;
        return moreThan;
    }

    public Person getPersonalDetails() {
        return new Person(personalDetails.getFirstName(), personalDetails.getSurName(),
                personalDetails.getbYear());
    }

    public int getEmployeeNr() {
        return employeeNr;
    }

    public int getYearOfemployment() {
        return yearOfemployment;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getTaxFactor() {
        return taxFactor;
    }

    public void setMonthlySalary(double newValue) {
        monthlySalary = newValue;
    }

    public void setTaxFactor(double newValue) {
        taxFactor = newValue;
    }
}
