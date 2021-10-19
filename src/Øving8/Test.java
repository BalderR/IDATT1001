package Øving8;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Type in first name: "); String firstName = in.nextLine();
        System.out.print("Type in surname: "); String surName = in.nextLine();
        System.out.print("Skriv inn fødselsår: "); int bYear = in.nextInt();
        Person person = new Person(firstName, surName, bYear);
        System.out.print("Type in employeenr: "); int employeenr = in.nextInt();
        System.out.print("Type in year of employment: "); int yearOfemployment = in.nextInt();
        System.out.print("Type in monthly salary: "); double monthlySalary = in.nextDouble();
        System.out.print("Type in taxation percent: "); double taxationPercent = in.nextDouble();
        Employee employee1 = new Employee(person, employeenr, yearOfemployment, monthlySalary, taxationPercent);



        System.out.println("Press 1 to set monthly salary");
        System.out.println("Press 2 to set taxation percent");
        System.out.println("Press 3 to print all data");

        int menuInput = in.nextInt();
        if (menuInput == 1) {
            System.out.print("Type in new monthly salary: "); double newSalary = in.nextDouble();
            employee1.setMonthlySalary(newSalary);
            System.out.println("Ny registrert månedslønn er: " + employee1.getMonthlySalary());
        } else if (menuInput == 2) {
            System.out.print("Skriv inn ny skatteprosent: "); double newTaxfactor = in.nextDouble();
            employee1.setTaxFactor(newTaxfactor);
            System.out.println("Ny registrert skatteprosent er: " +  employee1.getTaxFactor());
        } else if (menuInput == 3) {
            System.out.println("");
            System.out.println("First name: " + employee1.getPersonalDetails().getFirstName());
            System.out.println("Surname: " + employee1.getPersonalDetails().getSurName());
            System.out.println("Alder: " + employee1.employeeAge();
            System.out.println("Skatt per måned: " + employee1.monthlyTaxation());
            System.out.println("Skatt per år: " + employee1.getSkattPerAar());
            System.out.println("Bruttolønn per år: " + employee1.getBruttoLonnAar());
            System.out.println("År ansatt: " + employee1.getAarAnsatt());
            System.out.println("Ansatt mer enn 10 år: " + employee1.getAnsattMerEnn(10));
        } else {
            System.out.println("Du må taste inn et tall fra 1-3");
        }
    }



    }

}
