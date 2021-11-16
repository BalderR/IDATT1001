package Øving8;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type in first name: ");
        String firstName = in.nextLine();
        System.out.print("Type in surname: ");
        String surName = in.nextLine();
        System.out.print("Skriv inn fødselsår: ");
        int bYear = in.nextInt();
        Person person = new Person(firstName, surName, bYear);
        System.out.print("Type in employeenr: ");
        int employeenr = in.nextInt();
        System.out.print("Type in year of employment: ");
        int yearOfemployment = in.nextInt();
        System.out.print("Type in monthly salary: ");
        double monthlySalary = in.nextDouble();
        System.out.print("Type in taxation percent: ");
        double taxationPercent = in.nextDouble();
        Employee employee1 = new Employee(person, employeenr, yearOfemployment,
                monthlySalary, taxationPercent);

        while (true) {
            System.out.println("Press 1 to set monthly salary");
            System.out.println("Press 2 to set taxation percent");
            System.out.println("Press 3 to print all data");
            System.out.println("Press 0 to exit");

            int menuInput = in.nextInt();
            if (menuInput == 1) {
                System.out.print("Type in new monthly salary: ");
                double newSalary = in.nextDouble();
                employee1.setMonthlySalary(newSalary);
                System.out.println("New monthly salary is: " + employee1.getMonthlySalary());
            } else if (menuInput == 2) {
                System.out.print("Type in new tax factor: ");
                double newTaxfactor = in.nextDouble();
                employee1.setTaxFactor(newTaxfactor);
                System.out.println("New monthly salary is: " + employee1.getTaxFactor());
            } else if (menuInput == 3) {
                System.out.println("First name: " + employee1.getPersonalDetails().getFirstName());
                System.out.println("Surname: " + employee1.getPersonalDetails().getSurName());
                System.out.println("Switched name format: " + employee1.swithcedNames());
                System.out.println("Age: " + employee1.employeeAge());
                System.out.println("Monthly taxation: " + employee1.monthlyTaxation());
                System.out.println("Yearly taxation: " + employee1.yearlyTaxation());
                System.out.println("Yearly salary before taxation: " + employee1.grossYearlysalary());
                System.out.println("Years employed: " + employee1.yearsEmployed());
                System.out.println("Employed more than 5 years: " + employee1.employedLongerthan(5));
            } else if (menuInput == 0) {
                System.out.println("System exit");
                System.exit(0);
            } else {
                System.out.println("You have to press either 1, 2, 3 or 0.");
            }
        }
    }
}






